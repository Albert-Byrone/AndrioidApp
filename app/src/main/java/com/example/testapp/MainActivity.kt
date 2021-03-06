package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickBtn = findViewById<Button>(R.id.button)

        val myTextView = findViewById<TextView>(R.id.textView)

        var timesClicked = 0

        clickBtn.setOnClickListener{
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Clicked me", Toast.LENGTH_SHORT).show()
        }
    }
}


//button.setOnClickListener{
//    timesClicked =+ 1
//    textView.text = timesClicked.toString()
//    Toast.makeText(this@MainActivity, "Clicked me", Toast.LENGTH_SHORT).show()
//}