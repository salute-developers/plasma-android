package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.radiobox.RadioBoxPreviewMedium
import com.sdds.playground.sandbox.radiobox.RadioBoxPreviewOff
import com.sdds.playground.sandbox.radiobox.RadioBoxPreviewSizeM
import com.sdds.playground.sandbox.radiobox.RadioBoxPreviewSizeS
import com.sdds.playground.sandbox.radiobox.RadioBoxPreviewSmallDark
import com.sdds.playground.sandbox.radiobox.RadioBoxPreviewUnchecked
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeRadioBoxScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

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
