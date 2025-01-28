package com.sdds.plasma.sd.service

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLDefaultInnerLeft
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLDisabled
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLInputText
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLSuccessRequiredLeftOuter
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLSuffixPrefix
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewMErrorOuterLabelOptional
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewMSuccessInnerLabelChips
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewMSuccessOuterLabel
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewMWarningInnerLabelOptional
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSOuterLabelRightChips
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSReadOnly
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSWarningInnerLabelRightFocused
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSWarningInnerRight
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXSErrorInner
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXSSuccessOuterLabelOptional
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
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldPreviewLSuffixPrefix() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuffixPrefix()
        }
    }
}
