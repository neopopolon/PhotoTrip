package com.example.phototrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AsiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asia)

        findViewById<Button>(R.id.floatingActionButtonAsia).setOnClickListener { finish() }
    }
}