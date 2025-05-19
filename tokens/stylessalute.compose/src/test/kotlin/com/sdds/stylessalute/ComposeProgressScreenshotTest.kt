package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.progressbar.Accent
import com.sdds.stylessalute.styles.progressbar.Default
import com.sdds.stylessalute.styles.progressbar.Gradient
import com.sdds.stylessalute.styles.progressbar.Negative
import com.sdds.stylessalute.styles.progressbar.Positive
import com.sdds.stylessalute.styles.progressbar.ProgressBar
import com.sdds.stylessalute.styles.progressbar.Secondary
import com.sdds.stylessalute.styles.progressbar.Warning
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
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeProgressScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
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
