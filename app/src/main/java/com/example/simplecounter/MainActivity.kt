package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     var currentCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val counter = findViewById<TextView>(R.id.countDisplay)
        val tapButt = findViewById<Button>(R.id.tapper)
        tapButt.setOnClickListener{
            Log.v("buttun", "i've been tapped")
            currentCount++
            counter.text=currentCount.toString()
        }
    }
}