package com.mobteam.taxapp.features.notes.ui.recycler

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mobteam.taxapp.databinding.ItemNoteBinding

class NotesViewHolder(private val binding : ItemNoteBinding) : ViewHolder(binding.root) {

    fun bind(item : NoteItem) {
        binding.noteImage.setImageResource(item.noteImage)
        binding.noteHeader.text = item.noteHeaderText
        binding.noteSubHead.text = item.noteSubHeadText
        binding.noteAuthorAvatar.setImageResource(item.authorAvatarImage)
    }
}