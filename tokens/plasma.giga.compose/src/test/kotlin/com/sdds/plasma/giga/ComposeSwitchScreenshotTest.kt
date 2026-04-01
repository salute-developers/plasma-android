package com.sdds.plasma.giga

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.SwitchLOn
import com.sdds.compose.uikit.fixtures.testcases.SwitchMOff
import com.sdds.compose.uikit.fixtures.testcases.SwitchOffDisabled
import com.sdds.compose.uikit.fixtures.testcases.SwitchOnDisabled
import com.sdds.compose.uikit.fixtures.testcases.SwitchS
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.switcher.L
import com.sdds.plasma.giga.styles.switcher.M
import com.sdds.plasma.giga.styles.switcher.S
import com.sdds.plasma.giga.styles.switcher.Switch
import com.sdds.plasma.giga.styles.switcher.ToggleS
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
            SwitchLOn(style = Switch.L.style())
        }
    }

    @Test
    fun testSwitchOff() {
        composeTestRule.content {
            SwitchMOff(style = Switch.M.style())
        }
    }

    @Test
    fun testSwitchS() {
        composeTestRule.content {
            SwitchS(style = Switch.S.style())
        }
    }

    @Test
    fun testSwitchOnDisabled() {
        composeTestRule.content {
            SwitchOnDisabled(style = Switch.M.style())
        }
    }

    @Test
    fun testSwitchOffDisabled() {
        composeTestRule.content {
            SwitchOffDisabled(style = Switch.M.style())
        }
    }

    @Test
    fun testSwitchLToggleS() {
        composeTestRule.content {
            SwitchLOn(style = Switch.L.ToggleS.style())
        }
    }

    @Test
    fun testSwitchSToggleS() {
        composeTestRule.content {
            SwitchMOff(style = Switch.S.ToggleS.style())
        }
    }
}
