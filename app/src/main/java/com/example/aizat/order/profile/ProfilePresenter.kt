package com.example.aizat.order.profile

import com.arellomobile.mvp.InjectViewState
import com.example.aizat.order.base.BasePresenter
import com.example.aizat.order.profile.model.User
import com.example.aizat.order.storage.UserStorage
import com.google.gson.Gson
import com.google.gson.GsonBuilder

/**
 * Created by Aizat on 18.09.2018.
 */

@InjectViewState
class ProfilePresenter : BasePresenter<ProfileView>() {

    val user = Gson().fromJson(UserStorage.getUser(), User::class.java)

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        if (UserStorage.getUser()!!.isNotEmpty()) {
            viewState.setInfo(user.surname, user.name, user.id)
        }
    }

    fun onSaveClick(surname: String, name: String, id: Int) {
        val user = User(surname, name, id)
        if (this.user.surname != surname || this.user.name != name || this.user.id != id) {
            UserStorage.putUser(GsonBuilder().create().toJson(user))
            viewState.showHomeScreen()
        }
    }
}