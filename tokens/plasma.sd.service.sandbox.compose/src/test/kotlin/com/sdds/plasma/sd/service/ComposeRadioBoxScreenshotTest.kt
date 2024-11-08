package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewMedium
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewOff
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewSizeS
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewSmallDark
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewUnchecked
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
            RadioBoxPreviewMedium()
        }
    }

    @Test
    fun testRadioBoxSmallDark() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                RadioBoxPreviewSmallDark()
            }
        }
    }

    @Test
    fun testRadioBoxUnchecked() {
        composeTestRule.setContent {
            RadioBoxPreviewUnchecked()
        }
    }

    @Test
    fun testRadioBoxOff() {
        composeTestRule.setContent {
            RadioBoxPreviewOff()
        }
    }

    @Test
    fun testRadioBoxGroupSizeM() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeM()
        }
    }

    @Test
    fun testRadioBoxGroupSizeS() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeS()
        }
    }
}
