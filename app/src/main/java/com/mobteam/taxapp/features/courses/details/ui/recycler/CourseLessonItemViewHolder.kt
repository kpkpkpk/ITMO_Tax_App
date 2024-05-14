package com.mobteam.taxapp.features.courses.details.ui.recycler

import android.view.View
import coil.load
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.ItemLessonBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler.clicks.TiRecyclerClickListener

class CourseLessonItemViewHolder(
    view: View,
    clicks: TiRecyclerClickListener
) : BaseViewHolder<CourseLessonItem>(view, clicks) {
    private val binding = ItemLessonBinding.bind(view)
    override fun bind(item: CourseLessonItem) {
        super.bind(item)
        binding.lessonName.text = item.lessonName
        binding.lessonPreviewImage.load(item.lessonPreviewImage)
        binding.lessonNumber.text = binding.lessonNumber.resources.getString(
            R.string.lesson_number,
            item.lessonNumber
        )
        binding.lessonDuration.text = binding.lessonDuration.resources.getString(
            R.string.duration_text,
            item.lessonDuration
        )

    }
}
