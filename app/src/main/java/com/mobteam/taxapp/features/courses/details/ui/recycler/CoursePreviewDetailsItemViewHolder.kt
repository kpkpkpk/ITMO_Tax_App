package com.mobteam.taxapp.features.courses.details.ui.recycler

import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.core.view.marginTop
import coil.load
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.ItemCoursePreviewDetailsBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler.clicks.TiRecyclerClickListener

class CoursePreviewDetailsItemViewHolder(
    view: View,
    private val clicks: TiRecyclerClickListener,
) : BaseViewHolder<CoursePreviewDetailsItem>(view, clicks) {
    private val binding = ItemCoursePreviewDetailsBinding.bind(view)

    init {
        clicks.accept(binding.studyButton, this)
    }

    override fun bind(item: CoursePreviewDetailsItem) {
        super.bind(item)
        binding.courseImage.load(item.courseImageUrl)
        binding.description.text = item.description
        binding.title.text = item.courseName
        binding.lessonsCount.text = binding.lessonsCount.resources.getQuantityString(
            R.plurals.lessons_count,
            item.courseLessonsCount,
            item.courseLessonsCount,
        )
        binding.studyButton.text = binding.studyButton.context.getString(item.studyButtonText)
        binding.studyButton.isVisible = item.isStudyButtonVisible
    }

}
