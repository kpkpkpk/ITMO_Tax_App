package com.mobteam.taxapp.features.lessons.ui.recycler

import android.view.View
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.ItemLessonDetailsShortMetaInfoBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder

class LessonDetailsShortMetaInfoItemViewHolder(
    view: View
) : BaseViewHolder<LessonDetailsShortMetaInfoItem>(view) {

    private val binding = ItemLessonDetailsShortMetaInfoBinding.bind(view)
    override fun bind(item: LessonDetailsShortMetaInfoItem) {
        super.bind(item)
        binding.lessonDuration.text = binding.root.resources.getString(
            R.string.duration_text,
            item.lessonDuration
        )
        binding.lessonNumber.text = binding.root.resources.getString(
            R.string.lesson_number,
            item.lessonNumber
        )
    }
}
