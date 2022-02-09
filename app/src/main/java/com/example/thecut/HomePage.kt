package com.example.thecut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val button : Button = findViewById(R.id.view_details)
        button.setOnClickListener{
            val intent = Intent(this, ViewDetails::class.java)
            startActivity(intent)
        }
    }
}