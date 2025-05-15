package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.progress.ProgressBarAccent
import com.sdds.testing.compose.progress.ProgressBarDefault
import com.sdds.testing.compose.progress.ProgressBarDefaultValueOne
import com.sdds.testing.compose.progress.ProgressBarGradientAccent
import com.sdds.testing.compose.progress.ProgressBarNegative
import com.sdds.testing.compose.progress.ProgressBarPositive
import com.sdds.testing.compose.progress.ProgressBarSecondary
import com.sdds.testing.compose.progress.ProgressBarWarning
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.progressbar.Accent
import com.sdkit.star.designsystem.styles.progressbar.Default
import com.sdkit.star.designsystem.styles.progressbar.Gradient
import com.sdkit.star.designsystem.styles.progressbar.Negative
import com.sdkit.star.designsystem.styles.progressbar.Positive
import com.sdkit.star.designsystem.styles.progressbar.ProgressBar
import com.sdkit.star.designsystem.styles.progressbar.Secondary
import com.sdkit.star.designsystem.styles.progressbar.Warning
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeProgressScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testProgressBarDefault() {
        composeTestRule.content {
            ProgressBarDefault(style = ProgressBar.Default.style())
        }
    }

    @Test
    fun testProgressBarSecondary() {
        composeTestRule.content {
            ProgressBarSecondary(style = ProgressBar.Secondary.style())
        }
    }

    @Test
    fun testProgressBarWarning() {
        composeTestRule.content {
            ProgressBarWarning(style = ProgressBar.Warning.style())
        }
    }

    @Test
    fun testProgressBarPositive() {
        composeTestRule.content {
            ProgressBarPositive(style = ProgressBar.Positive.style())
        }
    }

    @Test
    fun testProgressBarNegative() {
        composeTestRule.content {
            ProgressBarNegative(style = ProgressBar.Negative.style())
        }
    }

    @Test
    fun testProgressBarAccent() {
        composeTestRule.content {
            ProgressBarAccent(style = ProgressBar.Accent.style())
        }
    }

    @Test
    fun testProgressBarGradientAccent() {
        composeTestRule.content {
            ProgressBarGradientAccent(style = ProgressBar.Gradient.style())
        }
    }

    @Test
    fun testProgressBarDefaultValueOne() {
        composeTestRule.content {
            ProgressBarDefaultValueOne(style = ProgressBar.Default.style())
        }
    }
}
