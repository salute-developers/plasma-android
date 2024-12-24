package com.sdds.plasma.sd.service

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewLDefaultInnerLeft
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewLDefaultTBTA
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewLDisabled
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewLReadOnly
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewMErrorOuterOptional
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewMSuccessInnerOptionalChips
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewMSuccessOuterOptional
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewMWarningInnerOptional
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewSDefaultInnerRight
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewSDefaultOuterRightChips
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewSLongText
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewSWarningInnerRight
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewSWarningInnerRightFocused
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewXSSuccessOuterOptional
import com.sdds.plasma.sd.service.sandbox.textfield.SandboxTextAreaPreviewXsErrorInnerOptional
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
        composeTestRule.onNodeWithTag("textField")
            .performClick()
        composeTestRule.mainClock.advanceTimeByFrame()
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
