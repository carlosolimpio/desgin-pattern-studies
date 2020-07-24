package com.olimpio.study.designpatternstudy.factory

class CurrentForecastMetricUnit(
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
        return super.getTemperature().getValue().toString() + "ºC " +
                super.getWindSpeed().getValue().toString() + "Km/H"
    }
}