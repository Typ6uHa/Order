package com.example.aizat.order.base

import android.annotation.SuppressLint
import android.support.multidex.MultiDexApplication
import kotlin.reflect.KClass

abstract class BaseApp : MultiDexApplication() {

    abstract val mainScreen: KClass<out BaseActivity>

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var instance: BaseApp
            private set
    }
}