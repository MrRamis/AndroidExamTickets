@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.pr10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.pr10.ui.theme.Pr10Theme
import com.example.pr10.vm.QEVM
import com.example.pr10.vm.StateView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel:QEVM by viewModels()

        setContent {
            Pr10Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(viewModel,"Android")
                }
            }
        }
    }

    companion object{
        const val NUMBER1_TAG = "NUMBER1"
        const val NUMBER2_TAG = "NUMBER2"
        const val NUMBER3_TAG = "NUMBER3"
        const val BUTTON_TAG = "BUTTON"
        const val ANSWER_TAG = "ANSWER"
        const val ERROR_TAG = "ERROR"
    }
}

@Composable
fun Greeting( vm: QEVM,name: String, modifier: Modifier = Modifier) {
  //  val viewModel:QEVM by viewModels()

    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
        var number1S by remember { mutableStateOf("") }
        var number2S by remember { mutableStateOf("") }
        var number3S by remember { mutableStateOf("") }
        EnterNumber(
            number = number1S,
            label = (stringResource(R.string.enter_number)),
            onChanger = { number1S = it },
            modifier = Modifier.testTag(MainActivity.NUMBER1_TAG)
        )
        EnterNumber(
            number = number2S,
            label = (stringResource(R.string.enter_number)),
            onChanger = { number2S = it },
            modifier = Modifier.testTag(MainActivity.NUMBER2_TAG)
        )
        EnterNumber(
            number = number3S,
            label = (stringResource(R.string.enter_number)),
            onChanger = { number3S = it },
            modifier = Modifier.testTag(MainActivity.NUMBER3_TAG)
        )
        Button(onClick = {
            vm.po(number1S, number2S, number3S)
        }, modifier = Modifier.testTag(MainActivity.BUTTON_TAG)) {
            Text(text = (stringResource(R.string.сount)))
        }

        val res by vm.result.collectAsState()

        if (res.first == StateView.Number1Eroror)
            Text(
                text = stringResource(R.string.numder1incorrect),
                modifier = Modifier.testTag(MainActivity.ANSWER_TAG)
            )
        else if (res.first == StateView.Number2Eroror)
            Text(
                text = stringResource(R.string.number2incorrect),
                modifier = Modifier.testTag(MainActivity.ANSWER_TAG)
            )
        else if (res.first == StateView.Number3Eroror)
            Text(
                text = stringResource(R.string.number3incorrect),
                modifier = Modifier.testTag(MainActivity.ANSWER_TAG)
            )
        else if (res.first == StateView.NoNull)






            Text(
                text = stringResource(R.string.numberNullIncorrect),
                modifier = Modifier.testTag(MainActivity.ANSWER_TAG)
            )
        else if (res.first == StateView.NoRoots)
            Text(
                text = stringResource(R.string.no_roots),
                modifier = Modifier.testTag(MainActivity.ANSWER_TAG)
            )
        else if (res.first == StateView.OK)
            Text(
                text = "${res.second}",
                modifier = Modifier.testTag(MainActivity.ANSWER_TAG)
            )


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterNumber(number: String,
                label : String,
                onChanger: (String)-> Unit,
                modifier: Modifier = Modifier) {
    TextField(
        value = number, onValueChange = {
            onChanger(it)
        },
        label = {
            Text(
                label,
                style = MaterialTheme.typography.labelMedium
            )
        }, shape = MaterialTheme.shapes.medium,
        modifier = modifier
    )
}
