package com.example.amazonfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.Toast

class ClockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)
        val tClock = findViewById<TextClock>(R.id.Clock)
        tClock.setOnClickListener {
            Toast.makeText(this@ClockActivity,"This is textClock",Toast.LENGTH_LONG).show()
        }
    }
}