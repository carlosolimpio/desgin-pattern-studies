package com.olimpio.study.designpatternstudy.factory

open class Temperature(
    private var tempValue: Number // celsius degrees
) : Measure {

    override fun getValue() = tempValue
    override fun setConvertedValue(convertedValue: Number) {
        tempValue = convertedValue
    }
}