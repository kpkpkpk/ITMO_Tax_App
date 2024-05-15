package com.mobteam.taxapp.domain

import com.mobteam.taxapp.domain.model.Answer
import com.mobteam.taxapp.domain.model.Course
import com.mobteam.taxapp.domain.model.Lesson
import com.mobteam.taxapp.domain.model.Question
import com.mobteam.taxapp.domain.model.Quiz
import kotlinx.coroutines.delay

class CoursesRepository {


    suspend fun getAllCourses(): List<Course> {
        delay(1000L)
        return listOf(
            Courses.course
        )
    }

    suspend fun getCourseDetails(courseId: String): Course {
        return Courses.course
    }

    suspend fun setStartedCourse() {
        Courses.course = Courses.course.copy(isStarted = true)
    }

    fun getLessonById(lessonId: String): Lesson {
        return Courses.course.lessons.first()
    }

    fun getQuestions(): List<Question> {
        return Courses.course.lessons.first().quiz.questions
    }

    fun setPassedQuiz() {
        Courses.course = Courses.course.copy(lessons = Courses.course.lessons.map {
            if (it.lessonNumber == 1) {
                it.copy(quiz = Courses.course.lessons.first().quiz.copy(currentQuestion = Courses.course.lessons.first().quiz.questions.last()))
            } else {
                it
            }
        })
    }
}
