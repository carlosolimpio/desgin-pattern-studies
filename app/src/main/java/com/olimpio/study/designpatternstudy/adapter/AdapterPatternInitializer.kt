package com.olimpio.study.designpatternstudy.adapter

import com.olimpio.study.designpatternstudy.adapter.display.BrazilianDisplay

object AdapterPatternInitializer {
    private var brDisplay = BrazilianDisplay()

    fun run() {
        brDisplay.showTemperature("10", "C")
        brDisplay.showTemperature("10", "F")
        brDisplay.showTemperature("10", "K")
        brDisplay.showTemperature("10", "X")
    }
}