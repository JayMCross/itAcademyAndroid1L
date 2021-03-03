package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var navBtn: Button
    private lateinit var shareBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navBtn = findViewById(R.id.navBtn)
        shareBtn = findViewById(R.id.shareBtn)
        setListener()

    }

    private fun setListener() {
        navBtn.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)

        }
        shareBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
            }
            intent.putExtra(Intent.EXTRA_TEXT, "TEXT")
            startActivity(intent)
        }
    }

}