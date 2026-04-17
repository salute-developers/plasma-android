package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.SpinnerTest
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.spinner.ModeColorAccent
import com.sdds.sbcom.styles.spinner.ModeColorDanger
import com.sdds.sbcom.styles.spinner.ModeColorGlobalWhite
import com.sdds.sbcom.styles.spinner.ModeColorPrimary
import com.sdds.sbcom.styles.spinner.ModeColorSecondary
import com.sdds.sbcom.styles.spinner.Size16
import com.sdds.sbcom.styles.spinner.Size24
import com.sdds.sbcom.styles.spinner.Size32
import com.sdds.sbcom.styles.spinner.Size40
import com.sdds.sbcom.styles.spinner.Spinner
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeSpinnerScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testSpinnerSpinnerSize40ModeColorPrimary() {
        composeTestRule.content {
            SpinnerTest(Spinner.Size40.ModeColorPrimary.style())
        }
    }

    @Test
    fun testSpinnerSpinnerSize32ModeColorAccent() {
        composeTestRule.content {
            SpinnerTest(Spinner.Size32.ModeColorAccent.style())
        }
    }

    @Test
    fun testSpinnerSpinnerSize24ModeColorDanger() {
        composeTestRule.content {
            SpinnerTest(Spinner.Size24.ModeColorDanger.style())
        }
    }

    @Test
    fun testSpinnerSpinnerSize16ModeColorSecondary() {
        composeTestRule.content {
            SpinnerTest(Spinner.Size16.ModeColorSecondary.style())
        }
    }

    @Test
    fun testSpinnerSpinnerSize40ModeColorGlobalWhite() {
        composeTestRule.content {
            SpinnerTest(Spinner.Size40.ModeColorGlobalWhite.style())
        }
    }
}
