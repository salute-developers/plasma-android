package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.avatar.AvatarGroupPreviewSizeS
import com.sdds.plasma.sd.service.sandbox.avatar.AvatarPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.avatar.AvatarPreviewSizeXXL
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeAvatarScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testAvatarPreviewSizeXXL() {
        composeTestRule.setContent {
            AvatarPreviewSizeXXL()
        }
    }

    @Test
    fun testAvatarPreviewSizeM() {
        composeTestRule.setContent {
            AvatarPreviewSizeM()
        }
    }

    @Test
    fun testAvatarGroupPreviewSizeS() {
        composeTestRule.setContent {
            AvatarGroupPreviewSizeS()
        }
    }
}
