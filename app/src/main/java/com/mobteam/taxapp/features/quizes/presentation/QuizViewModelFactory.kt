package com.mobteam.taxapp.features.quizes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobteam.taxapp.domain.CoursesRepository

class QuizViewModelFactory(
    private val coursesRepository: CoursesRepository,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return QuizViewModel(coursesRepository) as T
    }
}
