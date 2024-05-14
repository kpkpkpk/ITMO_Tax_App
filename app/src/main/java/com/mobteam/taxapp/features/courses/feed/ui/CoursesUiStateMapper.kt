package com.mobteam.taxapp.features.courses.feed.ui

import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesFilter.MY_COURSES
import com.mobteam.taxapp.features.courses.feed.presentation.CoursesState
import com.mobteam.taxapp.features.courses.feed.ui.recycler.factory.CoursesItemFactory
import com.mobteam.taxapp.features.courses.feed.ui.recycler.factory.CoursesShimmerFactory
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

class CoursesUiStateMapper(
    private val coursesItemFactory: CoursesItemFactory,
    private val coursesShimmerFactory: CoursesShimmerFactory
) {

    fun map(state: CoursesState): CoursesUiState {
        return CoursesUiState(
            coursesFilter = state.coursesFiler,
            uiItems = getUiItems(state),
            isLoading = state.isLoading
        )
    }

    private fun getUiItems(state: CoursesState): List<ViewTyped> {
        return if (state.courses.isEmpty()) {
            coursesShimmerFactory.create()
        } else {
            state.courses.filter { course ->
                if (state.coursesFiler == MY_COURSES) {
                    course.isStarted
                } else {
                    true
                }
            }.map(coursesItemFactory::create)
        }
    }
}
