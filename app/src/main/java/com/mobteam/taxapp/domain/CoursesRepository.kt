package com.mobteam.taxapp.domain

import com.mobteam.taxapp.domain.model.Course
import kotlinx.coroutines.delay

class CoursesRepository {

    suspend fun getAllCourses(): List<Course> {
        delay(5000L)
        return listOf(
            Course(
                name = "Налоговый вычет",
                shortDescription = "Узнайте что это и как его подавать",
                description = "На этом курсе вы узнаете: что такое налоговый вычет, зачем он нужен и на каких условиях его можно сделать",
                duration = 30,
                lessonsId = listOf("0", "1", "2"),
                isStarted = false,
                isFavourite = false
            )
        )
    }
}
