package me.next.readx.network.api

import io.reactivex.Observable
import me.next.readx.network.DataLayer
import me.next.readx.network.bean.OpenEyeDataIssue
import me.next.readx.network.bean.Response
import retrofit2.http.GET

/**
 * Created by NeXT on 17/5/27.
 */
internal interface OpenEyeApi {

    companion object {
        val IMPL: OpenEyeApi = DataLayer.RETROFIT_OPENEYE!!.create(OpenEyeApi::class.java)
    }

    @GET(".")
    fun getOpenEyeList(): Observable<Response<OpenEyeDataIssue>>
}