package com.mobteam.taxapp.domain.model

data class Question(
    val questionName: String,
    val answers: List<Answer> = emptyList(),
    val userAnswerId: Answer? = null,
    val correctAnswerId: String,
    val explanation: String
)
