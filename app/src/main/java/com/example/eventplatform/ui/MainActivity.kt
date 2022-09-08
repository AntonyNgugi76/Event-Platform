package com.example.eventplatform.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eventplatform.R
import com.example.eventplatform.adapters.HomeEventsAdapter
import com.example.eventplatform.databinding.ActivityMainBinding
import com.example.eventplatform.dataclasses.Event

class MainActivity : AppCompatActivity() {
    var fabVisible = false
    val activityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)
        //recyclerview
        recyclerHomedata()


        //fab
        activityMainBinding.floatingActionButton.setOnClickListener{
            if(!fabVisible){
                activityMainBinding.eventfAB.show()
                activityMainBinding.eventfAB.visibility= View.VISIBLE
                fabVisible=true

            }else
            {
                activityMainBinding.eventfAB.hide()
                activityMainBinding.eventfAB.visibility=View.GONE
                fabVisible=false
            }

        }
        activityMainBinding.eventfAB.setOnClickListener{
            val intent = Intent(this, AddEventScreen::class.java)
            startActivity(intent)
        }


    }

    private fun recyclerHomedata() {
        activityMainBinding.recyclerHome.setHasFixedSize(true)
        activityMainBinding.recyclerHome.layoutManager= LinearLayoutManager(this)

        val evname = "DevFest kenya 2022"
        val location= "USIU Africa"
        val date="10 December 2022"

        val data = ArrayList<Event>()

        data.add(Event(evname,location,date))
        data.add(Event("DroidConKe","ihub, Senteu Plaza","10 November 2022"))
        data.add(Event("DroidConKe","ihub, Senteu Plaza","10 November 2022"))
        data.add(Event(evname,location,date))
        data.add(Event(evname,location,date))
        data.add(Event(evname,location,date))
        data.add(Event(evname,location,date))

        activityMainBinding.recyclerHome.adapter= HomeEventsAdapter(data)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.attendedevents->
                Toast.makeText(this, "Attended Events Screen", Toast.LENGTH_SHORT).show()
            R.id.myevents->
                Toast.makeText(this, "My Events Screen", Toast.LENGTH_SHORT).show()
            R.id.logout->
                Toast.makeText(this, "Logged Out Successfully", Toast.LENGTH_SHORT).show()

        }

        return super.onOptionsItemSelected(item)
    }
}