package com.example.myapplicationpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val Button = findViewById<Button>(R.id.button3)

        // Navigate to the next page
        Button.setOnClickListener {
            // Intent to move from MainActivity to NextActivity
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}