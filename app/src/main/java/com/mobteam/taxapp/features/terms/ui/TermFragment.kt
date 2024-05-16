package com.mobteam.taxapp.features.terms.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentTermBinding
import com.mobteam.taxapp.domain.TermsRepository
import com.mobteam.taxapp.features.terms.presentation.TermViewModel
import com.mobteam.taxapp.features.terms.presentation.TermsViewModelFactory
import kotlin.LazyThreadSafetyMode.NONE


class TermFragment : Fragment(R.layout.fragment_term) {

    private val termId : Int by lazy(NONE) {
        requireArguments().getInt(TERM_ID)
    }

    private val viewModel : TermViewModel by viewModels(
        factoryProducer = {
            TermsViewModelFactory(TermsRepository())
        }
    )

    private val binding by viewBinding(FragmentTermBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val term = viewModel.loadTerm(termId)
        binding.term.text = term.termHeaderText
        binding.content.text = term.content
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
        binding.termImage.load(term.termImage)

    }

    companion object {

        const val TERM_ID = "TERM_ID"

        fun newInstance(termId : Int) : TermFragment {
            return TermFragment().apply {
                arguments = Bundle().apply {
                    putInt(TERM_ID, termId)
                }
            }
        }
    }
}