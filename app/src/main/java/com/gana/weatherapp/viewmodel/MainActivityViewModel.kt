package com.gana.weatherapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gana.weatherapp.constants.Constants
import com.gana.weatherapp.model.WeatherResponse
import com.gana.weatherapp.repository.WeatherRepository
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val mutableApiData = MutableLiveData<WeatherResponse?>()
    val weather: LiveData<WeatherResponse?> get() = mutableApiData

    private val repository: WeatherRepository = WeatherRepository()

    fun fetchWeather(name: String) {
        viewModelScope.launch {
            try {
                val response = repository.getWeather(name, Constants.WEATHER_API_KEY)
                if (response.isSuccessful) {
                    mutableApiData.postValue(response.body())
                } else {
                    mutableApiData.postValue(null)
                }
            } catch (e: Exception) {
                e.printStackTrace()
                mutableApiData.postValue(null)
            }
        }
    }
}
