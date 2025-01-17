package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxGroupPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxGroupPreviewSizeMDisabled
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxGroupPreviewSizeS
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewSizeM
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewSizeMIndeterminate
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewSizeMediumNoLabelAndDesc
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewSizeSDisabled
import com.sdds.plasma.sd.service.sandbox.checkbox.CheckBoxPreviewSizeSUnchecked
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCheckBoxScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testCheckBoxSizeM() {
        composeTestRule.setContent {
            CheckBoxPreviewSizeM()
        }
    }

    @Test
    fun testCheckBoxSizeSUnchecked() {
        composeTestRule.setContent {
            CheckBoxPreviewSizeSUnchecked()
        }
    }

    @Test
    fun testCheckBoxSizeSDisabled() {
        composeTestRule.setContent {
            CheckBoxPreviewSizeSDisabled()
        }
    }

    @Test
    fun testCheckBoxSizeMIndeterminate() {
        composeTestRule.setContent {
            CheckBoxPreviewSizeMIndeterminate()
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

    @Test
    fun testCheckBoxGroupSizeMDisabled() {
        composeTestRule.setContent {
            CheckBoxGroupPreviewSizeMDisabled()
        }
    }
}
