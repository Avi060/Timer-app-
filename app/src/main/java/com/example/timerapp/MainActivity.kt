package com.example.timerapp

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        }


    fun clickHandler_1(view: View) {
        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "Milk")
            putExtra(AlarmClock.EXTRA_LENGTH, 180)
            putExtra(AlarmClock.EXTRA_SKIP_UI, false)
        }
        startActivity(intent)
    }
    fun clickHandler_2(view: View) {
        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_LENGTH, 120)
            putExtra(AlarmClock.EXTRA_MESSAGE, "Water Motor")
            putExtra(AlarmClock.EXTRA_SKIP_UI, false)
        }
        startActivity(intent)

    }
    fun clickHandler_3(view: View) {
        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "toaster")
            putExtra(AlarmClock.EXTRA_LENGTH, 240)
            putExtra(AlarmClock.EXTRA_SKIP_UI, false)
        }
        startActivity(intent)

    }
}