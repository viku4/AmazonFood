package com.example.amazonfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.TimePicker
import android.widget.Toast

class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        val time = findViewById<TimePicker>(R.id.TimePicker)
        time.setOnTimeChangedListener({view, hourOfDay, minute ->
            Toast.makeText(this@TimePickerActivity, "Time :- $hourOfDay:$minute", Toast.LENGTH_SHORT).show()
        })

    }
}
