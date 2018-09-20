package com.example.aizat.order.book.chapter

import com.arellomobile.mvp.InjectViewState
import com.example.aizat.order.base.BasePresenter
import com.example.aizat.order.book.model.Chapter

@InjectViewState
class BookChapterPresenter : BasePresenter<BookChapterView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
       // viewState.setList()
    }
    fun onItemClick(chapter: Chapter) {
        viewState.showChapter(chapter)
    }
}
