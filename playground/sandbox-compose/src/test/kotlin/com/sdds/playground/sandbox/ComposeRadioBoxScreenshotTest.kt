package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewMedium
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewOff
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewSmallDark
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewUnchecked
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeRadioBoxScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testRadioBoxMedium() {
        composeTestRule.setContent {
            SandboxRadioBoxPreviewMedium()
        }
    }

    @Test
    fun testRadioBoxSmallDark() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                SandboxRadioBoxPreviewSmallDark()
            }
        }
    }

    @Test
    fun testRadioBoxUnchecked() {
        composeTestRule.setContent {
            SandboxRadioBoxPreviewUnchecked()
        }
    }

    @Test
    fun testRadioBoxOff() {
        composeTestRule.setContent {
            SandboxRadioBoxPreviewOff()
        }
    }
}
