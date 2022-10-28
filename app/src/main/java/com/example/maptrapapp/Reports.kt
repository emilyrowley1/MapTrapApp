package com.example.maptrapapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Reports : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reports)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolBar)
        setSupportActionBar(toolbar)

        val goToHome = findViewById<android.view.View>(R.id.home_id)
        //handle button click
        goToHome.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@Reports, MainActivity::class.java))
        }


        val goToFeilds = findViewById<android.view.View>(R.id.feilds_id)
        //handle button click
        goToFeilds.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@Reports, Feilds::class.java))
        }
    }
}