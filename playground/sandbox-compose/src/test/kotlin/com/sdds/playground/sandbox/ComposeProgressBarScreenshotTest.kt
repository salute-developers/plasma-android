package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewDefaultTheme
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewWarningTheme
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
            SandboxProgressPreviewDefaultTheme()
        }
    }

    @Test
    fun testProgressBarWarning() {
        composeTestRule.setContent {
            SandboxProgressPreviewWarningTheme()
        }
    }
}
