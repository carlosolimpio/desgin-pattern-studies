package com.olimpio.study.designpatternstudy.factory

class CurrentWeatherFactory {

    fun createCurrentWeatherForecast(
        type: String, tempValue: Number, windSpeedValue: Number) : CurrentForecast {
        if (type == "metric") {
            return CurrentForecastMetricUnit(tempValue, windSpeedValue)
        } else if (type == "imperial") {
            return CurrentForecastImperialUnit(tempValue, windSpeedValue)
        } else return null!!
    }
}