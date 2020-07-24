package com.olimpio.study.designpatternstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.olimpio.study.designpatternstudy.factory.*

class MainActivity : AppCompatActivity() {
    lateinit var forecast: CurrentForecast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forecast = configure("imperial", 100, 100)
        log(forecast)

        forecast = configure("metric", 100, 100)
        log(forecast)
    }


    fun configure(type: String, temperatureValue: Number, windSpeedValue: Number) : CurrentForecast {
        val factory = CurrentWeatherFactory()
        return factory.createCurrentWeatherForecast(type, temperatureValue, windSpeedValue)
    }

    fun log(forecast: CurrentForecast) {
        Log.d("MEASURE", forecast.show())
    }
}



