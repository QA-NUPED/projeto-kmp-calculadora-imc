package com.example.bmi

import org.junit.Assert.assertEquals
import org.junit.Test

class AndroidResultTest {

    @Test
    fun testResultNotice() {
        val weight = 80
        val height: Double? = null
        val expectedResult = "Please enter valid numbers"

        val actualResult = calculateBMI(weight, height)

        assertEquals(expectedResult, actualResult)
    }

    private fun calculateBMI(weight: Int, height: Double?): String {
        if (weight <= 0 || height == null || height <= 0) {
            return "Please enter valid numbers"
        }
        // lógica para calcular o BMI
        val bmi = weight / (height * height)
        return "Your BMI is $bmi"
    }
}
