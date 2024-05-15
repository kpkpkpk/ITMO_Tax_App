package com.mobteam.taxapp.features.notes.presentation

import androidx.lifecycle.ViewModel
import com.mobteam.taxapp.domain.NotesRepository
import com.mobteam.taxapp.domain.model.Note
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NotesViewModel(
    private val notesRepository: NotesRepository
) : ViewModel() {

    private val _state = MutableStateFlow<List<Note>>(emptyList())
    val state = _state.asStateFlow()

    fun init() {
        _state.update { notesRepository.getNotes() }
    }
}