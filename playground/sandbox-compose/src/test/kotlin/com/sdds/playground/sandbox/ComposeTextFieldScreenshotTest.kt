package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewHasDot
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewHasDotInsideEnd
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewInner
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLInactive
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLPlaceholder
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLReadOnly
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLSuccess
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMWarning
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSDefault
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXsError
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeTextFieldScreenshotTest {

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
    fun testTextFieldPreviewXsError() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewXsError()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewLSuccess() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewLSuccess()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewMWarning() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewMWarning()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewInner() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewInner()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewLInactive() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewLInactive()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewSDefault() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewSDefault()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewLReadOnly() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewLReadOnly()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewLPlaceholder() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewLPlaceholder()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewHasDot() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewHasDot()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testTextFieldPreviewHasDotInsideEnd() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTextFieldPreviewHasDotInsideEnd()
        }
    }
}
