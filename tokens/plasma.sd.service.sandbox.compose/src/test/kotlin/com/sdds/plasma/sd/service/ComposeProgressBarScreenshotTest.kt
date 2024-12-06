package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewAccent
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewDefault
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewDefaultValueOne
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewGradientAccent
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewNegative
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewPositive
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewSecondary
import com.sdds.plasma.sd.service.sandbox.progress.ProgressPreviewWarning
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeProgressBarScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

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
    fun testProgressBarPreviewSecondary() {
        composeTestRule.setContent {
            ProgressPreviewSecondary()
        }
    }

    @Test
    fun testProgressBarPreviewWarning() {
        composeTestRule.setContent {
            ProgressPreviewWarning()
        }
    }

    @Test
    fun testProgressBarPreviewPositive() {
        composeTestRule.setContent {
            ProgressPreviewPositive()
        }
    }

    @Test
    fun testProgressBarPreviewNegative() {
        composeTestRule.setContent {
            ProgressPreviewNegative()
        }
    }

    @Test
    fun testProgressBarPreviewAccent() {
        composeTestRule.setContent {
            ProgressPreviewAccent()
        }
    }

    @Test
    fun testProgressBarPreviewGradientAccent() {
        composeTestRule.setContent {
            ProgressPreviewGradientAccent()
        }
    }

    @Test
    fun testProgressBarPreviewDefaultValueOne() {
        composeTestRule.setContent {
            ProgressPreviewDefaultValueOne()
        }
    }
}
