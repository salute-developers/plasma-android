package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewDefault
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewDefaultDark
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewNegative
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewPositive
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewWarning
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeProgressBarScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testProgressBarPreviewDefault() {
        composeTestRule.setContent {
            ProgressPreviewDefault()
        }
    }

    @Test
    fun testProgressBarNegative() {
        composeTestRule.setContent {
            ProgressPreviewNegative()
        }
    }

    @Test
    fun testProgressBarWarning() {
        composeTestRule.setContent {
            ProgressPreviewWarning()
        }
    }

    @Test
    fun testProgressBarPositive() {
        composeTestRule.setContent {
            ProgressPreviewPositive()
        }
    }

    @Test
    fun testProgressBarDefaultDark() {
        composeTestRule.setContent {
            ProgressPreviewDefaultDark()
        }
    }
}
