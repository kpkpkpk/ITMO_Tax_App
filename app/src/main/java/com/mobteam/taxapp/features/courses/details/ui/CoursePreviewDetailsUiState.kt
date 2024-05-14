package com.mobteam.taxapp.features.courses.details.ui

import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class CoursePreviewDetailsUiState(
    val uiItems: List<ViewTyped> = emptyList(),
    val title: String = ""
)
