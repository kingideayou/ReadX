package me.next.readx.base

import org.jetbrains.anko.toast

/**
 * Created by NeXT on 17/6/2.
 */
interface IPresenter : IContextProvider {

    fun onError(err: Throwable) {
        context()?.toast(err.message ?: "Unknown Error")
    }

}