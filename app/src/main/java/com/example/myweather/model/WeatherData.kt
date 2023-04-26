package com.example.myweather.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WeatherData(
    val name: String?,
    val temp: String?,
    val speed: String?,
    val all: String?,
    val pressure: String?,
    val humidity: String?,
    val visibility: Int?,
    val description: String?,
    val deg: Int?
):Parcelable

