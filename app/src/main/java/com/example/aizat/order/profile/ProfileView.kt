package com.example.aizat.order.profile

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.aizat.order.base.BaseView

/**
 * Created by Aizat on 18.09.2018.
 */
interface ProfileView : BaseView {

    fun setInfo(surname: String, name: String, id: Int)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showHomeScreen()
}