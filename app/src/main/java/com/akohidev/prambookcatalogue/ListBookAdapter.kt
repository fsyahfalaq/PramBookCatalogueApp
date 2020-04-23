package com.akohidev.prambookcatalogue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListBookAdapter(val listBooks: ArrayList<Book>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    private lateinit var  onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row_book, parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBooks[position]

        Glide.with(holder.itemView.context)
            .load(book.photo)
            .into(holder.imgPhoto)

        holder.tvTitle.text = book.title
        holder.tvRatingBar.rating = book.rating.toFloat()
        holder.tvIsbn.text = book.isbn

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listBooks[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listBooks.size

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvRatingBar: RatingBar = itemView.findViewById(R.id.rt_bar)
        var tvIsbn: TextView = itemView.findViewById(R.id.tv_item_ISBN)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Book)
    }


}