package com.gana.weatherapp.retrofit

import com.gana.weatherapp.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherEndPoint {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") city:String,
        @Query("appid")apiKey:String,
        @Query("units") units:String ="metric"
    ): Response<WeatherResponse>
}