package com.mobteam.taxapp.features.courses.details.ui.recycler

import android.view.View
import com.mobteam.taxapp.R
import com.mobteam.taxapp.features.courses.feed.ui.recycler.CourseItemViewHolder
import com.mobteam.taxapp.features.recycler_ext.ShimmerItem
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler_coroutines.base.CoroutinesHolderFactory

class CourseDetailsViewHolderFactory : CoroutinesHolderFactory() {
    override fun createViewHolder(view: View, viewType: Int): BaseViewHolder<*>? {
        return when (viewType) {
            R.layout.item_course_preview_details -> CoursePreviewDetailsItemViewHolder(view, clicks)
            R.layout.item_lesson -> CourseLessonItemViewHolder(view, clicks)
            else -> null
        }
    }
}
