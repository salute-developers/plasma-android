package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLDefault
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLPositive
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLWhiteDarkTheme
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeMNegative
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeMSecondary
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeSClear
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeSWarning
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeXSDefault
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeButtonScreenshotTest {

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
    fun testButtonPreviewSizeLDefault() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeLDefault()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeXSDefault() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeXSDefault()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeMSecondary() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeMSecondary()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeSClear() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeSClear()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeLPositive() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeLPositive()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeMNegative() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeMNegative()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeSWarning() {
        captureRoboImage {
            config.roborazziOptions
            SandboxButtonPreviewSizeSWarning()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testButtonPreviewSizeLWhiteDarkTheme() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTheme(darkTheme = true) {
                SandboxButtonPreviewSizeLWhiteDarkTheme()
            }
        }
    }
}
