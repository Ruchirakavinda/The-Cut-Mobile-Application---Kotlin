package com.example.thecut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LandingPage : AppCompatActivity() {

    private lateinit var RecyclerView : RecyclerView
    private lateinit var ArrayList: ArrayList<Item>
    lateinit var theme: Array<String>

    private lateinit var RecyclerView02 : RecyclerView
    private lateinit var ArrayList02: ArrayList<Item_ladies>
    lateinit var theme02: Array<String>

    private lateinit var RecyclerView03 : RecyclerView
    private lateinit var ArrayList03: ArrayList<Item_EventsDressing>
    lateinit var theme03: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        //RecyclerView01

        theme = arrayOf(
            "Hair Cut",
            "Beard",
            "Massage",
            "Hair Cut",
            "Beard",
            "Massage",
            "Hair Cut"
        )
        RecyclerView = findViewById(R.id.recyclerView)
        RecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        RecyclerView.setHasFixedSize(true)

        ArrayList = arrayListOf()
        getUserData()
    }

    private fun getUserData() {

        for(i in theme.indices){

            val themess = Item(theme[i])
            ArrayList.add(themess)
        }

        RecyclerView.adapter = HorizontalRecycleView(ArrayList)

        //RecyclerView02


        theme02 = arrayOf(
            "Hair Cut",
            "Beard",
            "Massage",
            "Hair Cut",
            "Beard",
            "Massage",
            "Hair Cut"
        )
        RecyclerView02 = findViewById(R.id.recyclerView02)
        RecyclerView02.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        RecyclerView02.setHasFixedSize(true)

        ArrayList02 = arrayListOf()
        getUserData02()
    }

    private fun getUserData02() {

        for(i in theme02.indices){

            val themess02 = Item(theme02[i])
            ArrayList.add(themess02)
        }

        RecyclerView02.adapter = HorizontalRecycleView(ArrayList)


        //RecyclerView03


        theme03 = arrayOf(
            "Hair",
            "Beard",
            "Massage",
            "Hair Cut",
            "Beard",
            "Massage",
            "Hair Cut"
        )
        RecyclerView03 = findViewById(R.id.recyclerView03)
        RecyclerView03.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        RecyclerView03.setHasFixedSize(true)

        ArrayList03 = arrayListOf()
        getUserData03()
    }

    private fun getUserData03() {

        for(i in theme03.indices){

            val themess03 = Item(theme03[i])
            ArrayList.add(themess03)
        }

        RecyclerView03.adapter = HorizontalRecycleView(ArrayList)















    }

}