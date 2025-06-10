package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.spinner.Accent
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.Info
import com.sdds.serv.styles.spinner.L
import com.sdds.serv.styles.spinner.M
import com.sdds.serv.styles.spinner.Negative
import com.sdds.serv.styles.spinner.Positive
import com.sdds.serv.styles.spinner.S
import com.sdds.serv.styles.spinner.Scalable
import com.sdds.serv.styles.spinner.Secondary
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.spinner.Warning
import com.sdds.serv.styles.spinner.Xl
import com.sdds.serv.styles.spinner.Xs
import com.sdds.serv.styles.spinner.Xxl
import com.sdds.serv.styles.spinner.Xxs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.spinner.SpinnerTest
import com.sdds.testing.vs.SDK_NUMBER
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
    fun testSpinnerXxlDefault() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.Xxl.Default.style())
        }
    }

    @Test
    fun testSpinnerXlSecondary() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.Xl.Secondary.style())
        }
    }

    @Test
    fun testSpinnerLAccent() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.L.Accent.style())
        }
    }

    @Test
    fun testSpinnerMPositive() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.M.Positive.style())
        }
    }

    @Test
    fun testSpinnerSNegative() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.S.Negative.style())
        }
    }

    @Test
    fun testSpinnerXsWarning() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.Xs.Warning.style())
        }
    }

    @Test
    fun testSpinnerXxsInfo() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.Xxs.Info.style())
        }
    }

    @Test
    fun testSpinnerScalableDefault() {
        composeTestRule.content {
            SpinnerTest(style = Spinner.Scalable.Default.style())
        }
    }
}
