package com.mobteam.taxapp.features.lessons.ui.recycler

import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class LessonDetailsShortMetaInfoItem(
    val lessonNumber: Int,
    val lessonDuration: Int,
    override val viewType: Int = R.layout.item_lesson_details_short_meta_info,
    override val uid: String = LessonDetailsShortMetaInfoItem::class.java.toString()
) : ViewTyped
