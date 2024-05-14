package com.mobteam.taxapp.domain.model

data class Quiz(
    val questions: List<Question> = emptyList(),
    val currentQuestion: Question? = null
)
