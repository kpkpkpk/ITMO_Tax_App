package com.mobteam.taxapp.features.lessons.ui.recycler

import android.view.View
import com.mobteam.taxapp.databinding.ItemLessonCommonTextBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder

class LessonDetailsCommonTextItemViewHolder(view: View) :
    BaseViewHolder<LessonDetailsCommonTextItem>(view) {
    private val binding = ItemLessonCommonTextBinding.bind(view)
    override fun bind(item: LessonDetailsCommonTextItem) {
        super.bind(item)
        binding.commonText.text = item.text
    }
}
