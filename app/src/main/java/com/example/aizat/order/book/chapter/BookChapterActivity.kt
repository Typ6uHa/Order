package com.example.aizat.order.book.chapter

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.aizat.order.R
import com.example.aizat.order.base.BaseActivity
import com.example.aizat.order.base.BasePresenter
import com.example.aizat.order.book.model.Chapter
import com.example.aizat.order.book.description.DescriptionActivity
import kotlinx.android.synthetic.main.activity_book_chapter.*
import kotlinx.android.synthetic.main.toolbar.*
import org.jetbrains.anko.startActivity

/**
 * Created by Aizat on 18.09.2018.
 */
class BookChapterActivity : BaseActivity(), BookChapterView {

    @InjectPresenter
    lateinit var presenter: BookChapterPresenter

    private val adapter: BookChapterAdapter = BookChapterAdapter({
        presenter.onItemClick(it)
    }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_chapter)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    override fun showChapter(chapter: Chapter) {
        startActivity<DescriptionActivity>("chapter" to chapter)
    }

    override fun setList(chapters: List<Chapter>) {
        adapter.submitList(chapters)
    }

    override fun getPresenter(): BasePresenter<*>? = presenter

}