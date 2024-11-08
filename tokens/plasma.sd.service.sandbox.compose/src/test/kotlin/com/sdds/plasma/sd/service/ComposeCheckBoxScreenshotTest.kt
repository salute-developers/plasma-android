package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxGroupPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxGroupPreviewSizeS
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewCheckedSizeSmall
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewOffSizeSmall
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewOnSizeMediumNoDesc
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewOnSizeMediumNoLabel
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewSizeMediumNoLabelAndDesc
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewUncheckedSizeMedium
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeCheckBoxScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testCheckBoxUncheckedSizeMedium() {
        composeTestRule.setContent {
            CheckBoxPreviewUncheckedSizeMedium()
        }
    }

    @Test
    fun testCheckBoxCheckedSizeSmallDark() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                CheckBoxPreviewCheckedSizeSmall()
            }
        }
    }

    @Test
    fun testCheckBoxOffSizeSmall() {
        composeTestRule.setContent {
            CheckBoxPreviewOffSizeSmall()
        }
    }

    @Test
    fun testCheckBoxOnSizeMediumNoDesc() {
        composeTestRule.setContent {
            CheckBoxPreviewOnSizeMediumNoDesc()
        }
    }

    @Test
    fun testCheckBoxOnSizeMediumNoLabel() {
        composeTestRule.setContent {
            CheckBoxPreviewOnSizeMediumNoLabel()
        }
    }

    @Test
    fun testCheckBoxSizeMediumNoLabelAndDesc() {
        composeTestRule.setContent {
            CheckBoxPreviewSizeMediumNoLabelAndDesc()
        }
    }

    @Test
    fun testCheckBoxGroupSizeM() {
        composeTestRule.setContent {
            CheckBoxGroupPreviewSizeM()
        }
    }

    @Test
    fun testCheckBoxGroupSizeS() {
        composeTestRule.setContent {
            CheckBoxGroupPreviewSizeS()
        }
    }
}
