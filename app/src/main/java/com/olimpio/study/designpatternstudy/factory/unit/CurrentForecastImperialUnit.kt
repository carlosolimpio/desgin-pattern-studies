package com.olimpio.study.designpatternstudy.factory.unit

import com.olimpio.study.designpatternstudy.factory.util.Util

data class CurrentForecastImperialUnit(
    private var tempValue: Number,
    private var windSpeedValue: Number
) : CurrentForecast(tempValue, windSpeedValue) {

    init {
        calculateTemperature()
        calculateWindSpeed()
    }

    override fun calculateTemperature() {
        val convertedValue = Util.convertCelsiusToFarenheit(temperature.getValue())
        temperature.setConvertedValue(convertedValue)
    }

    override fun calculateWindSpeed() {
        val convertedValue = Util.convertKmphToMph(windSpeed.getValue())
        windSpeed.setConvertedValue(convertedValue)
    }

    override fun show() = temperature.getValue().toString() + "ºF " +
            windSpeed.getValue().toString() + "MPH"
}