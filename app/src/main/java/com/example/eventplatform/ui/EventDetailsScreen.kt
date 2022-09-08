package com.example.eventplatform.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eventplatform.R
import com.example.eventplatform.databinding.ActivityEventDetailsScreenBinding

class EventDetailsScreen : AppCompatActivity() {
    val eventsbinding by lazy{
        ActivityEventDetailsScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(eventsbinding.root)

        supportActionBar?.hide()
        eventsbinding.eventNameText.text="DevFest Kenya 2022"
        eventsbinding.locationText.text="USIU Africa, Kenya"
        eventsbinding.eventDateText.text="10th December 2022"



    }
}