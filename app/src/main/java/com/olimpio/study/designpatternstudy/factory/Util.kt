package com.olimpio.study.designpatternstudy.factory

class Util {

    companion object {
        fun convertCelsiusToFarenheit(value: Number) = ((value.toDouble() * 9) / 5) + 32
        fun convertKmphToMph(value: Number) = value.toDouble() * 1.60934
    }
}