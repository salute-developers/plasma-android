package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.circularprogressbar.Accent
import com.sdds.plasma.sd.service.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.sd.service.styles.circularprogressbar.Default
import com.sdds.plasma.sd.service.styles.circularprogressbar.Gradient
import com.sdds.plasma.sd.service.styles.circularprogressbar.Info
import com.sdds.plasma.sd.service.styles.circularprogressbar.L
import com.sdds.plasma.sd.service.styles.circularprogressbar.M
import com.sdds.plasma.sd.service.styles.circularprogressbar.Negative
import com.sdds.plasma.sd.service.styles.circularprogressbar.Positive
import com.sdds.plasma.sd.service.styles.circularprogressbar.S
import com.sdds.plasma.sd.service.styles.circularprogressbar.Secondary
import com.sdds.plasma.sd.service.styles.circularprogressbar.Warning
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xl
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xs
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xxl
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xxs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.progress.CircularProgress
import com.sdds.testing.compose.progress.CircularProgressMax
import com.sdds.testing.compose.progress.CircularProgressNoTrack
import com.sdds.testing.vs.SDK_NUMBER
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
