package com.mobteam.taxapp.features.lessons.ui.recycler

import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class LessonDetailsCommonTextItem(
    val text: String,
    override val viewType: Int = R.layout.item_lesson_common_text,
    override val uid: String = LessonDetailsCommonTextItem::class.java.toString()
) : ViewTyped
