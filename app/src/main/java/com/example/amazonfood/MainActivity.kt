package com.example.amazonfood

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.Button
import android.widget.DatePicker
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*
import androidx.fragment.app.FragmentManager as FragmentManager1

class MainActivity : AppCompatActivity() {
    lateinit var mCustomTitleData : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clock =findViewById<Button>(R.id.clockwise)
        clock.setOnClickListener {
            val intent = Intent ( this, ClockActivity::class.java)
            startActivity(intent)
        }
        val meter =findViewById<Button>(R.id.meter)
        meter.setOnClickListener {
            val intent = Intent ( this,ChronoMeterActivity::class.java)
            startActivity(intent)
        }
       val picker = findViewById<Button>(R.id.TimePicker)
        picker.setOnClickListener {
            val intent = Intent(this,TimePickerActivity::class.java)
            startActivity(intent)
        }
        mCustomTitleData = findViewById(R.id.button)


        mCustomTitleData.setOnClickListener {
            val fragment:DialogFragment = CustomDatePickerFragment()
            fragment.show(fragmentManager,"Date Picker")
        }
    }
    class CustomDatePickerFragment:DialogFragment(),DatePickerDialog.OnDateSetListener {
        override fun onCreateDialog(savedInstanceState: Bundle?): DatePickerDialog {

            val calender : Calendar = Calendar.getInstance()

            val year =calender.get(Calendar.YEAR)
            val month =calender.get(Calendar.MONTH)
            val day = calender.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(activity,AlertDialog.THEME_HOLO_LIGHT,this,year,month,day)
            val textView = TextView(activity)

            val layoutParams =RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT)

            textView.layoutParams = layoutParams
            textView.setPadding(20,20,20,20)
            textView.gravity = Gravity.CENTER
            textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25F)
            textView.setText("This is custom Title")
            textView.setTextColor(Color.parseColor("#ffffff"))
            textView.setBackgroundColor(Color.parseColor("#5Ac18e"))

            datePickerDialog.setCustomTitle(textView)

            return datePickerDialog
        }

        override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
            TODO("Not yet implemented")
        }
    }
}