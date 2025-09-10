package com.gana.weatherapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SuperApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}