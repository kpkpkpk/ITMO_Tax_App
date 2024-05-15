package com.mobteam.taxapp.domain.model

import com.mobteam.taxapp.R

data class Note(
    val id : Int,
    val authorAvatarImage : Int = android.R.color.holo_purple,
    val noteHeaderText : String,
    val noteSubHeadText : String,
    val noteImage : Int = R.drawable.note_image,
    val content : String
)
