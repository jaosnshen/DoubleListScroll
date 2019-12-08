package com.jason.doublelistscroll.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jason.doublelistscroll.R
import com.jason.doublelistscroll.widget.adpater.DScrollViewLeftAdapter
import com.jason.doublelistscroll.widget.adpater.DScrollViewRightAdapter
import com.jason.doublelistscroll.widget.bean.LeftVHBean
import com.jason.doublelistscroll.widget.bean.RightVHBean






class DoubleRecycleView : RelativeLayout {





    var mRightBeanList:ArrayList<RightVHBean> = ArrayList()
    var mLeftBeanList:ArrayList<LeftVHBean> = ArrayList()


    var mLeftAdapter: DScrollViewLeftAdapter=DScrollViewLeftAdapter(mLeftBeanList)
    var mRightAdapter: DScrollViewRightAdapter=DScrollViewRightAdapter(mRightBeanList)

    constructor(context: Context?):super(context){

        initView(context)

    }

    constructor(context: Context?, attrs: AttributeSet):super(context,attrs){
        initView(context)
    }

    constructor(context:Context, attrs: AttributeSet,  defStyleAttr:Int):super(context,attrs,defStyleAttr) {
        initView(context)

    }

    private fun initView(context: Context?) {
        var mRoot=LayoutInflater.from(context).inflate(R.layout.widget_double_recycleview,this,true)


        var mDRecycleViewRight=mRoot.findViewById<RecyclerView>(R.id.DRecycleViewRight)
        var mDRecycleViewLeft=mRoot.findViewById<RecyclerView>(R.id.DRecycleViewLeft)


        for (index in 0..200){
            mRightBeanList.add(RightVHBean(index))
            mLeftBeanList.add(LeftVHBean(index))
        }


        mDRecycleViewRight.adapter=mRightAdapter

        mDRecycleViewRight.layoutManager=LinearLayoutManager(context)



        mDRecycleViewLeft.adapter=mLeftAdapter
        mDRecycleViewLeft.layoutManager=LinearLayoutManager(context)


        mDRecycleViewLeft.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {




            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {




            }

        })
    }


}