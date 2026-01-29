package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import androidx.compose.ui.test.swipeLeft
import androidx.compose.ui.test.swipeUp
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.slider.Accent
import com.sdds.serv.styles.slider.AlignmentEnd
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.Gradient
import com.sdds.serv.styles.slider.L
import com.sdds.serv.styles.slider.LabelEnd
import com.sdds.serv.styles.slider.LimitLabelCenter
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderHorizontalLabelInner
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuter
import com.sdds.serv.styles.slider.SliderVerticalLabelInner
import com.sdds.serv.styles.slider.SliderVerticalLabelOuter
import com.sdds.serv.styles.slider.ThumbS
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.slider.SliderDisabledThumbLimitLabelReversedEndNoLabel
import com.sdds.testing.compose.slider.SliderLabelDisabled
import com.sdds.testing.compose.slider.SliderLabelEnd
import com.sdds.testing.compose.slider.SliderLimitLabelDisabled
import com.sdds.testing.compose.slider.SliderLimitLabelDisabledReversed
import com.sdds.testing.compose.slider.SliderLongLabel
import com.sdds.testing.compose.slider.SliderMinZeroMaxSixty
import com.sdds.testing.compose.slider.SliderReversedEndLabelEnabled
import com.sdds.testing.compose.slider.SliderReversedEndMinMaxLabel
import com.sdds.testing.compose.slider.SliderReversedEndThumbLimitLabelLabel
import com.sdds.testing.compose.slider.SliderThumbEnabledLimitLabel
import com.sdds.testing.compose.slider.SliderThumbLimitLabelNormalStart
import com.sdds.testing.compose.slider.SliderThumbLimitLabelThumbNormalStart
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeSliderScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testSliderHorizontalLabelInnerLDefaultThumbLimitLabelNormal() {
        composeTestRule.content {
            SliderThumbLimitLabelNormalStart(SliderHorizontalLabelInner.L.Default.style())
        }
    }

    @Test
    fun testSliderHorizontalLabelOuterMAccentReversedEnd() {
        composeTestRule.content {
            SliderReversedEndLabelEnabled(SliderHorizontalLabelOuter.M.Accent.style())
        }
        composeTestRule.onNodeWithTag("Slider").performClick().performTouchInput {
            swipeLeft()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testSliderVerticalLabelInnerSGradientThumbEnabledLimitLabel() {
        composeTestRule.content {
            SliderThumbEnabledLimitLabel(SliderVerticalLabelInner.S.Gradient.style())
        }
        composeTestRule.onNodeWithTag("Slider").performClick().performTouchInput {
            swipeUp()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testSliderVerticalOuterLabelLDefaultThumbLimitLabelNormalStart() {
        composeTestRule.content {
            SliderThumbLimitLabelThumbNormalStart(SliderVerticalLabelOuter.L.Default.style())
        }
    }

    @Test
    fun testSliderHorizontalLabelInnerLDefaultLimitLabelCenter() {
        composeTestRule.content {
            SliderThumbLimitLabelNormalStart(SliderHorizontalLabelInner.L.LimitLabelCenter.style())
        }
    }

    @Test
    fun testSliderReversedEndMinMaxLabel() {
        composeTestRule.content {
            SliderReversedEndMinMaxLabel(SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Accent.style())
        }
    }

    @Test
    fun testSliderVerticalLabelInnerSGradientLabelEndThumbS() {
        composeTestRule.content {
            SliderLabelEnd(SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient.style())
        }
    }

    @Test
    fun testSliderVerticalOuterLabelLDefaultThumbS() {
        composeTestRule.content {
            SliderLimitLabelDisabled(SliderVerticalLabelOuter.L.ThumbS.Default.style())
        }
        composeTestRule.onNodeWithTag("Slider").performClick().performTouchInput {
            swipeUp()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testSliderVerticalOuterLabelMAccentAlignmentEnd() {
        composeTestRule.content {
            SliderDisabledThumbLimitLabelReversedEndNoLabel(SliderVerticalLabelOuter.M.AlignmentEnd.Accent.style())
        }
        composeTestRule.onNodeWithTag("Slider").performClick().performTouchInput {
            swipeDown()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testSliderVerticalLabelOuterSGradientAlignmentEndLabelEnd() {
        composeTestRule.content {
            SliderLabelDisabled(SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Gradient.style())
        }
        composeTestRule.onNodeWithTag("Slider").performClick().performTouchInput {
            swipeUp()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testSliderVerticalOuterLDefaultAlignmentEndLabelEndThumbS() {
        composeTestRule.content {
            SliderReversedEndThumbLimitLabelLabel(
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Default.style(),
            )
        }
    }

    @Test
    fun testSliderVerticalLabelInnerMDefaultLabelEnd() {
        composeTestRule.content {
            SliderMinZeroMaxSixty(SliderVerticalLabelInner.M.LabelEnd.Default.style())
        }
    }

    @Test
    fun testSliderVerticalLabelOuterSDefaultLabelEndThumbS() {
        composeTestRule.content {
            SliderLimitLabelDisabledReversed(SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Default.style())
        }
    }

    @Test
    fun testSliderVerticalLabelOuterLThumbSDefaultLongLabel() {
        composeTestRule.content {
            SliderLongLabel(SliderVerticalLabelOuter.L.ThumbS.Default.style())
        }
    }

    @Test
    fun testSliderHorizontalLDefaultLabelInnerLongLabel() {
        composeTestRule.content {
            SliderLongLabel(SliderHorizontalLabelInner.L.Default.style())
        }
    }
}
