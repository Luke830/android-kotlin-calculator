package com.dvisagie.calculator

import org.junit.Test

import org.junit.Assert.assertEquals


class StringCalculatorUnitTest {

    @Test
    fun defaultTest() {
        assertEquals(2, 2)
    }

    @Test
    fun given_2_plus2_Should_Return_4() {

        val operationList: List<String> = arrayListOf("2","+","2")

        val calculator = StringCalculator()
        val answer = calculator.calculate(operationList)
        assertEquals(4, answer.toLong())
    }

    @Test
    fun given_4_plus_2_Should_Return_6() {
        val operationList: List<String> = arrayListOf("4","+","2")

        val calculator = StringCalculator()
        val answer = calculator.calculate(operationList)
        assertEquals(6, answer.toLong())
    }

    @Test
    fun given_4_minus_2_Should_Return_2() {
        val operationList: List<String> = arrayListOf("4","-","2")

        val calculator = StringCalculator()
        val answer = calculator.calculate(operationList)
        assertEquals(2, answer.toLong())
    }

    @Test
    fun given_6_divided_by_2_should_return_3() {
        val operationList: List<String> = arrayListOf("6","/","2")

        val calculator = StringCalculator()
        val answer = calculator.calculate(operationList)
        assertEquals(3, answer.toLong())
    }

    @Test
    fun given_2_multiplied_by_3_should_return_6() {
        val operationList: List<String> = arrayListOf("2","*","3")

        val calculator = StringCalculator()
        val answer = calculator.calculate(operationList)
        assertEquals(6, answer.toLong())
    }
}
