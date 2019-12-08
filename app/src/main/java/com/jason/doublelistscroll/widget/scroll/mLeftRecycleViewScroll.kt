package com.jason.doublelistscroll.widget.scroll

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager



class mLeftRecycleViewScroll(val mRecycleView:RecyclerView): RecyclerView.OnScrollListener() {







    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)
    }

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)


        val mLinearLayoutManager = recyclerView.layoutManager as LinearLayoutManager
        mLinearLayoutManager?.findFirstVisibleItemPosition()

        mLinearLayoutManager?.findLastVisibleItemPosition()

    }


}