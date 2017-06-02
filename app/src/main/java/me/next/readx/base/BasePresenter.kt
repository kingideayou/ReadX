package me.next.readx.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trello.rxlifecycle2.components.RxFragment

/**
 * Created by NeXT on 17/6/1.
 */
abstract class BasePresenter<V> : RxFragment(), IContextProvider {

    var view: V? = null

    override fun context(): Context? =  activity

    final override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = activity as V?
        onViewCreated(view, savedInstanceState)
        return null
    }

    abstract fun onViewCreated(view: V?, savedInstanceState: Bundle?)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}