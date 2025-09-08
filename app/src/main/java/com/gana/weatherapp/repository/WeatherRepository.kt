package com.gana.weatherapp.repository

import com.gana.weatherapp.model.WeatherResponse
import com.gana.weatherapp.retrofit.ApiClient
import com.gana.weatherapp.retrofit.WeatherEndPoint
import retrofit2.Response


class WeatherRepository() {
    val apiService: WeatherEndPoint = ApiClient.instance
    suspend fun getWeather(name : String , apikey : String ): Response<WeatherResponse> {
        return  apiService.getWeather(name,apikey)
    }
}