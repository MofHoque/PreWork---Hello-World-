package com.mofassarul.helloworld

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var statusTextView: TextView
    private lateinit var statusButtonView: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        statusTextView = findViewById(R.id.textView_id)
        statusButtonView = findViewById(R.id.ButtonID)

        statusButtonView.setOnClickListener {
            var myName = "Mofassarul"
            statusTextView.setText("Hello "+myName);
            val randomColor = Random()
            val color = Color.argb(255, randomColor.nextInt(256), randomColor.nextInt(256), randomColor.nextInt(256))
            statusTextView.setTextColor(color)


        }
    }


}