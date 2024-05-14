package com.mobteam.taxapp.features.lessons.ui.recycler

import com.mobteam.taxapp.R
import com.mobteam.taxapp.domain.model.Lesson
import com.mobteam.taxapp.features.recycler_ext.SimpleItem
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

class LessonContentItemsFactory {
    fun create(lesson: Lesson?): List<ViewTyped> {
        return if (lesson == null) {
            emptyList()
        } else {
            listOf(
                LessonDetailsPreviewVideoItem(lesson.previewUrl),
                LessonDetailsShortMetaInfoItem(
                    lessonNumber = lesson.lessonNumber,
                    lessonDuration = lesson.duration
                ),
                LessonDetailsCommonTextItem(lesson.text),
            )
        }
    }
}
