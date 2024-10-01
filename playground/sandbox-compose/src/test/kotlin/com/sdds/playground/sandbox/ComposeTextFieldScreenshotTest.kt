package com.sdds.playground.sandbox

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewFocused
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLInputText
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLSuccess
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLSuffixPrefix
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMDotBadgeInside
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMWarning
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSDisabled
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSReadOnly
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSSuccess
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXS
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXsChipsInside
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXsDotBadgeOutside
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXsError
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXsInputText
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeTextFieldScreenshotTest : RoborazziConfig() {

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
