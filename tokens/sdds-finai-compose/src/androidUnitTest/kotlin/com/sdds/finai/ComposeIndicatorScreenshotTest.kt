package com.sdds.finai

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.IndicatorCommon
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.indicator.Accent
import com.sdds.finai.styles.indicator.Default
import com.sdds.finai.styles.indicator.Inactive
import com.sdds.finai.styles.indicator.Indicator
import com.sdds.finai.styles.indicator.L
import com.sdds.finai.styles.indicator.M
import com.sdds.finai.styles.indicator.Negative
import com.sdds.finai.styles.indicator.Positive
import com.sdds.finai.styles.indicator.S
import com.sdds.finai.styles.indicator.Warning
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
