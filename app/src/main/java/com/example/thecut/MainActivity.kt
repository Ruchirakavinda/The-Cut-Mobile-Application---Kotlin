package com.example.thecut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //variables



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)

        //animations

        var topAnimation : Animation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        var bottomAnimation : Animation = AnimationUtils.loadAnimation( this,R.anim.bottom_animation)

        var logo : ImageView = findViewById(R.id.logo)
        var name : TextView = findViewById(R.id.name)
        var nsbm : TextView = findViewById(R.id.nsbm)

        logo.setAnimation(topAnimation)
        name.setAnimation(bottomAnimation)
        nsbm.setAnimation(bottomAnimation)
    }
}