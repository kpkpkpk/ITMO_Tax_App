package com.mobteam.taxapp.features.lessons.ui.recycler

import android.view.View
import com.mobteam.taxapp.R
import com.mobteam.taxapp.features.recycler_ext.SimpleItem
import ru.tinkoff.mobile.tech.ti_recycler.base.BaseViewHolder
import ru.tinkoff.mobile.tech.ti_recycler_coroutines.base.CoroutinesHolderFactory
import com.mobteam.taxapp.features.lessons.ui.recycler.LessonDetailsPreviewVideoItemViewHolder as VideoPreviewHolder
import com.mobteam.taxapp.features.lessons.ui.recycler.LessonDetailsShortMetaInfoItemViewHolder as ShortMetaInfoViewHolder

class LessonDetailsViewHolderFactory : CoroutinesHolderFactory() {
    override fun createViewHolder(view: View, viewType: Int): BaseViewHolder<*>? {
        return when (viewType) {
            R.layout.item_lesson_video_preview -> VideoPreviewHolder(view, clicks)
            R.layout.item_lesson_common_text -> LessonDetailsCommonTextItemViewHolder(view)
            R.layout.item_lesson_details_short_meta_info -> ShortMetaInfoViewHolder(view)
            else -> null
        }
    }
}
