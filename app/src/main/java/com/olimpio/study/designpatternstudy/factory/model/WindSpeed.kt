package com.olimpio.study.designpatternstudy.factory.model

import com.olimpio.study.designpatternstudy.factory.model.Measure

class WindSpeed(
    private var speedValue: Number // km/h as default
) : Measure {

    override fun getValue() = speedValue
    override fun setConvertedValue(convertedValue: Number) {
        speedValue = convertedValue
    }
}