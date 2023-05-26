package com.example.part3_chapter3

import androidx.recyclerview.widget.RecyclerView
import com.example.part3_chapter3.databinding.ItemDetailBinding
import com.example.part3_chapter3.model.DetailItem

class DetailViewHolder(private val binding: ItemDetailBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: DetailItem) {
        binding.item = item
    }
}