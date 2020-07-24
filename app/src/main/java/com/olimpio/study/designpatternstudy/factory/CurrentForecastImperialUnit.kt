package com.olimpio.study.designpatternstudy.factory

class CurrentForecastImperialUnit(
    private var tempValue: Number,
    private var windSpeedValue: Number
) : CurrentForecast(tempValue, windSpeedValue) {

    init {
        calculateTemperature()
        calculateWindSpeed()
    }

    override fun calculateTemperature() {
        val temp = super.getTemperature()
        val convertedValue = Util.convertCelsiusToFarenheit(temp.getValue())
        temp.setConvertedValue(convertedValue)
    }

    override fun calculateWindSpeed() {
        val speed = super.getWindSpeed()
        val convertedValue = Util.convertKmphToMph(speed.getValue())
        speed.setConvertedValue(convertedValue)
    }

    override fun show() = super.getTemperature().getValue().toString() + "ºF " +
            super.getWindSpeed().getValue().toString() + "MPH"
}