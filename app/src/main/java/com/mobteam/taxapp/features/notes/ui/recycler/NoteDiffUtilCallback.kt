package com.mobteam.taxapp.features.notes.ui.recycler

import androidx.recyclerview.widget.DiffUtil

class NoteDiffUtilCallback : DiffUtil.ItemCallback<NoteItem>() {
    override fun areItemsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean =
        oldItem.noteId == newItem.noteId


    override fun areContentsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean =
        oldItem == newItem
}