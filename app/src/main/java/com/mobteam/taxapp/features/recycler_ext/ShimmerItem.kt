package com.mobteam.taxapp.features.recycler_ext

import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class ShimmerItem(
    override val viewType: Int,
    override val uid: String="SHIMMER_ITEM_UID"
) : ViewTyped
