package com.sdds.playground.sandbox.compose

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewLDefaultInnerLeft
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewLDisabled
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewLInputText
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewLSuccessRequiredLeftOuter
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewLSuffixPrefix
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewMErrorOuterLabelOptional
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewMSuccessInnerLabelChips
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewMSuccessOuterLabel
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewMWarningInnerLabelOptional
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewSOuterLabelRightChips
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewSReadOnly
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewSWarningInnerLabelRightFocused
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewSWarningInnerRight
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewXSErrorInner
import com.sdds.playground.sandbox.textfield.compose.SandboxTextFieldPreviewXSSuccessOuterLabelOptional
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTextFieldScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testTextFieldPreviewLDefaultInnerLeft() {
        composeTestRule.setContent {
            SandboxTheme {
                SandboxTextFieldPreviewLDefaultInnerLeft()
            }
        }
    }

    @Test
    fun testTextFieldPreviewMSuccessOuterLabel() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMSuccessOuterLabel()
        }
    }

    @Test
    fun testTextFieldPreviewSWarningInnerRight() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSWarningInnerRight()
        }
    }

    @Test
    fun testTextFieldPreviewXSErrorInner() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXSErrorInner()
        }
    }

    @Test
    fun testTextFieldPreviewLSuccessRequiredLeftOuter() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuccessRequiredLeftOuter()
        }
    }

    @Test
    fun testTextFieldPreviewMWarningInnerLabelOptional() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMWarningInnerLabelOptional()
        }
    }

    @Test
    fun testTextFieldPreviewReadOnly() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSReadOnly()
        }
    }

    @Test
    fun testTextFieldPreviewXSSuccessOuterLabelOptional() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXSSuccessOuterLabelOptional()
        }
    }

    @Test
    fun testTextFieldPreviewLDisabled() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLDisabled()
        }
    }

    @Test
    fun testTextFieldPreviewMErrorOuterLabelOptional() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMErrorOuterLabelOptional()
        }
    }

    @Test
    fun testTextFieldPreviewFocused() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSWarningInnerLabelRightFocused()
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
        composeTestRule.onNodeWithTag("innerTextField")
            .performTextInput("Value")
    }

    @Test
    fun testTextFieldPreviewMSuccessInnerLabelChips() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMSuccessInnerLabelChips()
        }
    }

    @Test
    fun testTextFieldPreviewSOuterLabelRightChips() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSOuterLabelRightChips()
        }
    }

    @Test
    fun testTextFieldPreviewLInputText() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLInputText()
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
        composeTestRule.onNodeWithTag("innerTextField")
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldPreviewLSuffixPrefix() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuffixPrefix()
        }
    }
}
