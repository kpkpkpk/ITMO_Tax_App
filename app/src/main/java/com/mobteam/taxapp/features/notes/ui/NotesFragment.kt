package com.mobteam.taxapp.features.notes.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentNotesBinding
import com.mobteam.taxapp.domain.NotesRepository
import com.mobteam.taxapp.domain.model.Note
import com.mobteam.taxapp.features.notes.presentation.NotesViewModel
import com.mobteam.taxapp.features.notes.presentation.NotesViewModelFactory
import com.mobteam.taxapp.features.notes.ui.recycler.NotesAdapter
import com.mobteam.taxapp.features.terms.ui.TermFragment
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlin.LazyThreadSafetyMode.NONE


class NotesFragment : Fragment(R.layout.fragment_notes) {

    private val binding by viewBinding(FragmentNotesBinding::bind)
    private val viewModel: NotesViewModel by viewModels(
        factoryProducer = {
            NotesViewModelFactory(NotesRepository())
        }
    )
    private val notesStateToUiStateMapper: NotesStateToUiStateMapper by lazy(NONE) {
        NotesStateToUiStateMapper()
    }
    private val notesAdapter: NotesAdapter by lazy(NONE) {
        NotesAdapter(object : NoteClickedCallback {
            override fun onNoteClicked(noteId: Int) {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.container, NoteFragment.newInstance(noteId))
                    addToBackStack(null)
                }
            }
        })
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        initMenuClicks()
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.state.collectLatest { notes ->
                    render(notes)
                }
            }
        }
        viewModel.init()
    }

    private fun render(notes: List<Note>) {
        val uiItems = notesStateToUiStateMapper.mapToUiState(notes)
        notesAdapter.submitList(uiItems)
    }

    private fun initMenuClicks() {
        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.searchIcon -> {
                    (menuItem.actionView as SearchView).setOnQueryTextListener(object :
                        SearchView.OnQueryTextListener {

                        override fun onQueryTextSubmit(query: String?): Boolean {
                            return true
                        }

                        override fun onQueryTextChange(newText: String?): Boolean {
                            notesAdapter.submitList(
                                notesStateToUiStateMapper.mapToUiState(
                                    viewModel.state.value.filter { note ->
                                        note.noteHeaderText.contains(
                                            newText ?: "",
                                            ignoreCase = true
                                        )
                                    }
                                )
                            )
                            return true
                        }
                    })
                    true
                }

                else -> {
                    true
                }
            }
        }
    }

    private fun initRecycler() {
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = notesAdapter
    }

    companion object {

        fun newInstance(): NotesFragment {
            return NotesFragment()
        }
    }
}