package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.chip.ChipPreviewSizeLDefault
import com.sdds.playground.sandbox.chip.ChipPreviewSizeMAccent
import com.sdds.playground.sandbox.chip.ChipPreviewSizeSDisabled
import com.sdds.playground.sandbox.chip.ChipPreviewSizeXsSecondary
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
    fun testChipPreviewSizeXsSecondary() {
        composeTestRule.setContent {
            ChipPreviewSizeXsSecondary()
        }
    }

    @Test
    fun testChipPreviewSizeMAccent() {
        composeTestRule.setContent {
            ChipPreviewSizeMAccent()
        }
    }

    @Test
    fun testChipPreviewSizeSDisabled() {
        composeTestRule.setContent {
            ChipPreviewSizeSDisabled()
        }
    }
}
