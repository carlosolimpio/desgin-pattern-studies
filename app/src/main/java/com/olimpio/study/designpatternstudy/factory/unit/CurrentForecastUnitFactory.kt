package com.olimpio.study.designpatternstudy.factory.unit

import com.olimpio.study.designpatternstudy.factory.unit.MeasureUnit.*

class CurrentWeatherUnitFactory {
    fun createCurrentWeatherForecast(
        type: String, tempValue: Number, windSpeedValue: Number) : CurrentForecast? {
        return when (type) {
            METRIC.name -> CurrentForecastMetricUnit(
                tempValue,
                windSpeedValue
            )
            IMPERIAL.name -> CurrentForecastImperialUnit(
                tempValue,
                windSpeedValue
            )
            else -> null
        }
    }
}

enum class MeasureUnit { METRIC, IMPERIAL }