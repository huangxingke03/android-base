package com.example.andoid_base.weather.net.service

import com.example.andoid_base.weather.data.WeatherInfo
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchWeather {
    @GET("v3/weather/weatherInfo")
    fun searchWeather(
        @Query("key") key: String = "60914564e8cb7ca7b497530783a34882",
        @Query("city") city: String = "310000"
    ): Call<WeatherInfo>

    @GET("v3/weather/weatherInfo")
    fun searchWeather1(
        @Query("key") key: String ,
        @Query("city") city: String
    ): Observable<WeatherInfo>
}