package com.example.thecut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val loginButton : Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener{
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }

        val textview3 : TextView = findViewById(R.id.textView3)
        textview3.setOnClickListener{
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }

        val facebook : Button = findViewById(R.id.buttonfb)
        facebook.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        val google : Button = findViewById(R.id.buttongl)
        google.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }



    }
}