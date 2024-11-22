package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.switch.SandboxSwitchPreviewOff
import com.sdds.plasma.sd.service.sandbox.switch.SandboxSwitchPreviewOn
import com.sdds.plasma.sd.service.sandbox.switch.SandboxSwitchPreviewOnDisabled
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeSwitchScreenshotTest : RoborazziConfig() {

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
