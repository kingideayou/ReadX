package me.next.readx.base.type

import android.view.View
import me.next.readx.R
import me.next.readx.base.BaseViewHolder
import me.next.readx.network.bean.OpenEyeData
import me.next.readx.openeye.OpenEyeViewHolder

/**
 * Created by NeXT on 17/6/2.
 */
class TypeFactoryList : TypeFactory {

    val TYPE_OPENEYE: Int = R.layout.card_openeye

    override fun type(openEyeData: OpenEyeData): Int {
        return TYPE_OPENEYE;
    }

    override fun createViewHolder(type: Int, itemView: View) : BaseViewHolder<*>? {
        if (TYPE_OPENEYE == type) {
            return OpenEyeViewHolder(itemView)
        }
        return null
    }

}