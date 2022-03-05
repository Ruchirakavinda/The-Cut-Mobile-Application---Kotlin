package com.example.thecut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewAppointments : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList: ArrayList<Items>
    lateinit var title: Array<String>
    lateinit var name: Array<String>
    lateinit var contact: Array<String>
    lateinit var date: Array<String>
    lateinit var time: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_appointments)

        val toolbar : Toolbar = findViewById(R.id.toolbarNA)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }

        title = arrayOf(
            "Full Body Massage",
            "Hair Cut",
            "Hair Trim",
            "Rebonding"
        )

        name = arrayOf(
            "John sina",
            "Dani Daniel",
            "Sunny fernando",
            "Saman Kumara"
        )

        contact = arrayOf(
            "0715295695",
            "0782568957",
            "0785369852",
            "0756954696"
        )

        date = arrayOf(
            "02/25/2021",
            "08/06/2022",
            "15/12/2021",
            "11/11/2021"
        )

        time = arrayOf(
            "10.00 AM",
            "12.00 PM",
            "01.30 PM",
            "02.45 PM"
        )

        newRecyclerView = findViewById(R.id.recycler01)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserData()
    }

    private fun getUserData() {

        for(i in title.indices){

            val itemss = Items(title[i],name[i],contact[i],date[i],time[i])
            newArrayList.add(itemss)
        }

        newRecyclerView.adapter = RecyclerAdapter01(newArrayList)

        }
    }
