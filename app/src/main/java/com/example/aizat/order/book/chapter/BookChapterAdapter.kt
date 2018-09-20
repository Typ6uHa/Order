package com.example.aizat.order.book.chapter

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.aizat.order.R
import com.example.aizat.order.book.model.Chapter

/**
 * Created by Aizat on 18.09.2018.
 */

class BookChapterAdapter(private val itemClickListener: (Chapter) -> Unit) : ListAdapter<Chapter, BookChapterAdapter.ViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_book_chapter, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Chapter>() {
            override fun areItemsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
                return oldItem::class == newItem::class
            }

            override fun areContentsTheSame(oldItem: Chapter?, newItem: Chapter?): Boolean {
                return oldItem == newItem
            }
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val chapter: TextView = itemView.findViewById(R.id.tvChapterCount)
        private val description: TextView = itemView.findViewById(R.id.tvChapterDescription)

        fun bind(item: Chapter) {
            chapter.text = item.chapterId.toString()
            description.text = item.chapterName
        }
    }
}