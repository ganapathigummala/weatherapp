package com.gana.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gana.weatherapp.ui.theme.MyApplicationTheme
import com.gana.weatherapp.viewmodel.MainActivityViewModel

class MainActivitys : ComponentActivity() {

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WeatherScreen(
                        modifier = Modifier.padding(innerPadding),
                        viewModel = viewModel
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        viewModel.fetchWeather("Hyderabad")
    }
}

@Composable
fun WeatherScreen(modifier: Modifier = Modifier, viewModel: MainActivityViewModel) {
    val weatherState by viewModel.weather.observeAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (weatherState == null) {
            Text(text = "Loading...")
        } else {
            val tempCelsius = weatherState!!.main.temp - 273.15
            val feelsLikeCelsius = weatherState!!.main.feels_like - 273.15

            Text(text = "City: ${weatherState!!.name}")
            Text(text = "Temperature: ${"%.1f".format(tempCelsius)}°C")
            Text(text = "Feels Like: ${"%.1f".format(feelsLikeCelsius)}°C")
            Text(text = "Condition: ${weatherState!!.weather[0].description}")
        }
    }
}
