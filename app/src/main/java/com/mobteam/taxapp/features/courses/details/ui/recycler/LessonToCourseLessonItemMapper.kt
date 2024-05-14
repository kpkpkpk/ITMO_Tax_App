package com.mobteam.taxapp.features.courses.details.ui.recycler

import com.mobteam.taxapp.domain.model.Lesson

class LessonToCourseLessonItemMapper {
    fun map(lesson: Lesson): CourseLessonItem {
        return CourseLessonItem(
            lessonPreviewImage = lesson.previewUrl,
            lessonName = lesson.name,
            lessonNumber = lesson.lessonNumber,
            lessonDuration = lesson.duration
        )
    }
}
