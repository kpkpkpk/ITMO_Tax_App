package com.mobteam.taxapp.features.terms.ui

import com.mobteam.taxapp.domain.model.Term
import com.mobteam.taxapp.features.terms.ui.recycler.TermItem

class TermsStateToUiStateMapper {

    fun mapToUiState(terms : List<Term>) : List<TermItem> {

        return terms.map { term ->
            TermItem(
                term.id,
                term.termHeaderText,
                term.termSubHeadText
            )
        }
    }
}