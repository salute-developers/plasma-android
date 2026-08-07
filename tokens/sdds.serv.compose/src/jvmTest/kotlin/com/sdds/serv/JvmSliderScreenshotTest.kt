package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.SliderLabelEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SliderReversedEndLabelEnabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SliderThumbLimitLabelNormalStartKmp
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
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmSliderScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2411
     */
    @Test
    fun testSliderThumbLimitLabelNormalStart() {
        content {
            SliderThumbLimitLabelNormalStartKmp(SliderHorizontalLabelInner.L.Default.style())
        }
    }

    /**
     * PLASMA-T2412
     */
    @Test
    fun testSliderReversedEndLabelEnabled() {
        content {
            SliderReversedEndLabelEnabledKmp(SliderHorizontalLabelOuter.M.Accent.style())
        }
    }

    /**
     * PLASMA-T2417
     */
    @Test
    fun testSliderLabelEnd() {
        content {
            SliderLabelEndKmp(SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient.style())
        }
    }
}
