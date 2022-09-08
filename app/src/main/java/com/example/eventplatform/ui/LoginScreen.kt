package com.example.eventplatform.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eventplatform.R
import com.example.eventplatform.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {
    val loginbinding by lazy{
        ActivityLoginScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(loginbinding.root)
        supportActionBar?.hide()

        loginbinding.buttonsignIn.setOnClickListener{
            //toLogin()
            val intent= Intent(this, RegisterScreen::class.java)
            startActivity(intent)
        }
    }

    private fun toLogin() {
        val intent= Intent(this, RegisterScreen::class.java)
        startActivity(intent)
    }
}