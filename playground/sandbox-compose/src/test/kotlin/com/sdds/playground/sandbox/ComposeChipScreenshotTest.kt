package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeMAccent
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeMDefault
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeSDisabled
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeXsSecondary
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
    fun testChipPreviewSizeMDefault() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeMDefault()
        }
    }

    @Test
    fun testChipPreviewSizeXsSecondary() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeXsSecondary()
        }
    }

    @Test
    fun testChipPreviewSizeMAccent() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeMAccent()
        }
    }

    @Test
    fun testChipPreviewSizeSDisabled() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeSDisabled()
        }
    }
}
