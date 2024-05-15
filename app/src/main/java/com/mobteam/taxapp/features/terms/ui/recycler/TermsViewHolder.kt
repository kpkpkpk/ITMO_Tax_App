package com.mobteam.taxapp.features.terms.ui.recycler

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mobteam.taxapp.databinding.ItemTermBinding

class TermsViewHolder(private val binding : ItemTermBinding) : ViewHolder(binding.root) {

    fun bind(item : TermItem) {
        binding.termHeader.text = item.termHeaderText
        binding.termSubHead.text = item.termSubHeadText
    }
}