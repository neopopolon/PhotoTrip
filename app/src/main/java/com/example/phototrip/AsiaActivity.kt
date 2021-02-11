package com.example.phototrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class AsiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asia)

        findViewById<View>(R.id.floatingActionButtonAsia).setOnClickListener { finish() }

        findViewById<View>(R.id.buttonAsia_0).setOnClickListener { setImage0() }
        findViewById<View>(R.id.buttonAsia_1).setOnClickListener { setImage1() }
        findViewById<View>(R.id.buttonAsia_2).setOnClickListener { setImage2() }
    }

    private fun setImage0() {
        findViewById<ImageView>(R.id.imageViewAsia).setImageResource(R.drawable.asia0)
        findViewById<View>(R.id.buttonAsia_0).alpha = 1.0f
        findViewById<View>(R.id.buttonAsia_1).alpha = 0.3f
        findViewById<View>(R.id.buttonAsia_2).alpha = 0.3f
    }

    private fun setImage1() {
        findViewById<ImageView>(R.id.imageViewAsia).setImageResource(R.drawable.asia1)
        findViewById<View>(R.id.buttonAsia_0).alpha = 0.3f
        findViewById<View>(R.id.buttonAsia_1).alpha = 1.0f
        findViewById<View>(R.id.buttonAsia_2).alpha = 0.3f
    }

    private fun setImage2() {
        findViewById<ImageView>(R.id.imageViewAsia).setImageResource(R.drawable.asia2)
        findViewById<View>(R.id.buttonAsia_0).alpha = 0.3f
        findViewById<View>(R.id.buttonAsia_1).alpha = 0.3f
        findViewById<View>(R.id.buttonAsia_2).alpha = 1.0f
    }
}