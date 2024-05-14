package com.mobteam.taxapp.features.lessons.ui

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
import com.mobteam.taxapp.databinding.FragmentLessonDetailsBinding
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.lessons.presentation.LessonDetailsViewModel
import com.mobteam.taxapp.features.lessons.presentation.LessonDetailsViewModelFactory
import com.mobteam.taxapp.features.lessons.ui.recycler.LessonContentItemsFactory
import com.mobteam.taxapp.features.lessons.ui.recycler.LessonDetailsViewHolderFactory
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped
import ru.tinkoff.mobile.tech.ti_recycler_coroutines.TiRecyclerCoroutines

class LessonDetailsFragment : Fragment(R.layout.fragment_lesson_details) {

    companion object {
        private const val LESSON_ID = "LESSON_ID"
        fun newInstance(lessonId: String): LessonDetailsFragment {
            return LessonDetailsFragment().apply {
                arguments = bundleOf(LESSON_ID to lessonId)
            }
        }
    }

    private val lessonId: String by lazy(LazyThreadSafetyMode.NONE) {
        requireNotNull(arguments?.getString(LESSON_ID)) { "You should pass id in this fragment" }
    }
    private val binding by viewBinding(FragmentLessonDetailsBinding::bind)
    private var recycler: TiRecyclerCoroutines<ViewTyped>? = null

    private val viewModel: LessonDetailsViewModel by viewModels(
        factoryProducer = {
            LessonDetailsViewModelFactory(
                CoursesRepository(),
                LessonContentItemsFactory()
            )
        }
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        viewModel.init(lessonId)
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.state.collectLatest {
                    recycler?.setItems(it.uiItems)
                    binding.toolbar.title = it.title
                }
            }
        }
    }

    private fun initRecycler() {
        recycler = TiRecyclerCoroutines(binding.recycler, LessonDetailsViewHolderFactory())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recycler = null
    }
}
