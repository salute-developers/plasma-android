package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewCheckedSizeSmall
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewOffSizeSmall
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewOnSizeMediumNoDesc
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewOnSizeMediumNoLabel
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewSizeMediumNoLabelAndDesc
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewUncheckedSizeMedium
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeCheckBoxScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testCheckBoxUncheckedSizeMedium() {
        composeTestRule.setContent {
            SandboxCheckBoxPreviewUncheckedSizeMedium()
        }
    }

    @Test
    fun testCheckBoxCheckedSizeSmallDark() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                SandboxCheckBoxPreviewCheckedSizeSmall()
            }
        }
    }

    @Test
    fun testCheckBoxOffSizeSmall() {
        composeTestRule.setContent {
            SandboxCheckBoxPreviewOffSizeSmall()
        }
    }

    @Test
    fun testCheckBoxOnSizeMediumNoDesc() {
        composeTestRule.setContent {
            SandboxCheckBoxPreviewOnSizeMediumNoDesc()
        }
    }

    @Test
    fun testCheckBoxOnSizeMediumNoLabel() {
        composeTestRule.setContent {
            SandboxCheckBoxPreviewOnSizeMediumNoLabel()
        }
    }

    @Test
    fun testCheckBoxSizeMediumNoLabelAndDesc() {
        composeTestRule.setContent {
            SandboxCheckBoxPreviewSizeMediumNoLabelAndDesc()
        }
    }
}
