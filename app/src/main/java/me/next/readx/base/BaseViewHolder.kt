package me.next.readx.base

import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.View

/**
 * Created by NeXT on 17/6/2.
 */
abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var views: SparseArray<View>? = null

    init {
        views = SparseArray()
    }

    fun getView(resId: Int): View {
        var view: View? = views?.get(resId)
        if (view == null) {
            view = itemView.findViewById(resId)
            views?.put(resId, view)
        }
        return view!!
    }

    abstract fun setUpView(model: T, position: Int, adapter: RecyclerView.Adapter<BaseViewHolder<T>>): Unit

}