package com.mobteam.taxapp.features.terms.ui.recycler

import androidx.recyclerview.widget.DiffUtil

class TermsDiffUtilCallback : DiffUtil.ItemCallback<TermItem>() {
    override fun areItemsTheSame(oldItem: TermItem, newItem: TermItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: TermItem, newItem: TermItem): Boolean {
        return oldItem == newItem
    }
}