package com.olimpio.study.designpatternstudy.adapter.display

import android.util.Log

class NorthAmericanDisplay : InternationalWeatherDisplay {

    override fun showInternationalInformation(temp: String, unit: String) {
        Log.d("DISPLAY", temp + "º" + unit + description())
    }

    override fun description() = " a NA temperature display."
}