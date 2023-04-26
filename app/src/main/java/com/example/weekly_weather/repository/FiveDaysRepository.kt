package com.example.weekly_weather.repository

import com.example.weekly_weather.model.DetailWeatherData
import com.example.weekly_weather.model.FiveDays
import com.example.weekly_weather.model.FiveDaysWeather

interface FiveDaysRepository {
   suspend fun getFiveDaysWeatherData(cityName:String, key:String ): DetailWeatherData
}