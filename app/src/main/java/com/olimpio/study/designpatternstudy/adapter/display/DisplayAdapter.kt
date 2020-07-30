package com.olimpio.study.designpatternstudy.adapter.display

import android.util.Log
import com.olimpio.study.designpatternstudy.adapter.util.TempertureUnit

class DisplayAdapter : WeatherDisplay {

    private lateinit var northAmericanDisplay: InternationalWeatherDisplay
    private lateinit var siDisplay: InternationalWeatherDisplay

    private val F = TempertureUnit.FAHRENHEIT.unit
    private val K = TempertureUnit.KELVIN.unit

    override fun showTemperature(temp: String, unit: String) {
        when (unit) {
            F -> {
                northAmericanDisplay = NorthAmericanDisplay()
                northAmericanDisplay.showInternationalInformation(temp, unit)
            }
            K -> {
                siDisplay = SIDisplay()
                siDisplay.showInternationalInformation(temp, unit)
            }
            else -> Log.d("DISPLAY", "Temperature Unit not found or invalid")
        }
    }
}