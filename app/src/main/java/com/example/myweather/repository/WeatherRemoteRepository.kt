package com.example.myweather.repository

import com.example.myweather.api.WeatherApi
import com.example.myweather.model.WeatherConverter
import com.example.myweather.model.WeatherData

class WeatherRemoteRepository(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(city: String, key: String): WeatherData {
        val response = api.getWeatherData(city, key)
        return WeatherConverter.fromNetwork(response)
    }
}