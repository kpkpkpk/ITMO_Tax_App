package com.mobteam.taxapp.domain.model

import com.mobteam.taxapp.R

data class Note(
    val id : Int,
    val authorAvatarImage : Int = android.R.color.holo_purple,
    val noteHeaderText : String,
    val noteSubHeadText : String,
    val noteImage : String = "",
    val content : String
)
