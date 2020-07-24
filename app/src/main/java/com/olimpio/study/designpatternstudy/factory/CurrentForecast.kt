package com.olimpio.study.designpatternstudy.factory

abstract class CurrentForecast(
    private var tempValue: Number,
    private var windSpeedValue: Number
    ) {
    private var temperature = Temperature(tempValue)
    private var windSpeed = WindSpeed(windSpeedValue)

    abstract fun calculateTemperature()
    abstract fun calculateWindSpeed()
    abstract fun show(): String

    fun getAllMeasures(): ArrayList<Measure> {
        return arrayListOf<Measure>(
            temperature,
            windSpeed
        )
    }

    fun getTemperature() = temperature
    fun getWindSpeed() = windSpeed
}