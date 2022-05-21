package com.example.amazonfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class ChronoMeterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chrono_meter)

        val startBtn = findViewById<Button>(R.id.start)
        val chmeter = findViewById<Chronometer>(R.id.Cherono)
        val stopBtn = findViewById<Button>(R.id.stop)

        startBtn.setOnClickListener {
            chmeter.base = SystemClock.elapsedRealtime()
            chmeter.start()
        }
        stopBtn.setOnClickListener {
            chmeter.stop()
        }
    }
}