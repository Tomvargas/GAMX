package com.example.gamx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextClock>(R.id.hora) as TextClock
    }
}
