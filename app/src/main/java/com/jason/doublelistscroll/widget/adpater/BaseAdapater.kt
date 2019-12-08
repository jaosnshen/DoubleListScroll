package com.jason.doublelistscroll.widget.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
abstract class  BaseAdapater< T: ViewHolder,V>(val mdatalist:List<V>) : RecyclerView.Adapter<T>(){



    override fun getItemCount(): Int {

        return mdatalist.size
    }

    abstract fun getLayoutId():Int

    abstract fun onViewAction(mT:T,position: Int)

    abstract fun getViewHolder(mView:View):T

    override fun onBindViewHolder(holder: T, position: Int) {
        onViewAction(holder,position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): T {
        var mRoot=LayoutInflater.from(parent.context).inflate(getLayoutId(),null,false)
        return getViewHolder(mRoot)
    }





}