package com.example.thecut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class HorizontalRecycleView ( private val itemlist : ArrayList<Item>)
    :RecyclerView.Adapter<HorizontalRecycleView.MyViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemlist[position]
        holder.theme01.text = currentItem.theme

    }

    override fun getItemCount(): Int {
        return itemlist.size
    }
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var theme01 : TextView = itemView.findViewById(R.id.theme)



    }
}