package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.ToastPilledPositiveCenterEndHasContentStartEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ToastRoundedDefaultBottomStartHasContentEndKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Pilled
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast
import kotlin.test.Test

abstract class IosMobileToastScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2041
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testToastPilledPositiveCenterEndHasContentStartEnd() {
        content(::testToastPilledPositiveCenterEndHasContentStartEnd) {
            ToastPilledPositiveCenterEndHasContentStartEndKmp(
                Toast.Pilled.Positive.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2042
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testToastRoundedDefaultBottomStartHasContentEnd() {
        content(::testToastRoundedDefaultBottomStartHasContentEnd) {
            ToastRoundedDefaultBottomStartHasContentEndKmp(
                Toast.Rounded.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}

class IosMobileToastScreenshotLightTest : IosMobileToastScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileToastScreenshotDarkTest : IosMobileToastScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
