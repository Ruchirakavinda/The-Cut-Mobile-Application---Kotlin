package com.example.thecut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter01( private val itemlist : ArrayList<Items>) :
    RecyclerView.Adapter<RecyclerAdapter01.NewViewHold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHold {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,
        parent, false)
        return NewViewHold(itemView)
    }

    override fun onBindViewHolder(holder: NewViewHold, position: Int) {
        val currentItem = itemlist[position]
        holder.title01.text = currentItem.title
        holder.name01.text = currentItem.name
        holder.contact01.text = currentItem.contact
        holder.date01.text = currentItem.date
        holder.time01.text = currentItem.time
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }


    class NewViewHold(itemView: View) : RecyclerView.ViewHolder(itemView){

        var title01 : TextView = itemView.findViewById(R.id.apTitle)
        var name01 : TextView = itemView.findViewById(R.id.name)
        var contact01 : TextView = itemView.findViewById(R.id.contact)
        var date01 : TextView = itemView.findViewById(R.id.date)
        var time01 : TextView = itemView.findViewById(R.id.time)

    }

}