package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CircularProgressWithIcon
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBar
import com.sdds.sbcom.styles.circularprogressbar.ModeColorAccent
import com.sdds.sbcom.styles.circularprogressbar.ModeColorDanger
import com.sdds.sbcom.styles.circularprogressbar.ModeColorGlobalWhite
import com.sdds.sbcom.styles.circularprogressbar.ModeColorPrimary
import com.sdds.sbcom.styles.circularprogressbar.ModeColorSecondary
import com.sdds.sbcom.styles.circularprogressbar.Size16
import com.sdds.sbcom.styles.circularprogressbar.Size24
import com.sdds.sbcom.styles.circularprogressbar.Size32
import com.sdds.sbcom.styles.circularprogressbar.Size40
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCircularProgressScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCircularProgressSize40ModeColorPrimary() {
        composeTestRule.content {
            CircularProgressWithIcon(CircularProgressBar.Size40.ModeColorPrimary.style())
        }
    }

    @Test
    fun testCircularProgressSize32ModeColorAccent() {
        composeTestRule.content {
            CircularProgressWithIcon(CircularProgressBar.Size32.ModeColorAccent.style())
        }
    }

    @Test
    fun testCircularProgressSize24ModeColorDanger() {
        composeTestRule.content {
            CircularProgressWithIcon(CircularProgressBar.Size24.ModeColorDanger.style())
        }
    }

    @Test
    fun testCircularProgressSize16Secondary() {
        composeTestRule.content {
            CircularProgressWithIcon(CircularProgressBar.Size16.ModeColorSecondary.style())
        }
    }

    @Test
    fun testCircularProgressSize40ModeColorGlobalWhite() {
        composeTestRule.content {
            CircularProgressWithIcon(CircularProgressBar.Size40.ModeColorGlobalWhite.style())
        }
    }
}
