package com.example.gamx

import 3aaaaaandroid.os.Bundle
import android.widget.TextClock
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextClock>(R.id.hora) as TextClock
    }
}
