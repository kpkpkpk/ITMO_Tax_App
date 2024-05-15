package com.mobteam.taxapp.features.courses.feed.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentCoursesBinding
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter.ALL_COURSES
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter.MY_COURSES
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesViewModel
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesViewModelFactory
import com.mobteam.taxapp.features.courses.feed.ui.recycler.CourseViewHolderFactory
import com.mobteam.taxapp.features.courses.feed.ui.recycler.factory.CoursesItemFactory
import com.mobteam.taxapp.features.courses.feed.ui.recycler.factory.CoursesShimmerFactory
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped
import ru.tinkoff.mobile.tech.ti_recycler_coroutines.TiRecyclerCoroutines

class CoursesFragment : Fragment(R.layout.fragment_courses) {
    private val binding by viewBinding(FragmentCoursesBinding::bind)
    private var recycler: TiRecyclerCoroutines<ViewTyped>? = null
    private val coursesViewModel: CoursesViewModel by viewModels(
        factoryProducer = {
            CoursesViewModelFactory(
                CoursesRepository(),
                CoursesUiStateMapper(
                    coursesItemFactory = CoursesItemFactory(),
                    coursesShimmerFactory = CoursesShimmerFactory()
                )
            )
        }
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        initChips()
//        initToolbar()
        coursesViewModel.init()
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                coursesViewModel.state.collectLatest {
                    render(it)
                }
            }
        }
    }

//    private fun initToolbar() {
//        binding.toolbar.addMenuProvider(SearchMenuProvider({}, object : OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean = false
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                return true
//            }
//
//        }))
//    } TODO ИСПРАВИТЬ

    private fun initChips() {
        binding.allCourses.setOnClickListener {
            coursesViewModel.changeFilter(ALL_COURSES)
        }
        binding.myCourses.setOnClickListener {
            coursesViewModel.changeFilter(MY_COURSES)
        }
    }

    private fun initRecycler() {
        recycler = TiRecyclerCoroutines(binding.recycler, CourseViewHolderFactory())
    }

    private fun render(uiState: CoursesUiState) {
        renderChips(uiState.coursesFilter)
//   TODO ИСПРАВИТЬ     binding.toolbar.menu.findItem(R.id.action_search).isVisible = uiState.isLoading.not()
        binding.chipGroupLayout.isVisible = uiState.isLoading.not()
        recycler?.setItems(uiState.uiItems)
    }

    private fun renderChips(coursesFilter: CoursesFilter) {
        val chipId = if (coursesFilter == ALL_COURSES) {
            binding.allCourses.id
        } else {
            binding.myCourses.id
        }
        binding.chipGroupLayout.check(chipId)
        binding.myCourses.isClickable = coursesFilter != MY_COURSES
        binding.allCourses.isClickable = coursesFilter != ALL_COURSES
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recycler = null
    }
}
