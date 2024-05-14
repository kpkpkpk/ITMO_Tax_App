package com.mobteam.taxapp.features.courses.details.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.courses.details.ui.recycler.CoursePreviewDetailsItemFactory

class CourseDetailsViewModelFactory(
    private val coursesRepository: CoursesRepository,
    private val coursePreviewDetailsItemFactory: CoursePreviewDetailsItemFactory
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CourseDetailsViewModel(coursePreviewDetailsItemFactory, coursesRepository) as T
    }
}
