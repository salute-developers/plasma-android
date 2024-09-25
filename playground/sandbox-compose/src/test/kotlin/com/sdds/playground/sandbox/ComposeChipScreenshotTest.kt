package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeLDefault
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeMAccent
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeSDisabled
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeXsSecondary
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
            SandboxChipPreviewSizeLDefault()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeXsSecondary() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeXsSecondary()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeMAccent() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeMAccent()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testChipPreviewSizeSDisabled() {
        composeTestRule.setContent {
            SandboxChipPreviewSizeSDisabled()
        }
    }
}
