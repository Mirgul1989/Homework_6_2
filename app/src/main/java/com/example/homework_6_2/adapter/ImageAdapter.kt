package com.example.homework_6_2.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.homework_6_2.databinding.ItemImageBinding

class ImageAdapter(private val list: ArrayList<String>) : Adapter<ImageAdapter.ImageViewHolder>() {
    private val data = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(list[position])
    }
    fun addList(data: ArrayList<String>) {
        this.list.clear()
        this.list.addAll(data)
        notifyDataSetChanged()
    }

    fun getData(): ArrayList<String> {
        return data
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ImageViewHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo:String) {
            binding.img1.loadImage(photo)
            itemView.setOnClickListener {
                binding.img2.isVisible = true
                data.add(photo)
            }
        }
        private fun View.loadImage(url: String) {
            Glide.with(this).load(url).into(this as ImageView)
        }
    }
}