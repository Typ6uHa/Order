package com.example.aizat.order.home

import com.arellomobile.mvp.InjectViewState
import com.example.aizat.order.base.BasePresenter

/**
 * Created by Aizat on 18.09.2018.
 */
@InjectViewState
class HomePresenter : BasePresenter<HomeView>(){
    fun onProfileClick() {
        viewState.showProfileScreen()
    }

    fun onSettingsClick() {
        viewState.showSettingScreen()
    }

    fun onBookClick() {
        viewState.showBookScreen()
    }

    fun onProgressClick() {
        viewState.showProgressScreen()
    }

}