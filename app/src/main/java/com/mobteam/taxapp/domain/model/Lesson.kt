package com.mobteam.taxapp.domain.model

data class Lesson(
    val name: String,
    val lessonNumber: Int,
    val duration: Int,
    val text: String,
    val previewUrl: String,
    val quiz: Quiz,
)
