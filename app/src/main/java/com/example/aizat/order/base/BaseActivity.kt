package com.example.aizat.order.base

import android.os.Bundle
import android.view.MenuItem
import com.arellomobile.mvp.MvpAppCompatActivity

abstract class BaseActivity : MvpAppCompatActivity(), BaseView {

    private lateinit var delegate: BaseLogicDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        delegate = BaseLogicDelegate(this) { getPresenter() }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun showLoading() {
        delegate.showLoading()
    }

    override fun hideLoading() {
        delegate.hideLoading()
    }

    override fun showError(error: String) {
        delegate.showError(error)
    }

    override fun showError(error: Int) {
        delegate.showError(error)
    }

    override fun hideError() {
        delegate.hideError()
    }

    abstract fun getPresenter(): BasePresenter<*>?
}