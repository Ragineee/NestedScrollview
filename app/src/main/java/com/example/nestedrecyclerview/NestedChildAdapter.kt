package com.example.nestedrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.nestedchildmain.view.*

class NestedChildAdapter(val context: Context, val layoutPosition: Int) :
    RecyclerView.Adapter<NestedChildAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.nestedchildmain, parent, false)
        return MyViewHolder(view)


    }

    override fun getItemCount(): Int = 6

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setData()

    }
    inner class  MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData() {
            itemView.name.text="sanajlk"

        }

    }
}