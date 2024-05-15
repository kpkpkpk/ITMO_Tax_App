package com.mobteam.taxapp.features.notes.presentation

import androidx.lifecycle.ViewModel
import com.mobteam.taxapp.domain.NotesRepository
import com.mobteam.taxapp.domain.model.Note

class NoteViewModel(private val repository: NotesRepository) : ViewModel() {

    fun loadNote(noteId : Int) : Note {
        return repository.getNoteById(noteId)
    }
}