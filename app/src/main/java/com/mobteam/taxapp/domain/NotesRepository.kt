package com.mobteam.taxapp.domain

import com.mobteam.taxapp.domain.model.Note

class NotesRepository {

    private val notes = listOf(
        Note(id = 1, noteHeaderText = "Header 1", noteSubHeadText = "Subheader 1"),
        Note(id = 2, noteHeaderText = "Header 2", noteSubHeadText = "Subheader 2"),
        Note(id = 3, noteHeaderText = "Header 3", noteSubHeadText = "Subheader 3"),
        Note(id = 4, noteHeaderText = "Header 4", noteSubHeadText = "Subheader 4"),
        Note(id = 5, noteHeaderText = "Header 5", noteSubHeadText = "Subheader 5"),
        Note(id = 6, noteHeaderText = "Header 6", noteSubHeadText = "Subheader 6"),
        Note(id = 7, noteHeaderText = "Header 7", noteSubHeadText = "Subheader 7"),
        Note(id = 8, noteHeaderText = "Header 8", noteSubHeadText = "Subheader 8"),
        Note(id = 9, noteHeaderText = "Header 9", noteSubHeadText = "Subheader 9"),
        Note(id = 10, noteHeaderText = "Header 10", noteSubHeadText = "Subheader 10")
    )

    fun getNotes() : List<Note> = notes
}