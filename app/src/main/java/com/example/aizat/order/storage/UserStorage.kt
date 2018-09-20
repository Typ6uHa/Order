package com.example.aizat.order.storage

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.aizat.order.base.App

object UserStorage {

    private val preferences: SharedPreferences by lazy {
        PreferenceManager.getDefaultSharedPreferences(App.context)
    }

    fun getUser(): String? {
        return preferences.getString("user", null)
    }

    fun putUser(user: String) {
        preferences.edit().putString("user", user).apply()
    }
}