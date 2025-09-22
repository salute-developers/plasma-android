package com.sdds.plasma.sd.service

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.codefield.CodeField
import com.sdds.plasma.sd.service.styles.codefield.L
import com.sdds.plasma.sd.service.styles.codefield.M
import com.sdds.plasma.sd.service.styles.codefield.Segmented
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.codefield.CodeFieldCodeHidden
import com.sdds.testing.compose.codefield.CodeFieldCodeLengthFive
import com.sdds.testing.compose.codefield.CodeFieldCodeLengthFour
import com.sdds.testing.compose.codefield.CodeFieldCodeLengthFourCaptionCenter
import com.sdds.testing.compose.codefield.CodeFieldCodeLengthSix
import com.sdds.testing.compose.codefield.CodeFieldCodeLengthSixNoCaption
import com.sdds.testing.compose.codefield.CodeFieldCodeLongText
import com.sdds.testing.vs.SDK_NUMBER
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
