package me.next.readx.base.type

import android.support.v7.widget.RecyclerView
import android.view.View
import me.next.readx.network.bean.OpenEyeData

/**
 * Created by NeXT on 17/6/2.
 */
interface TypeFactory {

    fun type(openEyeData: OpenEyeData): Int

    fun createViewHolder(type: Int, itemView: View) : RecyclerView.ViewHolder?

}