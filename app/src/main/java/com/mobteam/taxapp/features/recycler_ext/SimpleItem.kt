package com.mobteam.taxapp.features.recycler_ext

import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class SimpleItem(
    override val viewType: Int,
    override val uid: String = "SIMPLE_ITEM_ID"
) : ViewTyped
