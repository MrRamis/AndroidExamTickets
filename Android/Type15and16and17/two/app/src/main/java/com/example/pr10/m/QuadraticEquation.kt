package com.example.pr10.m

import kotlin.math.sqrt

class QuadraticEquation {
    private fun d(a: Double, x: Double, b : Double):Double
    {
        return a*x+b
    }

    fun quadraticEquation(a: Double, x: Double, b : Double): List<Double> {
        val ret = mutableListOf<Double>()
        ret.add(d(a, x, b))
        return ret.toList()
    }
}