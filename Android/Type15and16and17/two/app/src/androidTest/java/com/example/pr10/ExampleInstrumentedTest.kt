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
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("6.0")
    }
    @Test
    fun useAddition2() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("5")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("9.0")
    }
    @Test
    fun useAddition5() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("0.2")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("4.2")
    }
    @Test
    fun useAddition6() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("0")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("29")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals("29.0")
    }
    @Test
    fun useAddition7() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithTag(MainActivity.NUMBER1_TAG).performTextInput("2")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER2_TAG).performTextInput("-8")
        composeTestRule.onNodeWithTag(MainActivity.NUMBER3_TAG).performTextInput("5")
        composeTestRule.onNodeWithTag(MainActivity.BUTTON_TAG).performClick()
        composeTestRule.onNodeWithTag(MainActivity.ANSWER_TAG).assertTextEquals(appContext.getString(R.string.no_roots))
    }
}