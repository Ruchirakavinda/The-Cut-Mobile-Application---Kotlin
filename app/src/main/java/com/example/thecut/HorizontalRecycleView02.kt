package com.example.thecut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HorizontalRecycleView02 ( private val itemlist : ArrayList<Item_ladies>) :RecyclerView.Adapter<HorizontalRecycleView02.MyViewHolder02>() {
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): HorizontalRecycleView02.MyViewHolder02 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_ladies,parent,false)
        return MyViewHolder02(view)
    }
    override fun onBindViewHolder(holder: HorizontalRecycleView02.MyViewHolder02, position: Int) {
        val currentItem = itemlist[position]
        holder.theme02.text = currentItem.theme02
    }
    override fun getItemCount(): Int {
        return itemlist.size
    }
    inner class MyViewHolder02(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var theme02: TextView = itemView.findViewById(R.id.theme02)
    }
}