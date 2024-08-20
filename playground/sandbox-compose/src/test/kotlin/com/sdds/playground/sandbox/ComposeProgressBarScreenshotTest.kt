package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewDefaultTheme
import com.sdds.playground.sandbox.progress.SandboxProgressPreviewWarningTheme
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeProgressBarScreenshotTest {

    private val config = RoborazziConfig()

    /**
     * Для запуска только скриншот тестов
     */
    interface ScreenshotTests

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Category(ScreenshotTests::class)
    @Test
    fun testProgressBarPreviewDefault() {
        captureRoboImage {
            config.roborazziOptions
            SandboxProgressPreviewDefaultTheme()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testProgressBarWarning() {
        captureRoboImage {
            config.roborazziOptions
            SandboxProgressPreviewWarningTheme()
        }
    }
}
