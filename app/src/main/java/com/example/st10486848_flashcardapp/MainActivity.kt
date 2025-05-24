package com.example.st10486848_flashcardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    val Welcome = arrayOf<String>(
        "Welcome to hystory quiz",
        "click on start to begin the quiz", "you will be asked 5 questions about history",
        "each questions is worth 1 point",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val WelcomeTextView = findViewById<TextView>(R.id.WelcomeTextView)
        // Adding our messages inside the WelcomeTextView
        WelcomeTextView.text =Arrays.toString(Welcome)
        val StartButton=findViewById<Button>(R.id.StartButton)
        // Adding the code to open the second screen
        StartButton.setOnClickListener {
            val intent = Intent(this,Flashcardscreen::class.java)
            // start the acivity
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}




