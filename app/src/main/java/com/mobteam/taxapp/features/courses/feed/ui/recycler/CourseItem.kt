package com.mobteam.taxapp.features.courses.feed.ui.recycler

import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class CourseItem(
    val courseName: String,
    val courseDescription: String,
    val courseDuration: Int,
    override val uid: String = CourseItem::class.java.name,
    override val viewType: Int = R.layout.item_course
) : ViewTyped
