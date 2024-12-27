package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxGroupPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxGroupPreviewSizeMDescription
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxGroupPreviewSizeS
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxGroupPreviewSizeSLabel
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewDisabled
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewSizeMNoDescription
import com.sdds.plasma.sd.service.sandbox.radiobox.RadioBoxPreviewSizeS
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
    fun testRadioBoxPreviewSizeM() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeM()
        }
    }

    @Test
    fun testRadioBoxPreviewSizeS() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeS()
        }
    }

    @Test
    fun testRadioBoxPreviewSizeMNoDescription() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeMNoDescription()
        }
    }

    @Test
    fun testRadioBoxPreviewDisabled() {
        composeTestRule.setContent {
            RadioBoxPreviewDisabled()
        }
    }

    @Test
    fun testRadioBoxGroupSizeM() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeM()
        }
    }

    @Test
    fun testRadioBoxGroupSizeS() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeS()
        }
    }

    @Test
    fun testRadioBoxGroupSizeMDescription() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeMDescription()
        }
    }

    @Test
    fun testRadioBoxGroupSizeSLabel() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeSLabel()
        }
    }
}
