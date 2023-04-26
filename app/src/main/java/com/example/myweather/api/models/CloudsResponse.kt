package com.example.myweather.api.models

import com.google.gson.annotations.SerializedName

data class CloudsResponse(
    @SerializedName("all")
    val all: Int?
)
