package me.next.readx.openeye

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import me.next.readx.R
import me.next.readx.base.BaseViewHolder
import me.next.readx.network.bean.OpenEyeData

/**
 * Created by NeXT on 17/6/2.
 */
class OpenEyeViewHolder(itemView: View) : BaseViewHolder<OpenEyeData>(itemView) {


    var tvTitle: TextView? = null

    init {
        tvTitle = this.itemView.findViewById(R.id.tv_title) as TextView
    }

    override fun setUpView(model: OpenEyeData, position: Int, adapter: RecyclerView.Adapter<BaseViewHolder<OpenEyeData>>) {
        tvTitle?.text = model.title
    }

}