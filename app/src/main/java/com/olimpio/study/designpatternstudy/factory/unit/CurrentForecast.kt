package com.olimpio.study.designpatternstudy.factory.unit

import com.olimpio.study.designpatternstudy.factory.model.Measure
import com.olimpio.study.designpatternstudy.factory.model.Temperature
import com.olimpio.study.designpatternstudy.factory.model.WindSpeed

abstract class CurrentForecast(
    private var tempValue: Number,
    private var windSpeedValue: Number
) {
    protected var temperature: Temperature private set
    protected var windSpeed: WindSpeed private set

    init {
       temperature = Temperature(tempValue)
       windSpeed = WindSpeed(windSpeedValue)
    }

    abstract fun calculateTemperature()
    abstract fun calculateWindSpeed()
    abstract fun show(): String

    fun getAllMeasures(): ArrayList<Measure> {
        return arrayListOf<Measure>(
            temperature,
            windSpeed
        )
    }
}