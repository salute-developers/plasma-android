package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.chip.ChipPreviewSizeLDefault
import com.sdds.plasma.sd.service.sandbox.chip.ChipPreviewSizeMSecondaryPilled
import com.sdds.plasma.sd.service.sandbox.chip.ChipPreviewSizeSAccentDisabled
import com.sdds.plasma.sd.service.sandbox.chip.ChipPreviewSizeXSContentLeft
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeChipScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testChipPreviewSizeLDefault() {
        composeTestRule.setContent {
            ChipPreviewSizeLDefault()
        }
    }

    @Test
    fun testChipPreviewSizeMSecondaryPilled() {
        composeTestRule.setContent {
            ChipPreviewSizeMSecondaryPilled()
        }
    }

    @Test
    fun testChipPreviewSizeSAccentDisabled() {
        composeTestRule.setContent {
            ChipPreviewSizeSAccentDisabled()
        }
    }

    @Test
    fun testChipPreviewSizeXSContentLeft() {
        composeTestRule.setContent {
            ChipPreviewSizeXSContentLeft()
        }
    }
}
