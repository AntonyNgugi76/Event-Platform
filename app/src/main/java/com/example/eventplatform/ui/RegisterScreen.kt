package com.example.eventplatform.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eventplatform.R
import com.example.eventplatform.databinding.ActivityRegisterScreenBinding

class RegisterScreen : AppCompatActivity() {
    val activityRegisterBinding by lazy{
        ActivityRegisterScreenBinding.inflate(layoutInflater)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityRegisterBinding.root)
        supportActionBar?.hide()
        activityRegisterBinding.buttonSignup.setOnClickListener{
            toRegister()
        }
    }

    private fun toRegister(){
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}