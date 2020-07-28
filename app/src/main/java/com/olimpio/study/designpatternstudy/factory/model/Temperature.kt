package com.olimpio.study.designpatternstudy.factory.model

import com.olimpio.study.designpatternstudy.factory.model.Measure

open class Temperature(
    private var tempValue: Number // celsius degrees as default
) : Measure {

    override fun getValue() = tempValue
    override fun setConvertedValue(convertedValue: Number) {
        tempValue = convertedValue
    }
}