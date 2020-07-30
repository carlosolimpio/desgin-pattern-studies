package com.olimpio.study.designpatternstudy.adapter.display

interface InternationalWeatherDisplay {
    fun showInternationalInformation(temp: String, unit: String)
    fun description() : String
}