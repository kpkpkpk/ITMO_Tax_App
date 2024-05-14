package com.mobteam.taxapp.features.courses.feed.ui.recycler

import android.view.View
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.ItemCourseBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler.clicks.TiRecyclerClickListener

class CourseItemViewHolder(
    view: View,
    clicks: TiRecyclerClickListener
) : BaseViewHolder<CourseItem>(view, clicks) {
    private val binding = ItemCourseBinding.bind(view)
    override fun bind(item: CourseItem) {
        with(binding) {
            courseName.text = item.courseName
            courseDescription.text = item.courseDescription
            courseDuration.text = courseDuration.context.getString(
                R.string.duration_text,
                item.courseDuration
            )
        }
        super.bind(item)
    }
}
