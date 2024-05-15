package com.mobteam.taxapp.features.quizes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.domain.model.Answer
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class QuizViewModel(
    private val coursesRepository: CoursesRepository
) : ViewModel() {

    private val _state = MutableStateFlow(QuizState())

    val state: Flow<QuizState>
        get() = _state

    fun init() {
        viewModelScope.launch {
            val questions = coursesRepository.getQuestions()
            _state.value = QuizState(questions = questions, currentQuestion = questions.first())
        }
    }

    fun clickNext() {
        val currentQuestion = requireNotNull(_state.value.currentQuestion)
        _state.value = _state.value.copy(
            currentQuestion = _state.value.questions[_state.value.questions.indexOf(currentQuestion) + 1],
            selectedAnswer = null
        )
    }

    fun setAnswer(answer: Answer?) {
        _state.value = _state.value.copy(selectedAnswer = answer)
    }
}
