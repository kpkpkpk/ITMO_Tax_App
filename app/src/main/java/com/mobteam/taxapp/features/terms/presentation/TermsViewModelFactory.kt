package com.mobteam.taxapp.features.terms.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobteam.taxapp.domain.TermsRepository

class TermsViewModelFactory(
    private val termsRepository: TermsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TermsViewModel(termsRepository) as T
    }
}