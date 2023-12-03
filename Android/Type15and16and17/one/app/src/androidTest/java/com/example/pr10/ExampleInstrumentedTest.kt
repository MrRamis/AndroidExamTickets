package com.example.pr10

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.pr10", appContext.packageName)
    }

    @Test
    fun useAddition1() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("3")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("-1.0 -2.0")
    }
    @Test
    fun useAddition2() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-5")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("4")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("4.0 1.0")
    }
    @Test
    fun useAddition5() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-5")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("4")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("4.0 1.0")
    }
    @Test
    fun useAddition6() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("3")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("-70")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("7.0 -10.0")
    }
    @Test
    fun useAddition7() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("12")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("35")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("-5.0 -7.0")
    }
    @Test
    fun useAddition8() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("5")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("3")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("-1.0 -1.5")
    }
    @Test
    fun useAddition9() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-5")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("6")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("3.0 2.0")
    }
    @Test
    fun useAddition10() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-5")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("7")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals(appContext.getString(R.string.no_roots))
    }
    @Test
    fun useAddition11() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("0")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-5")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("7")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals(appContext.getString(R.string.numberNullIncorrect))
    }
    @Test
    fun useAddition12() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("1")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-10")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("25")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("5.0")
    }
}