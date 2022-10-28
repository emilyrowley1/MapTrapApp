package com.example.maptrapapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolBar)
        setSupportActionBar(toolbar)



        val goToReports = findViewById<android.view.View>(R.id.reports_id)
        //handle button click
        goToReports.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@MainActivity, Reports::class.java))
        }

        val goToFeilds = findViewById<android.view.View>(R.id.feilds_id)
        //handle button click
        goToFeilds.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@MainActivity, Feilds::class.java))
        }
    }
}









