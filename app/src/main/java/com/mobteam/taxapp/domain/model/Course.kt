package com.mobteam.taxapp.domain.model


data class Course(
    val name: String,
    val shortDescription: String,
    val description: String,
    val duration: Int,
    val lessonsId: List<String>,
    val currentLessonId: String? = null,
    val isStarted: Boolean = false,
    val isFavourite: Boolean = false
)
