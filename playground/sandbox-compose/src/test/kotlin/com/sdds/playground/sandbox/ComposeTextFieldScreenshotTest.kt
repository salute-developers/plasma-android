package com.sdds.playground.sandbox

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLDefaultInnerLeft
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLDisabled
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLInputText
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLSuccessRequiredLeftOuter
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLSuffixPrefix
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMErrorOuterLabelOptional
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMSuccessInnerLabelChips
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMSuccessOuterLabel
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMWarningInnerLabelOptional
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSOuterLabelRightChips
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSReadOnly
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSWarningInnerLabelRightFocused
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSWarningInnerRight
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXSErrorInner
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXSSuccessOuterLabelOptional
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
        composeTestRule.onNodeWithText("Placeholder")
            .performClick()
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
        composeTestRule.onNodeWithText("Placeholder")
            .performClick()
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldPreviewLSuffixPrefix() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuffixPrefix()
        }
    }
}
