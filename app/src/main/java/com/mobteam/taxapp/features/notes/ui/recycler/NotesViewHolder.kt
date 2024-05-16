package com.mobteam.taxapp.features.notes.ui.recycler

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.mobteam.taxapp.databinding.ItemNoteBinding
import com.mobteam.taxapp.features.notes.ui.NoteClickedCallback

class NotesViewHolder(private val binding : ItemNoteBinding) : ViewHolder(binding.root) {

    fun bind(item : NoteItem , noteClickedCallback: NoteClickedCallback) {
        binding.noteImage.load(item.noteImage)
        binding.noteHeader.text = item.noteHeaderText
        binding.noteSubHead.text = item.noteSubHeadText
        binding.noteAuthorAvatar.setImageResource(item.authorAvatarImage)

        binding.root.setOnClickListener {
            noteClickedCallback.onNoteClicked(item.noteId)
        }
    }
}