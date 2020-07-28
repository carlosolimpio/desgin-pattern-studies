package com.olimpio.study.designpatternstudy.factory.unit

import com.olimpio.study.designpatternstudy.factory.unit.CurrentForecast

data class CurrentForecastMetricUnit(
    private var tempValue: Number,
    private var windSpeedValue: Number
) : CurrentForecast(tempValue, windSpeedValue) {

    init {
        calculateTemperature()
        calculateWindSpeed()
    }

    // nothing to do here since the values come in metric units
    override fun calculateTemperature() {}

    override fun calculateWindSpeed() {}

    override fun show(): String {
        return temperature.getValue().toString() + "ºC " +
                windSpeed.getValue().toString() + "Km/H"
    }
}