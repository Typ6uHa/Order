package com.example.aizat.order.base

import com.arellomobile.mvp.MvpPresenter

/**
 * @author ilya
 */
abstract class BasePresenter<View : BaseView> : MvpPresenter<View>() {

    protected fun handleNonGenericError(t: Throwable) {

    }

    open fun onErrorDismiss() {
        viewState.hideError()
    }
}