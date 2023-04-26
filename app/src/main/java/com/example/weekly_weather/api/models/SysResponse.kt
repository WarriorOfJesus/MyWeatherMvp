package com.example.weekly_weather.api.models

import com.google.gson.annotations.SerializedName

data class SysResponse(
    @SerializedName("pod")
    val pod : String
    )