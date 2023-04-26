package com.example.utils.viewbinding

import kotlin.math.roundToInt

fun translateTemp(temp: Double?): String {
    val descriptionOfTemp = " °C"
    val tempData = temp?.roundToInt()
    return buildString {
        append(tempData)
            .append(descriptionOfTemp)
    }
}