package com.example.whosthere

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class otherProfileAct: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_contact_page)
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.contactsB -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.profileB -> {
                    // Respond to navigation item 2 click
                    true
                }
                R.id.searchB -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.settingsB -> {
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }
}