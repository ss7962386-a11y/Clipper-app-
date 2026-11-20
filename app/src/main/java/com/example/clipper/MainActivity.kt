package com.example.clipper

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this)
        text.text = "Clipper chal gaya!"
        text.textSize = 28f
        text.setPadding(60, 200, 60, 60)
        setContentView(text)
    }
}
