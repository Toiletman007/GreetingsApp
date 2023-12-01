package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.tv1)
        val et: EditText = findViewById(R.id.et1)
        val btn = findViewById<Button>(R.id.btn1)

        btn.setOnClickListener(){
            val userName: String = et.text.toString()
            Toast.makeText(this, "Hello $userName", Toast.LENGTH_SHORT).show()
        }
    }
}