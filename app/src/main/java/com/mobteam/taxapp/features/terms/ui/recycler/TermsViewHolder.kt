package com.mobteam.taxapp.features.terms.ui.recycler

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mobteam.taxapp.databinding.ItemTermBinding
import com.mobteam.taxapp.features.terms.ui.TermClickedCallback

class TermsViewHolder(private val binding : ItemTermBinding) : ViewHolder(binding.root) {

    fun bind(item : TermItem, onTermClickedCallback: TermClickedCallback) {
        binding.termHeader.text = item.termHeaderText
        binding.termSubHead.text = item.termSubHeadText

        binding.root.setOnClickListener {
            onTermClickedCallback.onTermClicked(item.id)
        }
    }
}