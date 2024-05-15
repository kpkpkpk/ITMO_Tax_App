package com.mobteam.taxapp.features.auth

import kotlinx.coroutines.flow.MutableStateFlow

object IsUserAuth {

    val flow = MutableStateFlow<Boolean>(
       false
    )
}
