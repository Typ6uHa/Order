package com.example.aizat.order.profile

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.aizat.order.R
import com.example.aizat.order.base.BaseActivity
import com.example.aizat.order.base.BasePresenter
import com.example.aizat.order.home.HomeActivity
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.toolbar.*
import org.jetbrains.anko.startActivity

/**
 * Created by Aizat on 18.09.2018.
 */

class ProfileActivity : BaseActivity(), ProfileView {

    @InjectPresenter
    lateinit var presenter: ProfilePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        btnSave.setOnClickListener {
            presenter.onSaveClick(etSurname.text.toString(), etName.text.toString(), etId.text.toString().toInt())
        }
    }


    override fun setInfo(surname: String, name: String, id: Int) {
        etSurname.setText(surname)
        etName.setText(name)
        etId.setText(id.toString())
    }

    override fun showHomeScreen() {
        startActivity<HomeActivity>()
    }

    override fun getPresenter(): BasePresenter<*>? = presenter

}