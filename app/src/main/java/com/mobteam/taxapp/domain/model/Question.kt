package com.mobteam.taxapp.domain.model

data class Question(
    val questionName: String,
    val answers: List<Answer> = emptyList(),
    val userAnswerId: Answer? = null,
    val imageUrl: String = "",
    val correctAnswerId: String,
    val positiveMessage: String,
    val negativeMessage: String
)
