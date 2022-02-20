package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleButton = findViewById<Button>(R.id.simple_button)
        val textView = findViewById<TextView>(R.id.text_view)

        var simpleClicked = false

        simpleButton.setOnClickListener {
            simpleClicked = if (!simpleClicked) {
                textView.setText(R.string.hello_world_lt)
                true
            } else {
                textView.setText(R.string.hello_world)
                false
            }
        }
    }
}