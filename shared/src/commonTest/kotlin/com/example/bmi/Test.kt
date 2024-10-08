package com.example.bmi

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BMICalculatorTest {

    private val bmiCalculator = BMICalculator()

    @Test
    fun testCalculateBMI() {
        val weight = 70.0
        val height = 1.75
        val expectedBMI = 22.86

        val actualBMI = bmiCalculator.calculateBMI(weight, height)
        assertEquals(expectedBMI, actualBMI, 0.01)
    }

    @Test
    fun testCalculateBMIFail() {
        val weight = 70.0
        val height = 1.50
        val expectedBMI = 32.45

        val actualBMI = bmiCalculator.calculateBMI(weight, height)
        assertNotEquals(expectedBMI, actualBMI, 0.01)
    }

    @Test
    fun testUnderweightCategory() {
        val bmi = 18.4
        val expectedCategory = "Underweight"

        val actualCategory = bmiCalculator.getBMICategory(bmi)
        assertEquals(expectedCategory, actualCategory)
    }

    @Test
    fun testUnderweightCategoryFail() {
        val bmi = 18.6
        val expectedCategory = "Underweight"

        val actualCategory = bmiCalculator.getBMICategory(bmi)
        assertNotEquals(expectedCategory, actualCategory)
    }

    @Test
    fun testNormalWeightCategory() {
        val bmi = 22.0
        val expectedCategory = "Normal weight"

        val actualCategory = bmiCalculator.getBMICategory(bmi)
        assertEquals(expectedCategory, actualCategory)
    }

    @Test
    fun testOverweightCategory() {
        val bmi = 27.0
        val expectedCategory = "Overweight"

        val actualCategory = bmiCalculator.getBMICategory(bmi)
        assertEquals(expectedCategory, actualCategory)
    }

    @Test
    fun testObesityCategory() {
        val bmi = 32.0
        val expectedCategory = "Obesity"

        val actualCategory = bmiCalculator.getBMICategory(bmi)
        assertEquals(expectedCategory, actualCategory)
    }
}