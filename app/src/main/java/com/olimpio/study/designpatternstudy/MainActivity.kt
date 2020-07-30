package com.olimpio.study.designpatternstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olimpio.study.designpatternstudy.adapter.AdapterPatternInitializer
import com.olimpio.study.designpatternstudy.factory.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AdapterPatternInitializer.run()
    }
}