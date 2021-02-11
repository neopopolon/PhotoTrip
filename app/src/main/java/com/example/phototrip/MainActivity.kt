package com.example.phototrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.phototrip.R.layout.activity_main as activity_main1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main1)

//        buttonAfrica.setOnclickListener {buttonAfricaClick() }
//        buttonAsia.setOnclickListener {buttonAsiaClick() }
        findViewById<View>(R.id.buttonAfrica).setOnClickListener { buttonAfricaClick() }
        findViewById<View>(R.id.buttonAsia).setOnClickListener { buttonAsiaClick() }

    }

    private fun buttonAfricaClick() {
        val intent = Intent(this@MainActivity, AfricaActivity::class.java)
        startActivity(intent)
    }

    private fun buttonAsiaClick() {
        val intent = Intent(this@MainActivity, AsiaActivity::class.java)
        startActivity(intent)
    }
}