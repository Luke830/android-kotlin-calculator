package com.dvisagie.calculator

import org.junit.Test

import org.junit.Assert.assertEquals


class StringCalculatorUnitTest {

    @Test
    fun defaultTest() {
        assertEquals(2, 2)
    }

    @Test
    fun given2plus2_ShouldReturn_4() {
        val calculator = StringCalculator()
        val answer = calculator.calculate("1+1")
        assertEquals(4, answer.toLong())
    }
}
