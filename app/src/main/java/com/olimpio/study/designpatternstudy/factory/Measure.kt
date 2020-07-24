package com.olimpio.study.designpatternstudy.factory

interface Measure {

    fun getValue(): Number
    fun setConvertedValue(convertedValue: Number)
}