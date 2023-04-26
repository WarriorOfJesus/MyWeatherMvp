package com.example.myweather.api.models

import com.google.gson.annotations.SerializedName

data class MainResponse(
    @SerializedName("temp")
    val temp: Double?,
    @SerializedName("feels_like")
    val feelsLike: Float?,
    @SerializedName("temp_min")
    val tempMin: Float?,
    @SerializedName("temp_max")
    val tempMax: Float?,
    @SerializedName("pressure")
    val pressure: Int?,
    @SerializedName("humidity")
    val humidity: Int?,
    @SerializedName("sea_level")
    val seaLevel: Int?,
    @SerializedName("grnd_level")
    val grndLevel: Int?,
    @SerializedName("tempKf")
    val tempKf: Double?
)