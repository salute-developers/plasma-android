package com.sdds.playground.sandbox.compose

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewLDefaultInnerLeft
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewLDefaultTBTA
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewLDisabled
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewLReadOnly
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewMDefaultOuterOptional
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewMErrorOuterOptional
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewMInnerOptionalChips
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewMWarningInnerOptional
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewSDefaultInnerRight
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewSDefaultOuterRightChips
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewSLongText
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewSWarningInnerRight
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewSWarningInnerRightFocused
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewXSDefaultOuterOptional
import com.sdds.playground.sandbox.textfield.compose.SandboxTextAreaPreviewXsErrorInnerOptional
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
    fun testTextAreaPreviewMDefaultOuterOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewMDefaultOuterOptional()
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
    fun testTextAreaPreviewXsDefaultOuterOptional() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewXSDefaultOuterOptional()
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
        composeTestRule.onNodeWithTag("textField")
            .performClick()
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testTextAreaPreviewMInnerOptionalChips() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewMInnerOptionalChips()
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
