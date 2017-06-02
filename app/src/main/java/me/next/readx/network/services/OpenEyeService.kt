package me.next.readx.network.services

import android.util.Log
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import me.next.readx.network.api.OpenEyeApi
import me.next.readx.network.bean.OpenEyeDataItem

/**
 * Created by NeXT on 17/5/27.
 */
object OpenEyeService {

    fun getOpenEyeList(): Observable<ArrayList<OpenEyeDataItem>> =
            OpenEyeApi.IMPL.getOpenEyeList()
                    .subscribeOn(Schedulers.io())
                    .map {
                        Log.e("开眼列表", it.toString())
                        it.issueList[0].itemList
                    }

}