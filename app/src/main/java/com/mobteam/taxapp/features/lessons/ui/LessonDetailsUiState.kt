package com.mobteam.taxapp.features.lessons.ui

import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class LessonDetailsUiState(
    val uiItems: List<ViewTyped> = emptyList(),
    val title: String = ""
)
