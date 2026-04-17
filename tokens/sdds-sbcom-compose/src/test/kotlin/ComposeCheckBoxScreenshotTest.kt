package com.sdds.sbcom

import androidx.compose.ui.state.ToggleableState
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeLNegativeUnchecked
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeMediumNoLabelAndDesc
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.checkbox.CheckBox
import com.sdds.sbcom.styles.checkbox.Default
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
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testCheckBoxDefault() {
        composeTestRule.content {
            CheckBoxSizeMediumNoLabelAndDesc(style = CheckBox.Default.style())
        }
    }

    @Test
    fun testCheckBoxUnchecked() {
        composeTestRule.content {
            CheckBoxSizeLNegativeUnchecked(style = CheckBox.Default.style())
        }
    }

    @Test
    fun testCheckBoxDisabled() {
        composeTestRule.content {
            CheckBox(
                style = CheckBox.Default.style(),
                state = ToggleableState.On,
                enabled = false,
                onClick = {},
            )
        }
    }

    @Test
    fun testCheckBoxIndeterminate() {
        composeTestRule.content {
            CheckBox(
                style = CheckBox.Default.style(),
                state = ToggleableState.Indeterminate,
                enabled = true,
                onClick = {},
            )
        }
    }

    @Test
    fun testCheckBoxOffDisabled() {
        composeTestRule.content {
            CheckBox(
                style = CheckBox.Default.style(),
                state = ToggleableState.Off,
                enabled = false,
                onClick = {},
            )
        }
    }
}
