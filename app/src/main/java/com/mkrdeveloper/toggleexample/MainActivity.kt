package com.mkrdeveloper.toggleexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tgl = findViewById<ToggleButton>(R.id.toggleButton)
        val txt = findViewById<TextView>(R.id.textView)

        tgl.setOnClickListener {

            if (tgl.text == "ON")
                txt.setTextColor(Color.BLUE)
            if (tgl.text == "OFF")
                txt.setTextColor(Color.GREEN)
        }
    }
}