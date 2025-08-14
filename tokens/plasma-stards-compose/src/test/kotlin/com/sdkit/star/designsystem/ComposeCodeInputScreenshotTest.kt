package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthFive
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthFour
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthSix
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthSixHidden
import com.sdds.testing.compose.codeinput.CodeInputCodeLengthSixNoCaption
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.codeinput.CodeInput
import com.sdkit.star.designsystem.styles.codeinput.L
import com.sdkit.star.designsystem.styles.codeinput.M
import com.sdkit.star.designsystem.styles.codeinput.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeCodeInputScreenshotTest : RoborazziConfigCompose("+night") {

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
