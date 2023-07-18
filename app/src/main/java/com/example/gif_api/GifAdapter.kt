package com.example.gif_api

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.provider.MediaStore.Video.Media
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.gif_api.Modal.GifModal
import com.example.gif_api.Modal.ResultsItem
import com.example.gif_api.databinding.ItemViewBinding
import retrofit2.http.Url

class GifAdapter : RecyclerView.Adapter<GifAdapter.GifHolder>() {


    lateinit var photos: ArrayList<ResultsItem>
    lateinit var context: Context

    class GifHolder(itemView: ItemViewBinding) : ViewHolder(itemView.root) {
        var binding = itemView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifHolder {
        context = parent.context
        var binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GifHolder(binding)
    }

    override fun getItemCount(): Int {

        return photos.size
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: GifHolder, position: Int) {

        holder.binding.apply {

            photos.get(position).media?.get(0)?.apply {

                Glide.with(context).load(gif?.url).into(imgGif)

            }
        }
    }

    fun setPhotos(photos: List<ResultsItem?>?) {


        this.photos = photos as ArrayList<ResultsItem>
    }
}