package com.mobteam.taxapp.domain.model

data class Term(
    val id : Int,
    val termHeaderText : String,
    val termSubHeadText : String,
    val termImage : String = "",
    val content : String
)
