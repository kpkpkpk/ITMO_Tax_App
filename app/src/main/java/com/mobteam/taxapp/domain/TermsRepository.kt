package com.mobteam.taxapp.domain

import com.mobteam.taxapp.domain.model.Term

class TermsRepository {

    private val terms = listOf(
        Term(id = 1, termHeaderText = "Header 1", termSubHeadText ="Subheader 1"),
        Term(id = 2, termHeaderText = "Header 2", termSubHeadText ="Subheader 2"),
        Term(id = 3, termHeaderText = "Header 3", termSubHeadText ="Subheader 3"),
        Term(id = 4, termHeaderText = "Header 4", termSubHeadText ="Subheader 4"),
        Term(id = 5, termHeaderText = "Header 5", termSubHeadText ="Subheader 5"),
        Term(id = 6, termHeaderText = "Header 6", termSubHeadText ="Subheader 6"),
        Term(id = 7, termHeaderText = "Header 7", termSubHeadText ="Subheader 7"),
        Term(id = 8, termHeaderText = "Header 8", termSubHeadText ="Subheader 8"),
        Term(id = 9, termHeaderText = "Header 9", termSubHeadText ="Subheader 9"),
        Term(id = 10, termHeaderText = "Header 10", termSubHeadText = "Subheader 10")
    )

    fun getTerms() : List<Term> = terms
}