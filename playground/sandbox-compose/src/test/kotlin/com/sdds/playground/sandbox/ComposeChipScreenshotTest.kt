package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeMAccent
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeMDefault
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeSDisabled
import com.sdds.playground.sandbox.chip.SandboxChipPreviewSizeXsSecondary
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeChipScreenshotTest {

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
    fun testChipPreviewSizeMDefault() {
        captureRoboImage {
            config.roborazziOptions
            SandboxChipPreviewSizeMDefault()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testChipPreviewSizeXsSecondary() {
        captureRoboImage {
            config.roborazziOptions
            SandboxChipPreviewSizeXsSecondary()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testChipPreviewSizeMAccent() {
        captureRoboImage {
            config.roborazziOptions
            SandboxChipPreviewSizeMAccent()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testChipPreviewSizeSDisabled() {
        captureRoboImage {
            config.roborazziOptions
            SandboxChipPreviewSizeSDisabled()
        }
    }
}
