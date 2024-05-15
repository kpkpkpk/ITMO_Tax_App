package com.mobteam.taxapp.features.notes.ui.recycler

data class NoteItem(
    val noteId : Int,
    val authorAvatarImage : Int,
    val noteHeaderText : String,
    val noteSubHeadText : String,
    val noteImage : Int
)