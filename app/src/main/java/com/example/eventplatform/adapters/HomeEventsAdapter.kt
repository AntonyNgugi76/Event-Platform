package com.example.eventplatform.adapters

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.eventplatform.R
import com.example.eventplatform.dataclasses.Event
import com.example.eventplatform.ui.EventDetailsScreen

class HomeEventsAdapter(val eventArr: List<Event>):
    RecyclerView.Adapter<HomeEventsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeEventsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = eventArr[position]
        val activity = holder.itemView.context as Activity

        holder.eventname.text = currentItem.name
        holder.eventlocation.text = currentItem.location
        holder.evedate.text = currentItem.date

        holder.card.setOnClickListener{
            activity.startActivity(Intent(activity, EventDetailsScreen::class.java))
        }

    }

    override fun getItemCount(): Int {
        return eventArr.size
    }
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val eventname = itemView.findViewById<TextView>(R.id.evName)
        val eventlocation = itemView.findViewById<TextView>(R.id.evLocation)
        val evedate = itemView.findViewById<TextView>(R.id.evDate)
        val evImage = itemView.findViewById<ImageView>(R.id.appCompatImageView)
        val card = itemView.findViewById<ConstraintLayout>(R.id.constraint)

    }



}