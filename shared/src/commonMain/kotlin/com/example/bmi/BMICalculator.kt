package com.example.bmi

class BMICalculator {
    fun calculateBMI(weight: Double, height: Double): Double {
        return weight / (height * height)
    }

    fun getBMICategory(bmi: Double): String {
        return when {
            bmi < 18.5 -> "Underweight"
            bmi < 24.9 -> "Normal weight"
            bmi < 29.9 -> "Overweight"
            else -> "Obesity"
        }
    }
}