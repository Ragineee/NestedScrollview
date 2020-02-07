package com.example.nestedrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.child_main.view.*

class MainChildAdapter(val context: Context) :
    RecyclerView.Adapter<MainChildAdapter.MainviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MainviewHolder {

        val view: View =
            LayoutInflater.from(context).inflate(R.layout.child_main, parent, false)
        return MainviewHolder(view)

    }

    override fun getItemCount(): Int =10
    override fun onBindViewHolder(holder: MainviewHolder, p1: Int) {
        holder.setData()

    }
    inner class MainviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData() {
            val nestedAdapter = NestedChildAdapter(context = context,
                layoutPosition = layoutPosition
            )
            itemView.mainrv.layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.HORIZONTAL,false)
            itemView.mainrv.adapter = nestedAdapter

            itemView.text_title.text="Song List"
            itemView.more.text="More"
        }
    }
}