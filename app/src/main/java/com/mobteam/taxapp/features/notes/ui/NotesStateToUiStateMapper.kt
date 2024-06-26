package com.mobteam.taxapp.features.notes.ui

import com.mobteam.taxapp.domain.model.Note
import com.mobteam.taxapp.features.notes.ui.recycler.NoteItem

class NotesStateToUiStateMapper {

    fun mapToUiState(notes: List<Note>): List<NoteItem> {

        return notes.map { note ->
            NoteItem(
                noteId = note.id,
                authorAvatarImage = note.authorAvatarImage,
                noteHeaderText = note.noteHeaderText,
                noteSubHeadText = note.noteSubHeadText,
                noteImage = note.noteImage
            )
        }
    }
}