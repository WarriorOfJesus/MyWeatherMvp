package com.example.weekly_weather.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailWeatherData(
    val list: List<FiveDaysWeather>
) : Parcelable