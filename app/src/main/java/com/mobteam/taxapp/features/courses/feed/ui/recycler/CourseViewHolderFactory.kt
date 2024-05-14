package com.mobteam.taxapp.features.courses.feed.ui.recycler

import android.view.View
import com.mobteam.taxapp.R
import com.mobteam.taxapp.features.recycler_ext.ShimmerItem
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped
import ru.tinkoff.mobile.tech.ti_recycler_coroutines.base.CoroutinesHolderFactory

class CourseViewHolderFactory : CoroutinesHolderFactory() {
    override fun createViewHolder(view: View, viewType: Int): BaseViewHolder<*>? {
        return when (viewType) {
            R.layout.item_course -> CourseItemViewHolder(view, clicks)
            R.layout.items_course_shimmer,
            R.layout.item_chips_shimmer -> {
                BaseViewHolder<ShimmerItem>(view)
            }

            else -> null
        }
    }
}
