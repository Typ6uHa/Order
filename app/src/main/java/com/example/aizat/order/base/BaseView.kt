package com.example.aizat.order.base

import android.support.annotation.StringRes
import com.arellomobile.mvp.MvpView

interface BaseView : MvpView {

    fun showLoading()

    fun hideLoading()

    fun showError(error: String)

    fun showError(@StringRes error: Int)

    fun hideError()
}