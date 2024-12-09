package com.example.myapplicationpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button = findViewById<Button>(R.id.button)
        val button = findViewById<Button>(R.id.button2)

        // Navigate to the next page
        Button.setOnClickListener {
            // Intent to move from MainActivity to NextActivity
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        //Exit app
        button.setOnClickListener {
            finishAffinity()
        }

        }
    }
