package com.mobteam.taxapp.features.courses.details.ui.recycler

import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class CourseLessonItem(
    val lessonPreviewImage: String,
    val lessonName: String,
    val lessonNumber: Int,
    val lessonDuration: Int,
    override val viewType: Int = R.layout.item_lesson,
    override val uid: String = CourseLessonItem::class.java.toString()
) : ViewTyped
