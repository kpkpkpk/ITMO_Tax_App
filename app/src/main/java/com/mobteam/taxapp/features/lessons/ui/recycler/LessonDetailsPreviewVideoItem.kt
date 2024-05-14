package com.mobteam.taxapp.features.lessons.ui.recycler

import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class LessonDetailsPreviewVideoItem(
    val previewVideoUrl: String,
    override val viewType: Int = R.layout.item_lesson_video_preview,
    override val uid: String = LessonDetailsPreviewVideoItem::class.java.toString()
) : ViewTyped
