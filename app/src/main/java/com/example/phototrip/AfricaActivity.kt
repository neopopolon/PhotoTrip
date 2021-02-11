package com.example.phototrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AfricaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_africa)

        findViewById<Button>(R.id.floatingActionButtonAfrica).setOnClickListener { finish() }
    }
}