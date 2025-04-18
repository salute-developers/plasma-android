package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.indicator.Accent
import com.sdds.plasma.giga.app.styles.indicator.Default
import com.sdds.plasma.giga.app.styles.indicator.Inactive
import com.sdds.plasma.giga.app.styles.indicator.Indicator
import com.sdds.plasma.giga.app.styles.indicator.L
import com.sdds.plasma.giga.app.styles.indicator.M
import com.sdds.plasma.giga.app.styles.indicator.Negative
import com.sdds.plasma.giga.app.styles.indicator.Positive
import com.sdds.plasma.giga.app.styles.indicator.S
import com.sdds.plasma.giga.app.styles.indicator.Warning
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.indicator.IndicatorCommon
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeIndicatorScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testIndicatorSizeLDefault() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.L.Default.style())
        }
    }

    @Test
    fun testIndicatorSizeMAccent() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.M.Accent.style())
        }
    }

    @Test
    fun testIndicatorSizeSInactive() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.S.Inactive.style())
        }
    }

    @Test
    fun testIndicatorSizeLPositive() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.L.Positive.style())
        }
    }

    @Test
    fun testIndicatorSizeLWarning() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.L.Warning.style())
        }
    }

    @Test
    fun testIndicatorSizeLNegative() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.L.Negative.style())
        }
    }
}
