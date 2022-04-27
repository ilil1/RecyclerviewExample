package com.project.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.myapplication.clear
import com.project.myapplication.load

class RecyclerAdapter(private val items: ArrayList<Model>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title : TextView = itemView.findViewById(R.id.titleText)
        val content : TextView = itemView.findViewById(R.id.contentText)
        val thumbnail : ImageView = itemView.findViewById(R.id.thumbnail)

        fun bind(item: Model) {
            thumbnail.clear()
            title.text = item.title
            content.text = item.content
            thumbnail.load(item.imageurl, 16f)
        }
    }

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.board_list, parent, false)
        return RecyclerAdapter.ViewHolder(View)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}