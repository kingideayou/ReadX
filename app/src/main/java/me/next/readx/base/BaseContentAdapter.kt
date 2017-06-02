package me.next.readx.base

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import me.next.readx.base.type.TypeFactoryList

/**
 * Created by NeXT on 17/6/2.
 */
class BaseContentAdapter<T>(dataList: List<T>) : RecyclerView.Adapter<BaseViewHolder<T>>() {

    val TYPE_NOT_FOUND = -1

    var mDataList: List<T> = dataList
    val typeFactoryList: TypeFactoryList = TypeFactoryList()

    override fun onBindViewHolder(viewHolder: BaseViewHolder<T>?, position: Int) {
        viewHolder?.setUpView(mDataList[position], position, this)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<T>? {
        val context = parent?.context
        val itemView = View.inflate(context, viewType, null)
        return typeFactoryList.createViewHolder(viewType, itemView) as BaseViewHolder<T>?
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun getItemViewType(position: Int): Int {
        val data = mDataList.get(position)
        if (data is BaseBean) {
            return data.type(typeFactoryList)
        }
        return TYPE_NOT_FOUND
    }

}