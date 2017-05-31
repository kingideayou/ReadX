package me.next.readx.network.services

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
                    .filter {
                        it.issueList.size > 0
                    }
                    .map {
                        it.issueList.get(0).itemList
                    }
//                    .onErrorResumeNext{ err: Throwable ->
//                        val lis`t: ArrayList<OpenEyeData> = Paper.book().read("meizis-$pageNum")
//                                ?: throw GankServiceException(err.message)
//                        val list: listof()
//                        Observable.just(list)
//                    }
}