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

        assertEquals(listOf(3.414213562373095, 0.5857864376269049),quadraticEquation.quadraticEquation(1.0,-4.0,2.0) )
        assertEquals(listOf(-1.0, -2.0),quadraticEquation.quadraticEquation(1.0,3.0,2.0) )
        assertEquals(listOf(4.0, 1.0),quadraticEquation.quadraticEquation(1.0,-5.0,4.0) )
        assertEquals(listOf(7.0, -10.0),quadraticEquation.quadraticEquation(1.0,3.0,-70.0) )
        assertEquals(listOf(-5.0, -7.0),quadraticEquation.quadraticEquation(1.0,12.0,35.0) )
        assertEquals(listOf(-1.0, -1.5),quadraticEquation.quadraticEquation(2.0,5.0,3.0) )
        assertEquals(listOf(3.0,2.0),quadraticEquation.quadraticEquation(1.0,-5.0,6.0) )
        assertEquals(listOf<Double>() ,quadraticEquation.quadraticEquation(1.0,-5.0,7.0) )
        assertEquals(listOf(5.0),quadraticEquation.quadraticEquation(1.0,-10.0,25.0) )
        assertEquals(listOf<Double>(),quadraticEquation.quadraticEquation(0.0,0.0,0.0) )
    }
}