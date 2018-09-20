package com.example.aizat.order.home

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.aizat.order.base.BaseView

/**
 * Created by Aizat on 18.09.2018.
 */
interface HomeView : BaseView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showProfileScreen()

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showSettingScreen()

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showBookScreen()

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showProgressScreen()
}