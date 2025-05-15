package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.progress.CircularProgress
import com.sdds.testing.compose.progress.CircularProgressMax
import com.sdds.testing.compose.progress.CircularProgressNoTrack
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.circularprogressbar.Accent
import com.sdkit.star.designsystem.styles.circularprogressbar.CircularProgressBar
import com.sdkit.star.designsystem.styles.circularprogressbar.Default
import com.sdkit.star.designsystem.styles.circularprogressbar.Gradient
import com.sdkit.star.designsystem.styles.circularprogressbar.Info
import com.sdkit.star.designsystem.styles.circularprogressbar.L
import com.sdkit.star.designsystem.styles.circularprogressbar.M
import com.sdkit.star.designsystem.styles.circularprogressbar.Negative
import com.sdkit.star.designsystem.styles.circularprogressbar.Positive
import com.sdkit.star.designsystem.styles.circularprogressbar.S
import com.sdkit.star.designsystem.styles.circularprogressbar.Secondary
import com.sdkit.star.designsystem.styles.circularprogressbar.Warning
import com.sdkit.star.designsystem.styles.circularprogressbar.Xl
import com.sdkit.star.designsystem.styles.circularprogressbar.Xs
import com.sdkit.star.designsystem.styles.circularprogressbar.Xxl
import com.sdkit.star.designsystem.styles.circularprogressbar.Xxs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeCircularProgressScreenshotTest : RoborazziConfigCompose("+night") {

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
