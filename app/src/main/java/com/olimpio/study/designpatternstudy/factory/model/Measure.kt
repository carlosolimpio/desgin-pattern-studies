package com.olimpio.study.designpatternstudy.factory.model

interface Measure {

    fun getValue(): Number
    fun setConvertedValue(convertedValue: Number)
}