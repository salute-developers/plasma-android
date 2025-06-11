package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.spinner.Accent
import com.sdds.plasma.giga.app.styles.spinner.Default
import com.sdds.plasma.giga.app.styles.spinner.Info
import com.sdds.plasma.giga.app.styles.spinner.L
import com.sdds.plasma.giga.app.styles.spinner.M
import com.sdds.plasma.giga.app.styles.spinner.Negative
import com.sdds.plasma.giga.app.styles.spinner.Positive
import com.sdds.plasma.giga.app.styles.spinner.S
import com.sdds.plasma.giga.app.styles.spinner.Scalable
import com.sdds.plasma.giga.app.styles.spinner.Secondary
import com.sdds.plasma.giga.app.styles.spinner.Spinner
import com.sdds.plasma.giga.app.styles.spinner.Warning
import com.sdds.plasma.giga.app.styles.spinner.Xl
import com.sdds.plasma.giga.app.styles.spinner.Xs
import com.sdds.plasma.giga.app.styles.spinner.Xxl
import com.sdds.plasma.giga.app.styles.spinner.Xxs
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
