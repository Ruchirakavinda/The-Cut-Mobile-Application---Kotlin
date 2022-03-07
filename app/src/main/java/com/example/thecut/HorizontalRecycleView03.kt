package com.example.thecut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HorizontalRecycleView03 ( private val itemlist03 : ArrayList<Item_EventsDressing>) : RecyclerView.Adapter<HorizontalRecycleView03.MyViewHolder03>() {
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): HorizontalRecycleView03.MyViewHolder03 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_event_dressing,parent,false)
        return MyViewHolder03(view)
    }

    override fun onBindViewHolder(holder: HorizontalRecycleView03.MyViewHolder03, position: Int) {
        val currentItem = itemlist03[position]
        holder.theme04.text = currentItem.theme03

        }

    override fun getItemCount(): Int {
        return itemlist03.size

    }

    inner class MyViewHolder03(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var theme04: TextView = itemView.findViewById(R.id.theme03)
    }
}