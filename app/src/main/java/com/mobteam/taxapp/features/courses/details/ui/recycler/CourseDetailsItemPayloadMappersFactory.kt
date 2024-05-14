package com.mobteam.taxapp.features.courses.details.ui.recycler

import androidx.collection.SparseArrayCompat
import com.mobteam.taxapp.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped
import ru.tinkoff.mobile.tech.ti_recycler.base.diff.PayloadMapper

class CourseDetailsItemPayloadMappersFactory {

    fun create(): SparseArrayCompat<PayloadMapper<ViewTyped>> {
        return SparseArrayCompat<PayloadMapper<ViewTyped>>().apply {
            put(
                R.layout.item_course_details,
                CourseDetailsItemPayloadMapper() as PayloadMapper<ViewTyped>
            )
        }
    }
}
