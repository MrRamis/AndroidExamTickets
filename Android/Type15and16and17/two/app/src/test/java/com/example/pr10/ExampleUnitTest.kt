package com.example.pr10

import com.example.pr10.m.QuadraticEquation
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        val quadraticEquation = QuadraticEquation()

        assertEquals(listOf(6.0),quadraticEquation.quadraticEquation(2.0,2.0,2.0) )
        assertEquals(listOf(9.0),quadraticEquation.quadraticEquation(2.0,2.0,5.0) )
        assertEquals(listOf(4.2),quadraticEquation.quadraticEquation(2.0,2.0,0.2) )
        assertEquals(listOf(29.0),quadraticEquation.quadraticEquation(2.0,0.0,29.0) )
        assertEquals(listOf(-11.0),quadraticEquation.quadraticEquation(2.0,-8.0,5.0) )
    }
}