package com.mobteam.taxapp.features.courses.feed.ui.recycler.factory

import com.mobteam.taxapp.domain.model.Course
import com.mobteam.taxapp.features.courses.feed.ui.recycler.CourseItem

class CoursesItemFactory {

    fun create(course: Course): CourseItem {
        return CourseItem(
            course = course,
            courseName = course.name,
            courseDescription = course.shortDescription,
            courseDuration = course.duration
        )
    }
}
