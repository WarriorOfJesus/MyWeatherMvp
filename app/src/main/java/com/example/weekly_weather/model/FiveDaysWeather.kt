package com.example.weekly_weather.model

import android.os.Parcelable
import com.example.myweather.model.Clouds
import com.example.myweather.model.Weather
import com.example.myweather.model.Wind
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FiveDaysWeather(
    val dt: Long,
    val temp: String?,
    val speed: String?,
    val all: String?,
    val pressure: String?,
    val humidity: String?,
    val visibility: Int?,
    val description: String?,
    val deg: Int?,
    val dt_txt: String
):Parcelable
