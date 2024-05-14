package com.mobteam.taxapp.features.courses.feed.ui

import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class CoursesUiState(
    val coursesFilter: CoursesFilter,
    val uiItems: List<ViewTyped>,
    val isLoading: Boolean
)
