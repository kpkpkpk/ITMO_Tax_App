package com.mobteam.taxapp.features.terms.presentation

import androidx.lifecycle.ViewModel
import com.mobteam.taxapp.domain.TermsRepository
import com.mobteam.taxapp.domain.model.Term

class TermViewModel(private val repository: TermsRepository) : ViewModel() {

    fun loadTerm(termId : Int) : Term {
        return repository.getTermById(termId)
    }
}