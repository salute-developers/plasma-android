package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeHidden
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeLengthFive
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeLengthFour
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeLengthFourCaptionCenter
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeLengthSix
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeLengthSixNoCaption
import com.sdds.compose.uikit.fixtures.testcases.CodeFieldCodeLongText
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.codefield.CodeField
import com.sdds.serv.styles.codefield.L
import com.sdds.serv.styles.codefield.M
import com.sdds.serv.styles.codefield.Segmented
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCodeFieldScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCodeFieldSizeLDefaultCodeLengthFour() {
        composeTestRule.content {
            CodeFieldCodeLengthFour(style = CodeField.L.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performClick()
    }

    @Test
    fun testCodeFieldSizeMSegmented() {
        composeTestRule.content {
            CodeFieldCodeLengthFive(style = CodeField.M.Segmented.style())
        }
    }

    @Test
    fun testCodeFieldSizeLCodeLengthSixNoCaption() {
        composeTestRule.content {
            CodeFieldCodeLengthSixNoCaption(style = CodeField.L.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performClick()
    }

    @Test
    fun testCodeFieldSizeMSegmentedCodeLengthSix() {
        composeTestRule.content {
            CodeFieldCodeLengthSix(style = CodeField.M.Segmented.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performClick()
    }

    @Test
    fun testCodeFieldSizeLHiddenCode() {
        composeTestRule.content {
            CodeFieldCodeHidden(style = CodeField.L.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performTextInput("1234")
    }

    @Test
    fun testCodeFieldSizeLInputWrongCode() {
        composeTestRule.content {
            CodeFieldCodeLengthFourCaptionCenter(style = CodeField.L.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performTextInput("2222")
    }

    @Test
    fun testCodeFieldSizeLInputLetter() {
        composeTestRule.content {
            CodeFieldCodeLengthFourCaptionCenter(style = CodeField.L.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performTextInput("q")
    }

    @Test
    fun testCodeFieldLongText() {
        composeTestRule.content {
            CodeFieldCodeLongText(style = CodeField.L.style())
        }
    }

    @Test
    fun testCodeFieldSizeLInputCorrectCode() {
        composeTestRule.content {
            CodeFieldCodeLengthFourCaptionCenter(style = CodeField.L.style())
        }
        composeTestRule.onNodeWithTag("CodeField").performTextInput("1234")
    }
}
