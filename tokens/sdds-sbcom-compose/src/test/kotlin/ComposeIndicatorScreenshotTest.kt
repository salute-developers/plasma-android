package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.IndicatorCommon
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.indicator.AvatarIndicator
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.Size10
import com.sdds.sbcom.styles.indicator.Size12
import com.sdds.sbcom.styles.indicator.Size14
import com.sdds.sbcom.styles.indicator.Size6
import com.sdds.sbcom.styles.indicator.Size8
import com.sdds.sbcom.styles.indicator.StateAccent
import com.sdds.sbcom.styles.indicator.StateDanger
import com.sdds.sbcom.styles.indicator.StateGlobalWhite
import com.sdds.sbcom.styles.indicator.StateMute
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
            IndicatorCommon(style = Indicator.Size8.StateAccent.style())
        }
    }

    @Test
    fun testIndicatorStateGlobalWhite() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.Size8.StateGlobalWhite.style())
        }
    }

    @Test
    fun testIndicatorStateMute() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.Size8.StateMute.style())
        }
    }

    @Test
    fun testIndicatorStateDanger() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.Size8.StateDanger.style())
        }
    }

    @Test
    fun testIndicatorStateWarning() {
        composeTestRule.content {
            IndicatorCommon(style = Indicator.Size8.StateWarning.style())
        }
    }

    @Test
    fun testAvatarIndicatorSize6() {
        composeTestRule.content {
            IndicatorCommon(AvatarIndicator.Size6.style())
        }
    }

    @Test
    fun testAvatarIndicatorSize8() {
        composeTestRule.content {
            IndicatorCommon(AvatarIndicator.Size8.style())
        }
    }

    @Test
    fun testAvatarIndicatorSize10() {
        composeTestRule.content {
            IndicatorCommon(AvatarIndicator.Size10.style())
        }
    }

    @Test
    fun testAvatarIndicatorSize12() {
        composeTestRule.content {
            IndicatorCommon(AvatarIndicator.Size12.style())
        }
    }

    @Test
    fun testAvatarIndicatorSize14() {
        composeTestRule.content {
            IndicatorCommon(AvatarIndicator.Size14.style())
        }
    }
}
