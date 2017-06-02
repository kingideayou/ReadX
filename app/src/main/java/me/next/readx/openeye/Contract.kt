package me.next.readx.openeye

import me.next.readx.base.BaseContentAdapter
import me.next.readx.base.IPresenter

/**
 * Created by NeXT on 17/6/1.
 */
interface Contract {

    interface View {
        fun setAdapter(adapter: BaseContentAdapter<*>?)
    }

    interface Presenter: IPresenter {}

}