package com.mobteam.taxapp.features.terms.ui.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.mobteam.taxapp.databinding.ItemTermBinding
import com.mobteam.taxapp.features.terms.ui.TermClickedCallback

class TermsAdapter(
    private val termClickedCallback: TermClickedCallback
) : ListAdapter<TermItem, TermsViewHolder>(TermsDiffUtilCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TermsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTermBinding.inflate(inflater, parent, false)

        return TermsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TermsViewHolder, position: Int) {
        holder.bind(currentList[position], termClickedCallback)
    }
}