package com.sdds.plasma.sd.service

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewFocused
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLInputText
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLSuccess
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewLSuffixPrefix
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewMDotBadgeInside
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewMWarning
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSDisabled
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSReadOnly
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewSSuccess
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXS
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXsChipsInside
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXsDotBadgeOutside
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXsError
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextFieldPreviewXsInputText
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
    fun testTextFieldPreviewXs() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                SandboxTextFieldPreviewXS()
            }
        }
    }

    @Test
    fun testTextFieldPreviewXsError() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXsError()
        }
    }

    @Test
    fun testTextFieldPreviewLSuccess() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuccess()
        }
    }

    @Test
    fun testTextFieldPreviewMWarning() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMWarning()
        }
    }

    @Test
    fun testTextFieldPreviewDisabled() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSDisabled()
        }
    }

    @Test
    fun testTextFieldPreviewSSuccess() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSSuccess()
        }
    }

    @Test
    fun testTextFieldPreviewReadOnly() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSReadOnly()
        }
    }

    @Test
    fun testTextFieldPreviewLInputText() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLInputText()
        }
    }

    @Test
    fun testTextFieldPreviewXsInputText() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXsInputText()
        }
    }

    @Test
    fun testTextFieldPreviewHasDotBadgeOutside() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXsDotBadgeOutside()
        }
    }

    @Test
    fun testTextFieldPreviewHasDotBadgeInside() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMDotBadgeInside()
        }
    }

    @Test
    fun testTextFieldPreviewXsChipsInside() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXsChipsInside()
        }
    }

    @Test
    fun testTextFieldPreviewLSuffixPrefix() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuffixPrefix()
        }
    }

    @Test
    fun testTextFieldPreviewFocused() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewFocused()
        }
        composeTestRule.onNodeWithText("Placeholder")
            .performClick()
    }
}
