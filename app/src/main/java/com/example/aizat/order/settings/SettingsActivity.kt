package com.example.aizat.order.settings

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.aizat.order.R
import com.example.aizat.order.base.BaseActivity
import com.example.aizat.order.base.BasePresenter

/**
 * Created by Aizat on 18.09.2018.
 */

class SettingsActivity : BaseActivity(), SettingsView {

    @InjectPresenter
    lateinit var presenter: SettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default)
    }

    override fun getPresenter(): BasePresenter<*>? = presenter

}