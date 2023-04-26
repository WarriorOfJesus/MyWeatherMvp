package com.example.weekly_weather.model

import com.example.myweather.api.models.*

import com.example.utils.viewbinding.translateTemp
import com.example.weekly_weather.api.models.*
import com.example.weekly_weather.api.models.MainResponse

object WeatherWeeklyConverter {

    fun fromNetwork(response: FiveDaysResponse): DetailWeatherData {
        return DetailWeatherData(
            list = fromNetwork(response.list)
        )
    }

    private fun fromNetwork(list : List<WeatherOneDataResponse>): List<FiveDaysWeather>{
        return list.map {
            FiveDaysWeather(
                dt = it.dt,
                temp = fromNetworkTemp(it.main),
                speed = fromNetworkSpeed(it.wind),
                all = fromNetworkAll(it.clouds),
                pressure = fromNetworkPressure(it.main),
                humidity = fromNetworkHumidity(it.main),
                visibility = it.visibility,
                description = fromNetworkDescription(it.weather),
                deg = fromNetworkDeg(it.wind),
                dt_txt = it.dataTime
            )
        }
    }


    private fun fromNetworkTemp(response: MainResponse): String {
        return translateTemp(response.temp)
    }

    private fun fromNetworkSpeed(response: WindResponse?): String {
        return response?.speed.toString()
    }

    private fun fromNetworkAll(response: CloudsResponse): String {
        return response.all.toString()
    }

    private fun fromNetworkPressure(response: MainResponse): String {
        return response.pressure.toString()
    }

    private fun fromNetworkHumidity(response: MainResponse): String {
        return response.humidity.toString()
    }

    private fun fromNetworkDeg(response: WindResponse?): Int? {
        return response?.deg
    }

    private fun fromNetworkDescription(response: List<WeatherResponse>): String? {
        return response[0].description
    }


}