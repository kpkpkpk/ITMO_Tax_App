package com.mobteam.taxapp.features.courses.details.ui.recycler

import com.mobteam.taxapp.R
import com.mobteam.taxapp.domain.model.Course
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

class CoursePreviewDetailsItemFactory(
    private val lessonMapper: LessonToCourseLessonItemMapper
) {

    fun create(course: Course?): List<ViewTyped> {
        return course?.let {
            listOf(
                CoursePreviewDetailsItem(
                    courseName = course.name,
                    courseImageUrl = course.previewUrl,
                    courseLessonsCount = course.lessons.size,
                    studyButtonText = R.string.study_button_text,
                    description = course.description,
                    isStudyButtonVisible = course.isStarted.not()
                )
            ) + course.lessons.map(lessonMapper::map)
        } ?: emptyList()
    }
}
