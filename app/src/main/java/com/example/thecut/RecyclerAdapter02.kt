package com.example.thecut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter02(private val itemlist02 : ArrayList<Items02>) :
    RecyclerView.Adapter<RecyclerAdapter02.NewViewHold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHold {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout02,
        parent, false)
        return NewViewHold(itemView)
    }

    override fun onBindViewHolder(holder: NewViewHold, position: Int) {
        val currentItem = itemlist02[position]
        holder.title01.text = currentItem.title02
        holder.name01.text = currentItem.name02
        holder.contact01.text = currentItem.contact02
        holder.date01.text = currentItem.date02
        holder.time01.text = currentItem.time02
    }

    override fun getItemCount(): Int {
        return itemlist02.size
    }


    class NewViewHold(itemView: View) : RecyclerView.ViewHolder(itemView){

        var title01 : TextView = itemView.findViewById(R.id.apTitle_2)
        var name01 : TextView = itemView.findViewById(R.id.name_2)
        var contact01 : TextView = itemView.findViewById(R.id.contact_2)
        var date01 : TextView = itemView.findViewById(R.id.date_2)
        var time01 : TextView = itemView.findViewById(R.id.time_2)

    }

}