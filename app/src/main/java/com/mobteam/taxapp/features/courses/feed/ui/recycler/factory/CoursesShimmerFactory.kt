package com.mobteam.taxapp.features.courses.feed.ui.recycler.factory

import com.mobteam.taxapp.R
import com.mobteam.taxapp.features.recycler_ext.ShimmerItem

class CoursesShimmerFactory {

    fun create(): List<ShimmerItem> {
        return listOf(
            ShimmerItem(viewType = R.layout.item_chips_shimmer),
            ShimmerItem(viewType = R.layout.items_course_shimmer),
            ShimmerItem(viewType = R.layout.items_course_shimmer),
            ShimmerItem(viewType = R.layout.items_course_shimmer)
        )
    }
}
