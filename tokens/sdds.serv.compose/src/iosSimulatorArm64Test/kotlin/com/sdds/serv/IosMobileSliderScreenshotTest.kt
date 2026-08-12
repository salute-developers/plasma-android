package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
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

abstract class IosMobileSliderScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2411
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSliderThumbLimitLabelNormalStart() {
        content(::testSliderThumbLimitLabelNormalStart) {
            SliderThumbLimitLabelNormalStart(SliderHorizontalLabelInner.L.Default.style())
        }
    }

    /**
     * PLASMA-T2412
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSliderReversedEndLabelEnabled() {
        content(::testSliderReversedEndLabelEnabled) {
            SliderReversedEndLabelEnabled(SliderHorizontalLabelOuter.M.Accent.style())
        }
    }

    /**
     * PLASMA-T2417
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSliderLabelEnd() {
        content(::testSliderLabelEnd) {
            SliderLabelEnd(SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient.style())
        }
    }
}

class IosMobileSliderScreenshotLightTest : IosMobileSliderScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileSliderScreenshotDarkTest : IosMobileSliderScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
