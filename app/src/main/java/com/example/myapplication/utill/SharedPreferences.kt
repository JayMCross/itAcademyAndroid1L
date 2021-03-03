package com.example.myapplication.utill

import android.content.Context

object SharedPreferences {

    private const val THEME_PREF_NAME = "awhdiiaowhdoawhdoawdaio32h8"
    private const val THEME_KEY = "THEME_KEY"
    const val THEME_DARK = "DARK"
    const val THEME_LIGHT = "LIGHT"

    fun setThemeState(theme: String, context: Context) {
        val edit = context.getSharedPreferences(THEME_PREF_NAME, Context.MODE_PRIVATE).edit()
        edit.putString(THEME_KEY, theme)
        edit.apply()
    }

    fun getThemeState(context: Context): String {
        return context.getSharedPreferences(THEME_PREF_NAME, Context.MODE_PRIVATE).getString(THEME_KEY, THEME_LIGHT)
                ?: THEME_LIGHT
    }
}