package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import com.example.myapplication.utill.SharedPreferences

class SettingsActivity: AppCompatActivity() {

    private lateinit var switchTheme: SwitchCompat

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        switchTheme = findViewById(R.id.switchTheme)

    }

    private fun setSelectedTheme(){
        SharedPreferences.getThemeState(this)
    }

    private fun setListener(){
        switchTheme
    }
}