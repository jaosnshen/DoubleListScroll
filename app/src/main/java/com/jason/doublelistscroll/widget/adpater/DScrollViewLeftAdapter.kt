package com.jason.doublelistscroll.widget.adpater

import android.view.View
import com.jason.doublelistscroll.R
import com.jason.doublelistscroll.widget.vh.DScrollViewLeftVH
import com.jason.doublelistscroll.widget.bean.LeftVHBean

class DScrollViewLeftAdapter(mData:List<LeftVHBean>) : BaseAdapater<DScrollViewLeftVH, LeftVHBean>(mData) {


    override fun getLayoutId(): Int {
             return R.layout.item_double_scroll_left
    }

    override fun onViewAction(mT: DScrollViewLeftVH, position: Int) {


    }

    override fun getViewHolder(mView: View): DScrollViewLeftVH {

        return DScrollViewLeftVH(mView)
    }



}