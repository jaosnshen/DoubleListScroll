package com.jason.doublelistscroll.widget

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import com.jason.doublelistscroll.R

class DoubleRecycleView : RelativeLayout {







    constructor(context: Context?):super(context){

        initView(context)

    }

    private fun initView(context: Context?) {
        var mRoot=LayoutInflater.from(context).inflate(R.layout.widget_double_recycleview,this,true)


        var mDRecycleViewRight=mRoot.findViewById<RecyclerView>(R.id.DRecycleViewRight)
        var mDRecycleViewLeft=mRoot.findViewById<RecyclerView>(R.id.DRecycleViewLeft)


    }


}