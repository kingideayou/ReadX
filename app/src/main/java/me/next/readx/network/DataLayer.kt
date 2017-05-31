package me.next.readx.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by NeXT on 17/5/31.
 */
object DataLayer {

    var CLIENT: OkHttpClient? = null
    var RETROFIT_OPENEYE: Retrofit? = null

    fun init() {

            CLIENT = OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .build()

            RETROFIT_OPENEYE = Retrofit.Builder()
                    .baseUrl("http://baobab.kaiyanapp.com/api/v2/feed/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(CLIENT)
                    .build()

    }

}