package com.project.jaycode.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.project.jaycode.MainActivity
import com.project.jaycode.R

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    fun password(view: View) {}
    fun login(view: View) {
        val intent =Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun sign_Up(view: View) {
        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
        finish()
    }
}