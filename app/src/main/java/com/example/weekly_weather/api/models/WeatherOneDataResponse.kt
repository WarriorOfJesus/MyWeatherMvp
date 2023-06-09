package com.example.weekly_weather.api.models

import com.example.myweather.api.models.CloudsResponse
import com.example.myweather.api.models.WeatherResponse
import com.example.myweather.api.models.WindResponse
import com.google.gson.annotations.SerializedName

data class WeatherOneDataResponse(
    @SerializedName("dt")
    val dt: Long,
    @SerializedName("main")
    val main: MainResponse,
    @SerializedName("weather")
    val weather: List<WeatherResponse>,
    @SerializedName("clouds")
    val clouds: CloudsResponse,
    @SerializedName("wind")
    val wind: WindResponse,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("pop")
    val pop: Double,
    @SerializedName("rain")
    val rain: RainResponse?,
    @SerializedName("sys")
    val sys : SysResponse,
    @SerializedName("dt_txt")
    val dataTime: String
)
