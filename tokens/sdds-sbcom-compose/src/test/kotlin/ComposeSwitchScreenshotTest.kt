package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.SwitchOff
import com.sdds.compose.uikit.fixtures.testcases.SwitchOffDisabledNoText
import com.sdds.compose.uikit.fixtures.testcases.SwitchOn
import com.sdds.compose.uikit.fixtures.testcases.SwitchOnDisabledNoText
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.switcher.Default
import com.sdds.sbcom.styles.switcher.Switch
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
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testSwitchOn() {
        composeTestRule.content {
            SwitchOn(style = Switch.Default.style())
        }
    }

    @Test
    fun testSwitchOff() {
        composeTestRule.content {
            SwitchOff(style = Switch.Default.style())
        }
    }

    @Test
    fun testSwitchOnDisabled() {
        composeTestRule.content {
            SwitchOnDisabledNoText(style = Switch.Default.style())
        }
    }

    @Test
    fun testSwitchOffDisabled() {
        composeTestRule.content {
            SwitchOffDisabledNoText(style = Switch.Default.style())
        }
    }
}
