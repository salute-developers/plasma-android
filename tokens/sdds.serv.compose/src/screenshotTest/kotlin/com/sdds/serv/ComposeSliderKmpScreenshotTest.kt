@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.SliderLabelEnd
import com.sdds.compose.uikit.fixtures.testcases.SliderReversedEndLabelEnabled
import com.sdds.compose.uikit.fixtures.testcases.SliderThumbLimitLabelNormalStart
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.slider.Accent
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.Gradient
import com.sdds.serv.styles.slider.L
import com.sdds.serv.styles.slider.LabelEnd
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderHorizontalLabelInner
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuter
import com.sdds.serv.styles.slider.SliderVerticalLabelInner
import com.sdds.serv.styles.slider.ThumbS
import kotlin.test.Test

internal class ComposeSliderKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2411
     */
    @Test
    fun testSliderThumbLimitLabelNormalStart() {
        content(::testSliderThumbLimitLabelNormalStart) {
            SliderThumbLimitLabelNormalStart(SliderHorizontalLabelInner.L.Default.style())
        }
    }

    /**
     * PLASMA-T2412
     */
    @Test
    fun testSliderReversedEndLabelEnabled() {
        content(::testSliderReversedEndLabelEnabled) {
            SliderReversedEndLabelEnabled(SliderHorizontalLabelOuter.M.Accent.style())
        }
    }

    /**
     * PLASMA-T2417
     */
    @Test
    fun testSliderLabelEnd() {
        content(::testSliderLabelEnd) {
            SliderLabelEnd(SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient.style())
        }
    }
}
