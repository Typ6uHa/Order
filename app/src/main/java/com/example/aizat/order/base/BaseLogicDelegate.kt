package com.example.aizat.order.base

import android.app.ProgressDialog
import android.content.Context
import android.support.annotation.StringRes
import android.support.v7.app.AlertDialog
import org.jetbrains.anko.alert
import org.jetbrains.anko.appcompat.v7.Appcompat

class BaseLogicDelegate(val context: Context, val presenterProvider: () -> BasePresenter<*>?) {

    private var progressDialog: ProgressDialog? = null
    private var errorDialog: AlertDialog? = null

    fun showLoading() {
        progressDialog?.dismiss()
        progressDialog = ProgressDialog.show(context, null, "Загрузка...", true)
    }

    fun hideLoading() {
        progressDialog?.dismiss()
        progressDialog = null
    }

    fun showError(error: String) {
        errorDialog?.dismiss()
        errorDialog = context.alert(factory = Appcompat, title = "Ошибка",
                message = error) {
            positiveButton("ОК") { getPresenter()?.onErrorDismiss() }
            onCancelled { getPresenter()?.onErrorDismiss() }

        }.build()
        errorDialog?.show()
    }

    fun showError(@StringRes error: Int) {
        showError(context.getString(error))
    }

    fun hideError() {
        errorDialog?.dismiss()
        errorDialog = null
    }

    fun getPresenter(): BasePresenter<*>? = presenterProvider()
}