package com.example.st10486848_flashcardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Checkable
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class Flashcardscreen : AppCompatActivity() {
    var Questions: Array<String> = arrayOf<String>(
        "The first world war started in 1914",
        "The second world war started in 1945",
        "Nelson Mandela was the first president of South Africa",
        "Vlodymyr Zelensky is the current president of Ukraine",
        "Joe Biden was the last 2024 president of America"
    )
    var Answers :Array<String> =arrayOf<String>("Correct","Incorrect","Correct","Correct","Incorrect")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flashcardscreen)
        // Declarations
        val QuestionsTextView= findViewById<TextView>(R.id.QuestionsTextView)
        val TrueButton = findViewById<Button>(R.id.TrueButton)
        val FalseButton = findViewById<Button>(R.id.FalseButton)
        val NextButton = findViewById<Button>(R.id.NextButton)
        val FeedbackTextView = findViewById<TextView>(R.id.FeedbackTextView)
        val TerminateButton = findViewById<Button>(R.id.TerminateButton)
        // adding the code to displays the questions and prompt the user to answer
        for(counter in 0..Questions.count()){
            Questions += "${Questions[counter]}\n"
            QuestionsTextView.text = Questions[counter]
            TrueButton.setOnClickListener{
                FeedbackTextView.text= "Correct"
            }
            FalseButton.setOnClickListener{
                FeedbackTextView.text = "Incorrect"
            }
            NextButton.setOnClickListener {
                Questions += "${Questions[counter]}\n"
                QuestionsTextView.text = Questions[counter + 1]
                FeedbackTextView.text = "Feedback"
                TrueButton.setOnClickListener{
                    FeedbackTextView.text = "Incorrect"
                }
                FalseButton.setOnClickListener{
                    FeedbackTextView.text= "Correct"
                }
                NextButton.setOnClickListener{
                    Questions += "${Questions[counter]}\n"
                    QuestionsTextView.text = Questions[counter + 2]
                    FeedbackTextView.text = "Feedback"
                    TrueButton.setOnClickListener{
                        FeedbackTextView.text= "Correct"
                    }
                    FalseButton.setOnClickListener{
                        FeedbackTextView.text = "Incorrect"
                    }
                    NextButton.setOnClickListener{
                        Questions += "${Questions[counter]}\n"
                        QuestionsTextView.text = Questions[counter + 3]
                        FeedbackTextView.text = "Feedback"
                        TrueButton.setOnClickListener{
                            FeedbackTextView.text= "Correct"
                        }
                        FalseButton.setOnClickListener{
                            FeedbackTextView.text = "Incorrect"
                        }
                        NextButton.setOnClickListener{
                            Questions += "${Questions[counter]}\n"
                            QuestionsTextView.text = Questions[counter + 4]
                            FeedbackTextView.text = "Feedback"
                            TrueButton.setOnClickListener{
                                FeedbackTextView.text = "Incorrect"
                            }
                            FalseButton.setOnClickListener{
                                FeedbackTextView.text= "Correct"
                            }
                        }
                    }
                }
            }
            // Adding the code to open the last screen
            TerminateButton.setOnClickListener{
                val intent = Intent(this,Scorescreen::class.java)
                // start the activity
                startActivity(intent)
                //Adding code to pass the questions and answers in the last screen
                intent.putExtra("Questions",QuestionsTextView.text.toString())
                intent.putExtra("Answers",FeedbackTextView.text.toString())
            }
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}}
