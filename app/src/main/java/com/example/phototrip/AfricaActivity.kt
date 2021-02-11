package com.example.phototrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class AfricaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_africa)

        findViewById<View>(R.id.floatingActionButtonAfrica).setOnClickListener { finish() }

        findViewById<View>(R.id.buttonAfrica_0).setOnClickListener { setImage0() }
        findViewById<View>(R.id.buttonAfrica_1).setOnClickListener { setImage1() }
        findViewById<View>(R.id.buttonAfrica_2).setOnClickListener { setImage2() }
    }

    private fun setImage0() {
        findViewById<ImageView>(R.id.imageViewAfrica).setImageResource(R.drawable.africa0)
        findViewById<View>(R.id.buttonAfrica_0).alpha = 1.0f
        findViewById<View>(R.id.buttonAfrica_1).alpha = 0.3f
        findViewById<View>(R.id.buttonAfrica_2).alpha = 0.3f
    }

    private fun setImage1() {
        findViewById<ImageView>(R.id.imageViewAfrica).setImageResource(R.drawable.africa1)
        findViewById<View>(R.id.buttonAfrica_0).alpha = 0.3f
        findViewById<View>(R.id.buttonAfrica_1).alpha = 1.0f
        findViewById<View>(R.id.buttonAfrica_2).alpha = 0.3f
    }

    private fun setImage2() {
        findViewById<ImageView>(R.id.imageViewAfrica).setImageResource(R.drawable.africa2)
        findViewById<View>(R.id.buttonAfrica_0).alpha = 0.3f
        findViewById<View>(R.id.buttonAfrica_1).alpha = 0.3f
        findViewById<View>(R.id.buttonAfrica_2).alpha = 1.0f
    }
}