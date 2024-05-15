package com.mobteam.taxapp.features.notes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobteam.taxapp.domain.NotesRepository

class NotesViewModelFactory(
    private val notesRepository: NotesRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when(modelClass) {
            NotesViewModel::class.java -> NotesViewModel(notesRepository) as T
            NoteViewModel::class.java -> NoteViewModel(notesRepository) as T
            else -> throw IllegalArgumentException("UNKNOWN VIEW MODEL CLASS")
        }
    }
}