package com.olimpio.study.designpatternstudy.factory

import android.util.Log
import com.olimpio.study.designpatternstudy.factory.unit.CurrentForecast
import com.olimpio.study.designpatternstudy.factory.unit.CurrentWeatherUnitFactory

object FactoryPatternInitializer {
    var forecast: CurrentForecast? = null

    fun run() {
        forecast = configure("IMPERIAL", 100, 100)
        log(forecast)

        forecast = configure("METRIC", 100, 100)
        log(forecast)
    }

    private fun configure(type: String, temperatureValue: Number, windSpeedValue: Number) : CurrentForecast? {
        val factory =
            CurrentWeatherUnitFactory()
        return factory.createCurrentWeatherForecast(type, temperatureValue, windSpeedValue)
    }

    private fun log(forecast: CurrentForecast?) {
        Log.d("MEASURE", forecast?.show())
    }
}