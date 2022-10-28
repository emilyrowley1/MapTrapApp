package com.example.maptrapapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Feilds : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feilds)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolBar)
        setSupportActionBar(toolbar)

        val goToHome = findViewById<android.view.View>(R.id.home_id)
        //handle button click
        goToHome.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@Feilds, MainActivity::class.java))
        }

        val goToReports = findViewById<android.view.View>(R.id.reports_id)
        //handle button click
        goToReports.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@Feilds, Reports::class.java))
        }


    }
}