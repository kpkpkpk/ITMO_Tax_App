package com.mobteam.taxapp.features.courses.details.ui.recycler

import androidx.annotation.StringRes
import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class CourseDetailsItem(
    val courseName: String,
    val courseImageUrl: String,
    val description: String,
    val courseLessonsCount: Int,
    @StringRes
    val studyButtonText: Int,
    override val viewType: Int = R.layout.item_course_details,
    override val uid: String = CourseDetailsItem::class.java.name
) : ViewTyped
