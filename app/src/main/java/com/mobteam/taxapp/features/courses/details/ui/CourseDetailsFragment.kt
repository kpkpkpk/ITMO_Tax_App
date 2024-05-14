package com.mobteam.taxapp.features.courses.details.ui

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentCoursesDetailsBinding
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.courses.details.presentation.CourseDetailsViewModel
import com.mobteam.taxapp.features.courses.details.presentation.CourseDetailsViewModelFactory
import com.mobteam.taxapp.features.courses.details.ui.recycler.CourseDetailsViewHolderFactory
import com.mobteam.taxapp.features.courses.details.ui.recycler.CoursePreviewDetailsItem
import com.mobteam.taxapp.features.courses.details.ui.recycler.CoursePreviewDetailsItemFactory
import com.mobteam.taxapp.features.courses.details.ui.recycler.LessonToCourseLessonItemMapper
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.launch
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped
import ru.tinkoff.mobile.tech.ti_recycler_coroutines.TiRecyclerCoroutines

class CourseDetailsFragment : Fragment(R.layout.fragment_courses_details) {

    companion object {
        private const val COURSE_ID = "COURSE_ID"
        fun newInstance(courseId: String): CourseDetailsFragment {
            return CourseDetailsFragment().apply {
                arguments = bundleOf(COURSE_ID to courseId)
            }
        }
    }

    private val courseId: String by lazy(LazyThreadSafetyMode.NONE) {
        requireNotNull(arguments?.getString(COURSE_ID)) { "You should pass id in this fragment" }
    }
    private val binding by viewBinding(FragmentCoursesDetailsBinding::bind)

    private var recycler: TiRecyclerCoroutines<ViewTyped>? = null

    private val courseDetailsViewModel: CourseDetailsViewModel by viewModels(
        factoryProducer = {
            CourseDetailsViewModelFactory(
                CoursesRepository(),
                CoursePreviewDetailsItemFactory(LessonToCourseLessonItemMapper())
            )
        }
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        courseDetailsViewModel.init(courseId)
        initRecycler()
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                courseDetailsViewModel.state.collectLatest {
                    binding.toolbar.title = it.title
                    recycler?.setItems(it.uiItems)
                }
            }
        }
    }

    private fun initRecycler() {
        recycler = TiRecyclerCoroutines(binding.recycler, CourseDetailsViewHolderFactory())
        viewLifecycleOwner.lifecycleScope.launch {
            recycler?.clickedViewId<CoursePreviewDetailsItem>(
                viewType = R.layout.item_course_preview_details,
                viewId = R.id.studyButton
            )?.collectLatest {
                courseDetailsViewModel.startedButtonTapped()
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        recycler = null
    }
}
