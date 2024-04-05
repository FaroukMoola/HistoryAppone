package com.example.historyappone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

annotation class suppressLint(val value: String)

class MainActivity : AppCompatActivity() {

    ///declare
    private lateinit var checkButton: Button
    private lateinit var editText: EditText
    private lateinit var clearButton: Button
    private lateinit var instructionTextView: TextView


    @SuppressLint("MissingInflatedId")
    @suppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialise
        checkButton = findViewById(R.id.checkButton)
        clearButton = findViewById(R.id.clearButton)
        editText = findViewById(R.id.editTextText)
        instructionTextView = findViewById(R.id.InstructiontextView)

        checkButton.setOnClickListener {
            //create a variable of an age to get the age value from the user
            var age = editText.text.toString().toIntOrNull()

            //if age is null not null and age is in range of between 20 and 100
            if (age != null && age in 40..50)
                when {
                    age == 41 -> instructionTextView.text =
                        "No historical person of this age was found please enter another age"
                    age == 42 -> instructionTextView.text= "No historical person of this age was found please enter another age"
                }


            if (age != null && age in 20..100) {
                when {
                    age == 78 -> instructionTextView.text = "Mahatma Gandhi was a person who practiced Satyagraha toward she Brithis, he was assassinated at the age of 78 in India "

                    age == 96 -> instructionTextView.text =
                        "Queen Ellizabeth the secound was a person who became famous by being the oldest Monarch in British History she died at the age of 96 in Britian because of old age"

                    age == 36 -> instructionTextView.text =
                        "Princess Diana was a person who became famous for her work in charity such as the hospitials she opend up in remote parts of africa, she died at the age of 36 in Britian after being in a bad car crash"

                    age == 35 -> instructionTextView.text =
                        "Jan van Riebeeck was a person who became famous by being the Dutch colonial administrator who founded Cape town back in 1652 thus opening up South Africa for white settlement"

                    age == 69 -> instructionTextView.text =
                        "Marco Polo was a person who became famous because of hs book that he wrote about his travels on the silk routh, he died at the age of 69"

                    age == 24 -> instructionTextView.text =
                        "Biggie Smalls was a person who became famous because he was rooted in eastcoast hip hop and considered one of the greatest rappers of all time,he died at the age of 24 in a drive by"

                    age == 84 -> instructionTextView.text =
                        "Thomas Edison was a person who became famous because of his inventions such as the light bulb, the motion picture camara and improving the telephone,he died at the age of 84 because of a complication from diabetes"

                    age == 86 -> instructionTextView.text =
                        "Nikola Tesla was a person who became famous because he pioneered the generation " +
                                "transmission and the use of alternating current, he died at the age of 86" +
                                " because of hearth failure "

                    age == 34 -> instructionTextView.text =
                        "Yuri Gagarin became famous by being the first human to go up into space, he " +
                                "died at the age of 34 after his plane crash"



                    age == 67 -> instructionTextView.text =
                        "Leonardo da Vinci became famous because of his art work such as the Mona Lisa" +
                                " he also came up with inventions that where way ahead of there time, he " +
                                "died at the age of 67 because of a stroke "


                }

            } else {
              instructionTextView.text =  "There is no historical person at this age enter another age "
            }

              clearButton.setOnClickListener{
                  editText.text.clear()
                  instructionTextView.text=""

              }

        }


    }
}






