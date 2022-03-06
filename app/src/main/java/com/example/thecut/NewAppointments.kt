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

    private lateinit var newRecyclerView02 : RecyclerView
    private lateinit var newArrayList02: ArrayList<Items02>
    lateinit var title02: Array<String>
    lateinit var name02: Array<String>
    lateinit var contact02: Array<String>
    lateinit var date02: Array<String>
    lateinit var time02: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_appointments)

        val toolbar : Toolbar = findViewById(R.id.toolbarNA)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }


        //Recycler View 02

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


        //Recycler View 02


        title02 = arrayOf(
            "Head Massage",
            "Hair Coloring",
            "Hair Trim",
            "Rebonding"
        )

        name02 = arrayOf(
            "John wyma",
            "Dani Daniel",
            "Sunny fernando",
            "Saman Kumara"
        )

        contact02 = arrayOf(
            "0775295695",
            "0782568957",
            "0785369852",
            "0756954696"
        )

        date02 = arrayOf(
            "07/25/2021",
            "08/06/2022",
            "15/12/2021",
            "11/11/2021"
        )

        time02 = arrayOf(
            "11.00 AM",
            "12.00 PM",
            "01.30 PM",
            "02.45 PM"
        )

        newRecyclerView02 = findViewById(R.id.recycler02)
        newRecyclerView02.layoutManager = LinearLayoutManager(this)
        newRecyclerView02.setHasFixedSize(true)

        newArrayList02 = arrayListOf()
        getUserData02()
    }

    private fun getUserData() {

        for(i in title.indices){

            val itemss = Items(title[i],name[i],contact[i],date[i],time[i])
            newArrayList.add(itemss)
        }

        newRecyclerView.adapter = RecyclerAdapter01(newArrayList)

        }



    private fun getUserData02() {

        for(i in title02.indices){

            val itemss02 = Items02(title02[i],name02[i],contact02[i],date02[i],time02[i])
            newArrayList02.add(itemss02)
        }

        newRecyclerView02.adapter = RecyclerAdapter02(newArrayList02)

    }
    }




