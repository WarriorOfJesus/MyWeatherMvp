package com.example.myweather.api.models

import com.google.gson.annotations.SerializedName

data class CoordResponse(
    @SerializedName("lon")
    val lon: Double,
    @SerializedName("lat")
    val lat: Double
)
