package com.example.aizat.order.book.chapter

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.aizat.order.base.BaseView
import com.example.aizat.order.book.model.Chapter

interface BookChapterView : BaseView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showChapter(chapter: Chapter)

    fun setList(chapters: List<Chapter>)
}
