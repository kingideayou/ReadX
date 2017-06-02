package me.next.readx.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by NeXT on 17/5/31.
 */
object DataLayer {

    var CLIENT: OkHttpClient? = null
    var RETROFIT_OPENEYE: Retrofit? = null
    var GSON: Gson? = null

    fun init() {

        CLIENT = OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build()

        GSON = GsonBuilder().setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").create()

        RETROFIT_OPENEYE = Retrofit.Builder()
                .baseUrl("http://baobab.kaiyanapp.com/api/v2/feed/")
                .addConverterFactory(GsonConverterFactory.create(GSON))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(CLIENT)
                .build()

    }

}