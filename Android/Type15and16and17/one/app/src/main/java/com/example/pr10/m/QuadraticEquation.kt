package com.example.pr10.m

import kotlin.math.sqrt

class QuadraticEquation {
    private fun d(a: Double, b: Double, c : Double):Double
    {
        return (b*b) -4*a*c
    }
    private fun x1(a: Double, b: Double, d : Double):Double
    {
        return ((b *-1) + sqrt(d))/(2*a)
    }

    private fun x2(a: Double, b: Double, d : Double):Double
    {
        return ((b *-1) - sqrt(d))/(2*a)
    }

    private fun x1(a: Double, b: Double):Double
    {
        return ((b *-1)/(2*a))
    }

    fun quadraticEquation(aS: String, bS: String, cS : String):String {
        val a = aS.toDoubleOrNull()
        val b = bS.toDoubleOrNull()
        val c = cS.toDoubleOrNull()

        if (a != null && b != null && c != null && a != 0.0 && b != 0.0 && c != 0.0) {
            val D = d(a,b,c)

            return if(D < 0.0 ) {
                "нет решений"
            }else if (D == 0.0) {
                x1(a,b).toString()
            } else {
                x1(a,b,D).toString()+ " " + x2(a,b,D)
            }
            return "не правильный формат"
        }
        return "неправильный формат"
    }

    fun quadraticEquation(a: Double, b: Double, c : Double): List<Double> {
        var ret = mutableListOf<Double>()
        if(a != 0.0) {
            val D = d(a, b, c)

            return if (D < 0) {
                return ret.toList()
            } else if (D == 0.0) {
                ret.add(x1(a, b))
                return ret.toList()
            } else {
                ret.add(x1(a, b, D))
                ret.add(x2(a, b, D))
                return ret.toList()
            }
        }
        return ret.toList()
    }
}