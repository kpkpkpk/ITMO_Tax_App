package com.mobteam.taxapp.features.lessons.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.domain.model.Lesson
import com.mobteam.taxapp.features.lessons.ui.LessonDetailsUiState
import com.mobteam.taxapp.features.lessons.ui.recycler.LessonContentItemsFactory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class LessonDetailsViewModel(
    private val coursesRepository: CoursesRepository,
    private val lessonContentItemsFactory: LessonContentItemsFactory,
) : ViewModel() {

    private val _state = MutableStateFlow<Lesson?>(null)

    val state: Flow<LessonDetailsUiState>
        get() = _state.map {
            LessonDetailsUiState(
                uiItems = lessonContentItemsFactory.create(it),
                title = it?.name.orEmpty()
            )
        }

    fun init(lessonId: String = "") {
        viewModelScope.launch {
            val course = coursesRepository.getLessonById(lessonId)
            _state.value = course
        }
    }
}
