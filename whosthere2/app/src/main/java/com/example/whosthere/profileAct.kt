package com.example.whosthere

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class profileAct: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_page)
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.contactsB -> {
                    navBarButton(0)
                    // Respond to navigation item 1 click
                    true
                }
                R.id.profileB -> {
                    // Respond to navigation item 2 click
                    true
                }
                R.id.searchB -> {
                    navBarButton(2)
                    // Respond to navigation item 1 click
                    true
                }
                R.id.settingsB -> {
                    navBarButton(3)
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }
    fun navBarButton(int:Int){
        //0->contacts
        //1->profile
        //2->search
        //3->settings
        lateinit var intent:Intent
        when(int){
            0->intent=Intent(this,MainActivity::class.java)
            1->intent=Intent(this,profileAct::class.java)
            2->intent=Intent(this,searchAct::class.java)
            else->intent=Intent(this,settingsAct::class.java)
        }
        startActivity(intent)
    }
}