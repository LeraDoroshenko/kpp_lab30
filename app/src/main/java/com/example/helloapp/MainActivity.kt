package com.example.helloapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val t1: TextView = findViewById(R.id.text1)
        val t2: TextView = findViewById(R.id.text2)
        val buttonChangeText: Button = findViewById(R.id.buttonChangeText)

        t2.text = "ФІТ 4-6"

        buttonChangeText.setOnClickListener {
            t1.text = "Ім'я"
            t2.text = "Група"
        }
    }
}