package com.example.multiplicationapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputNumber: EditText
    private lateinit var submitButton: Button
    private lateinit var resultContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputNumber = findViewById(R.id.inputNumber)
        submitButton = findViewById(R.id.submitButton)
        resultContainer = findViewById(R.id.resultContainer)

        submitButton.setOnClickListener {
            val number = inputNumber.text.toString().toIntOrNull()
            if (number != null) {
                showMultiplicationTable(number)
            }
        }
    }

    private fun showMultiplicationTable(number: Int) {
        resultContainer.removeAllViews()

        for (i in 1..10) {
            val resultTextView = TextView(this)
            resultTextView.text = "$number x $i = ${number * i}"
            resultContainer.addView(resultTextView)
        }
    }
}
