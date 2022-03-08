package com.example.thecut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val registerButton : Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener{
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }

        val textView5 : TextView = findViewById(R.id.textView5)
        textView5.setOnClickListener{
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }

    }
}