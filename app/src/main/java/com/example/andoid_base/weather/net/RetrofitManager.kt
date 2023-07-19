package com.example.andoid_base.weather.net

import com.example.andoid_base.weather.net.NetUrl.weather_base_url
import com.example.base_utils.LogUtils
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitManager {
    fun <T> getService(service: Class<T>): T {
        return getRetrofit().create(service)
    }

    private fun getOkhttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor { message ->
                LogUtils.d(": $message")
            }.apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .connectTimeout(30 * 1000, TimeUnit.MILLISECONDS)
            .readTimeout(20 * 1000, TimeUnit.MILLISECONDS).build()
    }

//    private fun getOkhttpClient1(): OkHttpClient {
//        return OkHttpClient().newBuilder()
//            .addInterceptor(HttpLoggingInterceptor { message ->
//                LogUtils.d(": $message")
//            }.apply {
//                level = HttpLoggingInterceptor.Level.BODY
//            })
//            .connectTimeout(30 * 1000, TimeUnit.MILLISECONDS)
//            .readTimeout(20 * 1000, TimeUnit.MILLISECONDS).build()
//    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(weather_base_url)
            .client(getOkhttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
}