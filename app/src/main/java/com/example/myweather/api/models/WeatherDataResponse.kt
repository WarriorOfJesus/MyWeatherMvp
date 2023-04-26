package com.example.myweather.api.models

import com.google.gson.annotations.SerializedName

data class WeatherDataResponse(
    @SerializedName("coord")
    val coord: CoordResponse?,
    @SerializedName("weather")
    val weather: List<WeatherResponse>,
    @SerializedName("base")
    val base: String?,
    @SerializedName("main")
    val main: MainResponse,
    @SerializedName("visibility")
    val visibility: Int?,
    @SerializedName("wind")
    val wind: WindResponse?,
    @SerializedName("clouds")
    val clouds: CloudsResponse?,
    @SerializedName("dt:")
    val dt: Int?,
    @SerializedName("sys")
    val sys: SysResponse?,
    @SerializedName("timezone")
    val timezone: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("cod")
    val cod: Int?
)
