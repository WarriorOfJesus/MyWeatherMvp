package com.example.weekly_weather.repository

import com.example.weekly_weather.api.FiveDaysWeatherApi
import com.example.weekly_weather.model.DetailWeatherData
import com.example.weekly_weather.model.FiveDays
import com.example.weekly_weather.model.FiveDaysWeather
import com.example.weekly_weather.model.WeatherWeeklyConverter
import timber.log.Timber

class FiveDaysRemoteRepository(private val api: FiveDaysWeatherApi) : FiveDaysRepository {
    override suspend fun getFiveDaysWeatherData(cityName: String, key: String): DetailWeatherData {
        val weatherData = api.getFiveDaysWeatherData(cityName, key)
        return WeatherWeeklyConverter.fromNetwork(weatherData)
    }
}

