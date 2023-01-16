package com.project.jaycode.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.project.jaycode.MainActivity
import com.project.jaycode.R

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun password(view: View) {}
    fun signupBtn(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun signIn(view: View) {
        val intent =Intent(this, SignIn::class.java)
        startActivity(intent)
        finish()
    }
}