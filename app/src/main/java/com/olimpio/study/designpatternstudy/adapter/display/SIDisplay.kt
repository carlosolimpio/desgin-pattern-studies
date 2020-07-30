package com.olimpio.study.designpatternstudy.adapter.display

import android.util.Log

class SIDisplay : InternationalWeatherDisplay {

    override fun showInternationalInformation(temp: String, unit: String) {
        Log.d("DISPLAY", temp + "º" + unit + description())
    }

    override fun description() = " Showing temperature as SI describes."
}