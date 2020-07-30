package com.olimpio.study.designpatternstudy.adapter.display

import android.util.Log
import com.olimpio.study.designpatternstudy.adapter.util.TempertureUnit

class BrazilianDisplay : WeatherDisplay {

    private lateinit var display: DisplayAdapter
    private val UNIT = TempertureUnit.CELSIUS.unit

    override fun showTemperature(temp: String, unit: String) {
        if (UNIT == unit) {
            Log.d("DISPLAY", temp + "º" + UNIT + " Brazil")
        } else {
            display = DisplayAdapter()
            display.showTemperature(temp, unit)
        }
    }
}