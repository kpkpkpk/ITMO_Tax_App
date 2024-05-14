package com.mobteam.taxapp.features.courses.details.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.domain.model.Course
import com.mobteam.taxapp.features.courses.details.ui.CoursePreviewDetailsUiState
import com.mobteam.taxapp.features.courses.details.ui.recycler.CoursePreviewDetailsItemFactory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class CourseDetailsViewModel(
    private val coursePreviewDetailsItemFactory: CoursePreviewDetailsItemFactory,
    private val coursesRepository: CoursesRepository,
) : ViewModel() {

    private val _state = MutableStateFlow<Course?>(null)

    val state: Flow<CoursePreviewDetailsUiState>
        get() = _state.map {
            CoursePreviewDetailsUiState(
                uiItems = coursePreviewDetailsItemFactory.create(it),
                title = it?.name.orEmpty()
            )
        }

    fun init(courseId: String) {
        viewModelScope.launch {
            val course = coursesRepository.getCourseDetails(courseId)
            _state.value = course
        }
    }

    fun startedButtonTapped() {
        viewModelScope.launch {
            coursesRepository.setStartedCourse()
            _state.value = _state.value?.copy(isStarted = true)
        }
    }
}
