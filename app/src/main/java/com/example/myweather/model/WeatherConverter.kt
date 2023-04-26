package com.example.myweather.model

import com.example.myweather.api.models.*
import com.example.utils.viewbinding.translateTemp

object WeatherConverter {
    fun fromNetwork(response: WeatherDataResponse): WeatherData {
        return WeatherData(
            name = response.name,
            temp = fromNetworkTemp(response.main),
            speed = fromNetworkSpeed(response.wind),
            all = response.clouds?.let { fromNetworkAll(it) },
            pressure = fromNetworkPressure(response.main),
            humidity = fromNetworkHumidity(response.main),
            visibility = response.visibility,
            description = fromNetworkDescription(response.weather),
            deg = fromNetworkDeg(response.wind)
        )
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