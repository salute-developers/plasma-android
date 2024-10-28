package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.chip.ChipPreviewSizeLDefault
import com.sdds.playground.sandbox.chip.ChipPreviewSizeMAccent
import com.sdds.playground.sandbox.chip.ChipPreviewSizeSDisabled
import com.sdds.playground.sandbox.chip.ChipPreviewSizeXsSecondary
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeChipScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeLDefault() {
        composeTestRule.setContent {
            ChipPreviewSizeLDefault()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeXsSecondary() {
        composeTestRule.setContent {
            ChipPreviewSizeXsSecondary()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeMAccent() {
        composeTestRule.setContent {
            ChipPreviewSizeMAccent()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeSDisabled() {
        composeTestRule.setContent {
            ChipPreviewSizeSDisabled()
        }
    }
}
