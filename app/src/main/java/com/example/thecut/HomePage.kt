package com.example.thecut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val button01 : Button = findViewById(R.id.view_details)
        val button02 : Button = findViewById(R.id.new_appointments)
        button01.setOnClickListener{
            val intent = Intent(this, ViewDetails::class.java)
            startActivity(intent)
        }

        button02.setOnClickListener{
            val intent = Intent(this, NewAppointments::class.java)
            startActivity(intent)
        }
    }
}