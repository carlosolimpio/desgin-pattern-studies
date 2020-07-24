package com.olimpio.study.designpatternstudy.factory

import com.olimpio.study.designpatternstudy.factory.Measure

class WindSpeed(
    private var speedValue: Number // km/h
) : Measure {

    override fun getValue() = speedValue
    override fun setConvertedValue(convertedValue: Number) {
        speedValue = convertedValue
    }
}