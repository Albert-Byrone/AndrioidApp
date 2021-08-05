package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var click_btn = findViewById(R.id.button) as Button

        click_btn.setOnClickListener{
            Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}