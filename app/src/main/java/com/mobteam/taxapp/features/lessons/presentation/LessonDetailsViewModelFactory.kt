package com.mobteam.taxapp.features.lessons.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobteam.taxapp.domain.CoursesRepository
import com.mobteam.taxapp.features.lessons.ui.recycler.LessonContentItemsFactory

class LessonDetailsViewModelFactory(
    private val coursesRepository: CoursesRepository,
    private val lessonContentItemsFactory: LessonContentItemsFactory
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LessonDetailsViewModel(coursesRepository,lessonContentItemsFactory) as T
    }
}
