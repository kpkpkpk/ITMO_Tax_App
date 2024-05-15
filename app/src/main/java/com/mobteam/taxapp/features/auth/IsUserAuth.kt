package com.mobteam.taxapp.features.auth

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.onStart

object IsUserAuth {

    val flow = MutableStateFlow<Boolean>(
       false
    )
}
