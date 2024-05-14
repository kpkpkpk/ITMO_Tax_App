package com.mobteam.taxapp.features.courses.details.ui.recycler

import android.view.View
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.ItemCourseDetailsBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler.clicks.TiRecyclerClickListener

class CourseDetailsItemViewHolder(
    view: View,
    clicks: TiRecyclerClickListener,
) : BaseViewHolder<CourseDetailsItem>(view, clicks) {
    private val binding = ItemCourseDetailsBinding.bind(view)

    override fun bind(item: CourseDetailsItem) {
        super.bind(item)
        binding.description.text = item.description
        binding.title.text = item.courseName
        binding.lessonsCount.text = binding.lessonsCount.resources.getQuantityString(
            R.plurals.lessons_count,
            item.courseLessonsCount
        )
        binding.studyButton.text = binding.studyButton.context.getString(item.studyButtonText)
    }

    override fun bind(item: CourseDetailsItem, payload: List<Any>) {
        super.bind(item, payload)
    }
}
