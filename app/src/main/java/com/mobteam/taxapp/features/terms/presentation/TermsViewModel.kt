package com.mobteam.taxapp.features.terms.presentation

import androidx.lifecycle.ViewModel
import com.mobteam.taxapp.domain.TermsRepository
import com.mobteam.taxapp.domain.model.Term
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TermsViewModel(private val termsRepository : TermsRepository) : ViewModel() {

    private val _state = MutableStateFlow<List<Term>>(emptyList())
    val state = _state.asStateFlow()

    fun init() {
        _state.update { termsRepository.getTerms() }
    }
}