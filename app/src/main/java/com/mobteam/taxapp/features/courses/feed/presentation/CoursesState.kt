package com.mobteam.taxapp.features.courses.feed.presentation

import com.mobteam.taxapp.domain.model.Course
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter.ALL_COURSES

data class CoursesState(
    val courses: List<Course> = emptyList(),
    val coursesFiler: CoursesFilter = ALL_COURSES,
    val currentQuery: String? = null,
    val isLoading: Boolean = true
)
