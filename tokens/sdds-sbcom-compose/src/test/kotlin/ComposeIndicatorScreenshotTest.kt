package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.IndicatorCommon
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.StateDanger
import com.sdds.sbcom.styles.indicator.StateGlobalWhite
import com.sdds.sbcom.styles.indicator.StateMute
import com.sdds.sbcom.styles.indicator.StateSuccess
import com.sdds.sbcom.styles.indicator.StateWarning
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
    fun testIndicatorStateSuccess() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.StateSuccess.style())
        }
    }

    @Test
    fun testIndicatorStateGlobalWhite() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.StateGlobalWhite.style())
        }
    }

    @Test
    fun testIndicatorStateMute() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.StateMute.style())
        }
    }

    @Test
    fun testIndicatorStateDanger() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.StateDanger.style())
        }
    }

    @Test
    fun testIndicatorStateWarning() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.StateWarning.style())
        }
    }
}
