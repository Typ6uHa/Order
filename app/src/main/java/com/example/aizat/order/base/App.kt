package com.example.aizat.order.base

import android.annotation.SuppressLint
import android.content.Context
import com.example.aizat.order.home.HomeActivity
import kotlin.reflect.KClass

class App : BaseApp() {

    override val mainScreen: KClass<out BaseActivity>
        get() = HomeActivity::class

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}