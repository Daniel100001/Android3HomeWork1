package com.example.android3homework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android3homework1.data.OneModel
import com.example.android3homework1.databinding.AnimeItemBinding

class OneFragmentAdapter(private val onItemClick: (dan: OneModel) -> Unit) :
    RecyclerView.Adapter<OneFragmentAdapter.OneViewHolder>() {

    private var list: List<OneModel> = ArrayList()

    fun setList(list: List<OneModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class OneViewHolder(private val binding: AnimeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(oneModel: OneModel) {
            binding.itemImage.let {
                Glide.with(it).load(oneModel.image).into(it)
            }
            binding.itemText.text = oneModel.text
        }

        init {
            itemView.setOnClickListener {
                onItemClick(list[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneViewHolder {
        return OneViewHolder(
            AnimeItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}