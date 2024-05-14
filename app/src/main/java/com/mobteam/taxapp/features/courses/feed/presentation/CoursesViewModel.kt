package com.mobteam.taxapp.features.courses.feed.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.courses.feed.ui.CoursesUiState
import com.mobteam.taxapp.features.courses.feed.ui.CoursesUiStateMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class CoursesViewModel(
    private val coursesRepository: CoursesRepository,
    private val coursesUiStateMapper: CoursesUiStateMapper
) : ViewModel() {


    private val _state = MutableStateFlow(CoursesState())
    val state: Flow<CoursesUiState>
        get() = _state.map { coursesUiStateMapper.map(it) }

    fun init() {
        viewModelScope.launch {
            val courses = coursesRepository.getAllCourses()
            _state.value = _state.value.copy(courses = courses, isLoading = false)
        }
    }

    fun changeFilter(coursesFilter: CoursesFilter) {
        _state.value = _state.value.copy(coursesFiler = coursesFilter)
    }
}
