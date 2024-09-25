package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewDefault
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewDefaultDark
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewNegative
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewPositive
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewWarning
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
            SandboxProgressPreviewDefault()
        }
    }

    @Test
    fun testProgressBarNegative() {
        composeTestRule.setContent {
            SandboxProgressPreviewNegative()
        }
    }

    @Test
    fun testProgressBarWarning() {
        composeTestRule.setContent {
            SandboxProgressPreviewWarning()
        }
    }

    @Test
    fun testProgressBarPositive() {
        composeTestRule.setContent {
            SandboxProgressPreviewPositive()
        }
    }

    @Test
    fun testProgressBarDefaultDark() {
        composeTestRule.setContent {
            SandboxProgressPreviewDefaultDark()
        }
    }
}
