package com.jason.doublelistscroll.widget.adpater

import android.view.View
import com.jason.doublelistscroll.R
import com.jason.doublelistscroll.widget.vh.DScrollViewRightVH
import com.jason.doublelistscroll.widget.bean.RightVHBean

class DScrollViewRightAdapter(mData:List<RightVHBean>): BaseAdapater<DScrollViewRightVH, RightVHBean>(mData) {
    override fun onViewAction(mT: DScrollViewRightVH, position: Int) {
    }

    override fun getLayoutId(): Int {
        return R.layout.item_double_scroll_right
    }



    override fun getViewHolder(mView: View): DScrollViewRightVH {

        return DScrollViewRightVH(mView)
    }

}