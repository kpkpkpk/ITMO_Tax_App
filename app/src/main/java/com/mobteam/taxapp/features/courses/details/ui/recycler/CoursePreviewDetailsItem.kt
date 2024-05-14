package com.mobteam.taxapp.features.courses.details.ui.recycler

import androidx.annotation.StringRes
import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class CoursePreviewDetailsItem(
    val courseName: String,
    val courseImageUrl: String,
    val description: String,
    val courseLessonsCount: Int,
    @StringRes
    val studyButtonText: Int,
    val isStudyButtonVisible: Boolean,
    override val viewType: Int = R.layout.item_course_preview_details,
    override val uid: String = CoursePreviewDetailsItem::class.java.name
) : ViewTyped
