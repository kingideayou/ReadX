package me.next.readx.network.api

import io.reactivex.Observable
import me.next.readx.network.DataLayer
import me.next.readx.network.bean.OpenEyeDataResponse
import retrofit2.http.GET

/**
 * Created by NeXT on 17/5/27.
 */
internal interface OpenEyeApi {

    companion object {
        val IMPL: OpenEyeApi = DataLayer.RETROFIT_OPENEYE!!.create(OpenEyeApi::class.java)
    }

    @GET("")
    fun getOpenEyeList(): Observable<OpenEyeDataResponse>
}