package com.olimpio.study.designpatternstudy.factory.util

object Util {
    fun convertCelsiusToFarenheit(value: Number) = ((value.toDouble() * 9) / 5) + 32
    fun convertKmphToMph(value: Number) = value.toDouble() * 1.60934
}