package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.switcher.SwitchLOn
import com.sdds.testing.compose.switcher.SwitchMOff
import com.sdds.testing.compose.switcher.SwitchOffDisabled
import com.sdds.testing.compose.switcher.SwitchOnDisabled
import com.sdds.testing.compose.switcher.SwitchS
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.switcher.L
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.S
import com.sdkit.star.designsystem.styles.switcher.Switch
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeSwitchScreenshotTest : RoborazziConfigCompose("+night") {

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
}
