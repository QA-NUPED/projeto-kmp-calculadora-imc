package com.example.androidApp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bmi.BMICalculator

class MainActivity : AppCompatActivity() {
    private lateinit var weightInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var resultText: TextView
    private lateinit var calculateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weightInput = findViewById(R.id.weightInput)
        heightInput = findViewById(R.id.heightInput)
        resultText = findViewById(R.id.resultText)
        calculateButton = findViewById(R.id.calculateButton)

        val bmiCalculator = BMICalculator()

        calculateButton.setOnClickListener {
            val weight = weightInput.text.toString().toDoubleOrNull()
            val height = heightInput.text.toString().toDoubleOrNull()

            if (weight != null && height != null) {
                val bmi = bmiCalculator.calculateBMI(weight, height)
                val category = bmiCalculator.getBMICategory(bmi)
                resultText.text = "BMI: %.2f\nCategory: %s".format(bmi, category)
            } else {
                resultText.text = "Please enter valid numbers"
            }
        }
    }
}
