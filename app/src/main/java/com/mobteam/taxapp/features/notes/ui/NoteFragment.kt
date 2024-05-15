package com.mobteam.taxapp.features.notes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentNoteBinding
import com.mobteam.taxapp.domain.NotesRepository
import com.mobteam.taxapp.features.notes.presentation.NoteViewModel
import com.mobteam.taxapp.features.notes.presentation.NotesViewModelFactory
import kotlin.LazyThreadSafetyMode.NONE


class NoteFragment : Fragment(R.layout.fragment_note) {

    private val binding by viewBinding(FragmentNoteBinding::bind)

    private val viewModel : NoteViewModel by viewModels(
        factoryProducer = {
            NotesViewModelFactory(NotesRepository())
        }
    )

    private val noteId : Int by lazy(NONE) {
        requireArguments().getInt(NOTE_ID)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val note = viewModel.loadNote(noteId)

        binding.content.text = note.content
        binding.noteHeader.text = note.noteHeaderText
        binding.noteSubHead.text = note.noteSubHeadText
        binding.noteAuthorAvatar.setImageResource(note.authorAvatarImage)

        binding.toolbar.setNavigationOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    companion object {

        const val NOTE_ID = "NOTE_ID"

        fun newInstance(noteId : Int) : NoteFragment {
            return NoteFragment().apply {
                arguments = Bundle().apply {
                    putInt(NOTE_ID, noteId)
                }
            }
        }
    }
}