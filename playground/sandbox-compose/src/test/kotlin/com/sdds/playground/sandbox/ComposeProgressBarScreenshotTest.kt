package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.progress.ProgressPreviewAccent
import com.sdds.playground.sandbox.progress.ProgressPreviewDefault
import com.sdds.playground.sandbox.progress.ProgressPreviewDefaultValueOne
import com.sdds.playground.sandbox.progress.ProgressPreviewGradientAccent
import com.sdds.playground.sandbox.progress.ProgressPreviewNegative
import com.sdds.playground.sandbox.progress.ProgressPreviewPositive
import com.sdds.playground.sandbox.progress.ProgressPreviewSecondary
import com.sdds.playground.sandbox.progress.ProgressPreviewWarning
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
