package me.next.readx.openeye

import android.support.v7.widget.RecyclerView

/**
 * Created by NeXT on 17/6/1.
 */
interface Contract {

    interface View {
        fun setAdapter(adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>)
    }

    interface Presenter {}

}