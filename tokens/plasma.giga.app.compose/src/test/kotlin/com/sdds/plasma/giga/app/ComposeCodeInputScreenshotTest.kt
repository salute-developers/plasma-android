package com.sdds.plasma.giga.app

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.codeinput.CodeInput
import com.sdds.plasma.giga.app.styles.codeinput.L
import com.sdds.plasma.giga.app.styles.codeinput.M
import com.sdds.plasma.giga.app.styles.codeinput.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthFive
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthFour
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthSix
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthSixHidden
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthSixNoCaption
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCodeInputScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCodeInputSizeLCodeLengthFourCaptionStart() {
        composeTestRule.content {
            CodeInputCodeLengthFour(style = CodeInput.L.style())
        }
    }

    @Test
    fun testCodeInputSizeMCodeLengthFiveCaptionCenter() {
        composeTestRule.content {
            CodeInputCodeLengthFive(style = CodeInput.M.style())
        }
    }

    @Test
    fun testCodeInputSizeSCodeLengthSix() {
        composeTestRule.content {
            CodeInputCodeLengthSix(style = CodeInput.S.style())
        }
    }

    @Config(qualifiers = "land")
    @Test
    fun testCodeInputSizeLNoCaption() {
        composeTestRule.content {
            CodeInputCodeLengthSixNoCaption(style = CodeInput.L.style())
        }
    }

    @Test
    fun testCodeInputSizeMHidden() {
        composeTestRule.content {
            CodeInputCodeLengthSixHidden(style = CodeInput.M.style())
        }
        composeTestRule
            .onNodeWithTag("CodeInput")
            .performTextInput("2")
    }

    @Test
    fun testCodeInputCorrectNumber() {
        composeTestRule.content {
            CodeInputCodeLengthFour(style = CodeInput.L.style())
        }
        composeTestRule
            .onNodeWithTag("CodeInput")
            .performTextInput("1234")
    }

    @Config(qualifiers = "land")
    @Test
    fun testCodeInputWrongCode() {
        composeTestRule.content {
            CodeInputCodeLengthSix(style = CodeInput.L.style())
        }
        composeTestRule
            .onNodeWithTag("CodeInput")
            .performTextInput("222333")
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.mainClock.advanceTimeBy(100)
    }

    @Config(qualifiers = "land")
    @Test
    fun testCodeInputWrongCodeCaption() {
        composeTestRule.content {
            CodeInputCodeLengthSix(style = CodeInput.L.style())
        }
        composeTestRule
            .onNodeWithTag("CodeInput")
            .performTextInput("222333")
    }
}
