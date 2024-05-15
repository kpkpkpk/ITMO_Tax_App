package com.mobteam.taxapp.features.quizes.presentation

import com.mobteam.taxapp.domain.model.Answer
import com.mobteam.taxapp.domain.model.Question

data class QuizState(
    val selectedAnswer: Answer? = null,
    val currentQuestion: Question? = null,
    val questions: List<Question> = emptyList()
)
