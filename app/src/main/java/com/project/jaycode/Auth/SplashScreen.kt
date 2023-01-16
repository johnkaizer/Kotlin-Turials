package com.project.jaycode.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.jaycode.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val startBtn = findViewById<Button>(R.id.start_btn)
        startBtn.setOnClickListener{
             val intent =Intent(this, SignIn::class.java)
            startActivity(intent)
            finish()

        }
    }
}