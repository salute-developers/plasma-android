package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLDefault
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLPositive
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLWhiteDarkTheme
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeMNegative
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeMSecondary
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeSClear
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeSWarning
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeXSDefault
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeButtonScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testButtonPreviewSizeLDefault() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeLDefault()
        }
    }

    @Test
    fun testButtonPreviewSizeXSDefault() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeXSDefault()
        }
    }

    @Test
    fun testButtonPreviewSizeMSecondary() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeMSecondary()
        }
    }

    @Test
    fun testButtonPreviewSizeSClear() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeSClear()
        }
    }

    @Test
    fun testButtonPreviewSizeLPositive() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeLPositive()
        }
    }

    @Test
    fun testButtonPreviewSizeMNegative() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeMNegative()
        }
    }

    @Test
    fun testButtonPreviewSizeSWarning() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeSWarning()
        }
    }

    @Test
    fun testButtonPreviewSizeLWhiteDarkTheme() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                SandboxButtonPreviewSizeLWhiteDarkTheme()
            }
        }
    }
}