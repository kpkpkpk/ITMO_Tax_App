package com.mobteam.taxapp.features.lessons.ui.recycler

import android.view.View
import coil.load
import com.mobteam.taxapp.databinding.ItemLessonVideoPreviewBinding
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler.clicks.TiRecyclerClickListener

class LessonDetailsPreviewVideoItemViewHolder(view: View, clicks: TiRecyclerClickListener) :
    BaseViewHolder<LessonDetailsPreviewVideoItem>(view, clicks) {
    private val binding = ItemLessonVideoPreviewBinding.bind(view)
    override fun bind(item: LessonDetailsPreviewVideoItem) {
        super.bind(item)
        binding.videoPreview.load(item.previewVideoUrl)
    }
}
