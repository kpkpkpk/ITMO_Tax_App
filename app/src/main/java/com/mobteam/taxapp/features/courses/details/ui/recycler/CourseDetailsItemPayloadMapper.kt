package com.mobteam.taxapp.features.courses.details.ui.recycler

import ru.tinkoff.mobile.tech.ti_recycler.base.diff.PayloadMapper

internal class CourseDetailsItemPayloadMapper : PayloadMapper<CourseDetailsItem> {

    override fun invoke(oldItem: CourseDetailsItem, newItem: CourseDetailsItem): Any {
        return CourseDetailsItemPayload(
            isButtonTextChanged = oldItem.studyButtonText != newItem.studyButtonText
        )
    }
}
