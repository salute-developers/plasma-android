package com.sdds.playground.sandbox.compose

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.switcher.compose.SandboxSwitchPreviewOff
import com.sdds.playground.sandbox.switcher.compose.SandboxSwitchPreviewOn
import com.sdds.playground.sandbox.switcher.compose.SandboxSwitchPreviewOnDisabled
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeSwitchScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testSwitchPreviewOn() {
        composeTestRule.setContent {
            SandboxSwitchPreviewOn()
        }
    }

    @Test
    fun testSwitchPreviewOff() {
        composeTestRule.setContent {
            SandboxSwitchPreviewOff()
        }
    }

    @Test
    fun testSwitchPreviewOnDisabled() {
        composeTestRule.setContent {
            SandboxSwitchPreviewOnDisabled()
        }
    }
}
