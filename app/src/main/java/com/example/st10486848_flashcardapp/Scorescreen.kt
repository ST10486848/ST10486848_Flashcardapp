package com.example.st10486848_flashcardapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Scorescreen : AppCompatActivity() {
    var Questions: Array<String> = arrayOf<String>(
        "The first world war started in 1914",
        "The second world war started in 1945",
        "Nelson Mandela was the first president of South Africa",
        "Vlodymyr Zelensky is the current president of Ukraine",
        "Joe Biden was the last 2024 president of America"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scorescreen)
        // Declarations
        val ScoreTextView = findViewById<TextView>(R.id.ScoreTextView)
        val TextViewFeedback = findViewById<TextView>(R.id.TextViewFeedback)
        val ReviewTextView = findViewById<TextView>(R.id.ReviewTextView)
        val ScoreButton = findViewById<Button>(R.id.ScoreButton)
        val FeedbackButton= findViewById<Button>(R.id.FeedbackButton)
        val ReviewButton = findViewById<Button>(R.id.ReviewButton)
        val ExitButton = findViewById<Button>(R.id.ExitButton)
        //Adding the code to displays the score , feedback and all the questions with answers
        val score = 0

        ScoreButton.setOnClickListener{

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}