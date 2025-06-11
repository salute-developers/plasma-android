package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.spinner.SpinnerTest
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.spinner.Accent
import com.sdkit.star.designsystem.styles.spinner.Default
import com.sdkit.star.designsystem.styles.spinner.Info
import com.sdkit.star.designsystem.styles.spinner.L
import com.sdkit.star.designsystem.styles.spinner.M
import com.sdkit.star.designsystem.styles.spinner.Negative
import com.sdkit.star.designsystem.styles.spinner.Positive
import com.sdkit.star.designsystem.styles.spinner.S
import com.sdkit.star.designsystem.styles.spinner.Scalable
import com.sdkit.star.designsystem.styles.spinner.Secondary
import com.sdkit.star.designsystem.styles.spinner.Spinner
import com.sdkit.star.designsystem.styles.spinner.Warning
import com.sdkit.star.designsystem.styles.spinner.Xl
import com.sdkit.star.designsystem.styles.spinner.Xs
import com.sdkit.star.designsystem.styles.spinner.Xxl
import com.sdkit.star.designsystem.styles.spinner.Xxs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeSpinnerScreenshotTest : RoborazziConfigCompose("+night") {

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
