package com.example.pr10.vm

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.example.pr10.m.QuadraticEquation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.subscribe
import kotlinx.coroutines.flow.update

enum class StateView{
    Number1Eroror, Number2Eroror, Number3Eroror, NoRoots, OK, NoResult,NoNull
}

class QEVM() : ViewModel() {
    val quadraticEquation = QuadraticEquation()
    private val resultP = MutableStateFlow (StateView.NoResult to "")

    val result = resultP.asStateFlow()

    fun po(a: String, b: String, c: String) {
        val number1: Double? = a.toDoubleOrNull()
        val number2: Double? = b.toDoubleOrNull()
        val number3: Double? = c.toDoubleOrNull()


        if (number1 == null)
            resultP.update { re -> re.copy(first = StateView.Number1Eroror, second = "") }
        else if (number1 == 0.0)
            resultP.update { re -> re.copy(first = StateView.NoNull, second = "") }
        else if (number2 == null)
            resultP.update { re -> re.copy(first = StateView.Number2Eroror, second = "") }
        else if (number3 == null)
            resultP.update { re -> re.copy(first = StateView.Number3Eroror, second = "") }
        else {
            var ret = quadraticEquation.quadraticEquation(number1, number2, number3)
            when (ret.count()) {
                0 -> resultP.update { re -> re.copy(first = StateView.NoRoots, second = "") }
                1 -> resultP.update { re ->
                    re.copy(
                        first = StateView.OK,
                        second = ret[0].toString()
                    )
                }
            }
        }
    }
}