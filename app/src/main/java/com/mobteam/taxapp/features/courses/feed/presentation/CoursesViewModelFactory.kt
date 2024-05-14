package com.mobteam.taxapp.features.courses.feed.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.courses.feed.ui.CoursesUiStateMapper

class CoursesViewModelFactory(
    private val coursesRepository: CoursesRepository,
    private val coursesUiStateMapper: CoursesUiStateMapper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CoursesViewModel(coursesRepository, coursesUiStateMapper) as T
    }
}
