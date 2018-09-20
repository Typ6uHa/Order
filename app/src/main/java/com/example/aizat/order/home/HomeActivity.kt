package com.example.aizat.order.home

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.aizat.order.R
import com.example.aizat.order.base.BaseActivity
import com.example.aizat.order.base.BasePresenter
import com.example.aizat.order.book.chapter.BookChapterActivity
import com.example.aizat.order.profile.ProfileActivity
import com.example.aizat.order.progress.ProgressActivity
import com.example.aizat.order.settings.SettingsActivity
import kotlinx.android.synthetic.main.activity_home.*
import org.jetbrains.anko.startActivity

class HomeActivity : BaseActivity(), HomeView {

    @InjectPresenter
    lateinit var presenter: HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ivProfile.setOnClickListener {
            presenter.onProfileClick()
        }

        ivSettings.setOnClickListener {
            presenter.onSettingsClick()
        }

        ivBook.setOnClickListener {
            presenter.onBookClick()
        }

        ivProgress.setOnClickListener {
            presenter.onProgressClick()
        }
    }

    override fun showProfileScreen() {
        startActivity<ProfileActivity>()
    }

    override fun showSettingScreen() {
        startActivity<SettingsActivity>()
    }

    override fun showBookScreen() {
        startActivity<BookChapterActivity>()
    }

    override fun showProgressScreen() {
        startActivity<ProgressActivity>()
    }

    override fun getPresenter(): BasePresenter<*>? = presenter
}
