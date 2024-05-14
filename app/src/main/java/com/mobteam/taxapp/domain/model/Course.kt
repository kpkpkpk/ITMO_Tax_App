package com.mobteam.taxapp.domain.model


data class Course(
    val name: String,
    val shortDescription: String,
    val description: String,
    val duration: Int,
    val previewUrl: String,
    val lessons: List<Lesson> = emptyList(),
    val currentLessonId: String? = null,
    val isStarted: Boolean = false,
    val isFavourite: Boolean = false
)
