package com.gana.weatherapp.retrofit

import com.gana.weatherapp.constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {


    val instance : WeatherEndPoint by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherEndPoint::class.java)
    }

}