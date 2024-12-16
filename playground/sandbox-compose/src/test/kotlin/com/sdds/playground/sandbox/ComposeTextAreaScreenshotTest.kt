package com.sdds.playground.sandbox

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewLDefaultInnerLeft
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewLDefaultTBTA
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewLDisabled
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewLReadOnly
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewMErrorOuterOptional
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewMSuccessInnerOptionalChips
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewMSuccessOuterOptional
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewMWarningInnerOptional
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewSDefaultInnerRight
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewSDefaultOuterRightChips
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewSLongText
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewSWarningInnerRight
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewSWarningInnerRightFocused
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewXSSuccessOuterOptional
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewXsErrorInnerOptional
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTextAreaScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testTextAreaPreviewLDefaultInnerLeft() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewLDefaultInnerLeft()
        }
    }

    @Test
    fun testTextAreaPreviewMSuccessOuterOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewMSuccessOuterOptional()
        }
    }

    @Test
    fun testTextAreaPreviewSWarningInnerRight() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewSWarningInnerRight()
        }
    }

    @Test
    fun testTextAreaPreviewXsErrorInnerOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewXsErrorInnerOptional()
        }
    }

    @Test
    fun testTextAreaPreviewLReadOnly() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewLReadOnly()
        }
    }

    @Test
    fun testTextAreaPreviewMWarningInnerOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewMWarningInnerOptional()
        }
    }

    @Test
    fun testTextAreaPreviewSDefaultInnerRight() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewSDefaultInnerRight()
        }
    }

    @Test
    fun testTextAreaPreviewXsSuccessOuterOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewXSSuccessOuterOptional()
        }
    }

    @Test
    fun testTextAreaPreviewDisabled() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewLDisabled()
        }
    }

    @Test
    fun testTextAreaPreviewMErrorOuterOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewMErrorOuterOptional()
        }
    }

    @Test
    fun testTextAreaPreviewSWarningInnerRightFocused() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewSWarningInnerRightFocused()
        }
        composeTestRule.onNodeWithText("Placeholder")
            .performClick()
    }

    @Test
    fun testTextAreaPreviewMSuccessInnerOptionalChips() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewMSuccessInnerOptionalChips()
        }
    }

    @Test
    fun testTextAreaPreviewSDefaultOuterRightChips() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewSDefaultOuterRightChips()
        }
    }

    @Test
    fun testTextAreaPreviewSLongText() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewSLongText()
        }
    }

    @Test
    fun testTextAreaPreviewLDefaultTBTA() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewLDefaultTBTA()
        }
    }
}
