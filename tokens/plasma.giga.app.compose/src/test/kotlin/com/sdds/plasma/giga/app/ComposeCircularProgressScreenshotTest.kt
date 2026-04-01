package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CircularProgress
import com.sdds.compose.uikit.fixtures.testcases.CircularProgressMax
import com.sdds.compose.uikit.fixtures.testcases.CircularProgressNoTrack
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.circularprogressbar.Accent
import com.sdds.plasma.giga.app.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.giga.app.styles.circularprogressbar.Default
import com.sdds.plasma.giga.app.styles.circularprogressbar.Gradient
import com.sdds.plasma.giga.app.styles.circularprogressbar.Info
import com.sdds.plasma.giga.app.styles.circularprogressbar.L
import com.sdds.plasma.giga.app.styles.circularprogressbar.M
import com.sdds.plasma.giga.app.styles.circularprogressbar.Negative
import com.sdds.plasma.giga.app.styles.circularprogressbar.Positive
import com.sdds.plasma.giga.app.styles.circularprogressbar.S
import com.sdds.plasma.giga.app.styles.circularprogressbar.Secondary
import com.sdds.plasma.giga.app.styles.circularprogressbar.Warning
import com.sdds.plasma.giga.app.styles.circularprogressbar.Xl
import com.sdds.plasma.giga.app.styles.circularprogressbar.Xs
import com.sdds.plasma.giga.app.styles.circularprogressbar.Xxl
import com.sdds.plasma.giga.app.styles.circularprogressbar.Xxs
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
    fun testCircularProgressXxlDefault() {
        composeTestRule.content {
            CircularProgress(style = CircularProgressBar.Xxl.Default.style())
        }
    }

    @Test
    fun testCircularProgressXlSecondary() {
        composeTestRule.content {
            CircularProgress(style = CircularProgressBar.Xl.Secondary.style())
        }
    }

    @Test
    fun testCircularProgressLAccent() {
        composeTestRule.content {
            CircularProgress(style = CircularProgressBar.L.Accent.style())
        }
    }

    @Test
    fun testCircularProgressMGradient() {
        composeTestRule.content {
            CircularProgressMax(style = CircularProgressBar.M.Gradient.style())
        }
    }

    @Test
    fun testCircularProgressSInfo() {
        composeTestRule.content {
            CircularProgress(style = CircularProgressBar.S.Info.style())
        }
    }

    @Test
    fun testCircularProgressXsPositive() {
        composeTestRule.content {
            CircularProgress(style = CircularProgressBar.Xs.Positive.style())
        }
    }

    @Test
    fun testCircularProgressXxsWarning() {
        composeTestRule.content {
            CircularProgress(style = CircularProgressBar.Xxs.Warning.style())
        }
    }

    @Test
    fun testCircularProgressXxlNegative() {
        composeTestRule.content {
            CircularProgressNoTrack(style = CircularProgressBar.Xxl.Negative.style())
        }
    }
}
