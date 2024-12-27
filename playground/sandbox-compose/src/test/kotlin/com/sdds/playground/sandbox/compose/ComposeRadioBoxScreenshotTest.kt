package com.sdds.playground.sandbox.compose

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxGroupPreviewSizeM
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxGroupPreviewSizeMDescription
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxGroupPreviewSizeS
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxGroupPreviewSizeSLabel
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxPreviewDisabled
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxPreviewSizeM
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxPreviewSizeMNoDescription
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxPreviewSizeS
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeRadioBoxScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testRadioBoxPreviewSizeM() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeM()
        }
    }

    @Test
    fun testRadioBoxPreviewSizeS() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeS()
        }
    }

    @Test
    fun testRadioBoxPreviewSizeMNoDescription() {
        composeTestRule.setContent {
            RadioBoxPreviewSizeMNoDescription()
        }
    }

    @Test
    fun testRadioBoxPreviewDisabled() {
        composeTestRule.setContent {
            RadioBoxPreviewDisabled()
        }
    }

    @Test
    fun testRadioBoxGroupSizeM() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeM()
        }
    }

    @Test
    fun testRadioBoxGroupSizeS() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeS()
        }
    }

    @Test
    fun testRadioBoxGroupSizeMDescription() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeMDescription()
        }
    }

    @Test
    fun testRadioBoxGroupSizeSLabel() {
        composeTestRule.setContent {
            RadioBoxGroupPreviewSizeSLabel()
        }
    }
}
