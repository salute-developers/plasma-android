package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxChecked
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxCheckedDisabled
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxUnchecked
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxUncheckedDisabled
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.radiobox.Default
import com.sdds.sbcom.styles.radiobox.RadioBox
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
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testRadioBoxUnchecked() {
        composeTestRule.content {
            RadioBoxUnchecked(style = RadioBox.Default.style())
        }
    }

    @Test
    fun testRadioBoxChecked() {
        composeTestRule.content {
            RadioBoxChecked(style = RadioBox.Default.style())
        }
    }

    @Test
    fun testRadioBoxSizeUncheckedDisabled() {
        composeTestRule.content {
            RadioBoxUncheckedDisabled(style = RadioBox.Default.style())
        }
    }

    @Test
    fun testRadioBoxCheckedDisabled() {
        composeTestRule.content {
            RadioBoxCheckedDisabled(style = RadioBox.Default.style())
        }
    }
}
