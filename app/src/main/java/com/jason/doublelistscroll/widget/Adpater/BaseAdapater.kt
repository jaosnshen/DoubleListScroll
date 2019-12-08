package com.jason.doublelistscroll.widget.Adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class  BaseAdapater< T:RecyclerView.ViewHolder,V> : RecyclerView.Adapter<T>(){


    lateinit var mdatalist:List<V>
    override fun getItemCount(): Int {

        return mdatalist.size
    }

    abstract fun getLayoutId():Int

    abstract fun onViewAction(mT:T,position: Int)


    override fun onBindViewHolder(holder: T, position: Int) {
        onViewAction(holder,position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): T {
        var mRoot=LayoutInflater.from(parent.context).inflate(getLayoutId(),parent)
        return mRoot
    }





}