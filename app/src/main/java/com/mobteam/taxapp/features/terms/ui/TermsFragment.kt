package com.mobteam.taxapp.features.terms.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentTermsBinding
import com.mobteam.taxapp.domain.TermsRepository
import com.mobteam.taxapp.domain.model.Term
import com.mobteam.taxapp.features.terms.presentation.TermsViewModel
import com.mobteam.taxapp.features.terms.presentation.TermsViewModelFactory
import com.mobteam.taxapp.features.terms.ui.recycler.TermsAdapter
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlin.LazyThreadSafetyMode.NONE

class TermsFragment : Fragment(R.layout.fragment_terms) {

    private val binding by viewBinding(FragmentTermsBinding::bind)

    private val viewModel : TermsViewModel by viewModels(
        factoryProducer = {
            TermsViewModelFactory(TermsRepository())
        }
    )

    private val termsAdapter : TermsAdapter by lazy(NONE) {
        TermsAdapter()
    }

    private val stateToUiStateMapper : TermsStateToUiStateMapper by lazy(NONE) {
        TermsStateToUiStateMapper()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initMenuClicks()
        initRecycler()

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.state.collectLatest { terms ->
                    render(terms)
                }
            }
        }
        viewModel.init()
    }

    private fun render(terms: List<Term>) {
        val uiItems = stateToUiStateMapper.mapToUiState(terms)
        termsAdapter.submitList(uiItems)
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
                            termsAdapter.submitList(
                                stateToUiStateMapper.mapToUiState(
                                    viewModel.state.value.filter { note ->
                                        note.termHeaderText.contains(
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
        binding.recycler.adapter = termsAdapter
    }

    companion object {

        fun newInstance(): TermsFragment {
            return TermsFragment()
        }
    }

}