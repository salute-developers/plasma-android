package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectMultipleNormalDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectMultipleNormalMTopCenterKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectMultipleNormalReadOnlyKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectSingleNormalXlTopStartKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.SelectMultipleNormal
import com.sdds.serv.styles.select.SelectSingleNormal
import com.sdds.serv.styles.select.Xl
import kotlin.test.Test

abstract class IosMobileSelectScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2578
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSelectSingleNormalXlTopStart() {
        content(
            ::testSelectSingleNormalXlTopStart,
            capture = { captureLastRootRoboImage(it) },
        ) {
            SelectSingleNormalXlTopStartKmp(SelectSingleNormal.Xl.style())
        }
    }

    /**
     * PLASMA-T2580
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSelectMultipleNormalMTopCenter() {
        content(
            ::testSelectMultipleNormalMTopCenter,
            capture = { captureLastRootRoboImage(it) },
        ) {
            SelectMultipleNormalMTopCenterKmp(SelectMultipleNormal.M.style())
        }
    }

    /**
     * PLASMA-T2586
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSelectMultipleNormalDisabled() {
        content(
            ::testSelectMultipleNormalDisabled,
            capture = { captureLastRootRoboImage(it) },
        ) {
            SelectMultipleNormalDisabledKmp(SelectMultipleNormal.L.style())
        }
    }

    /**
     * PLASMA-T2592
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testSelectMultipleNormalReadOnly() {
        content(
            ::testSelectMultipleNormalReadOnly,
            capture = { captureLastRootRoboImage(it) },
        ) {
            SelectMultipleNormalReadOnlyKmp(SelectMultipleNormal.L.style())
        }
    }
}

class IosMobileSelectScreenshotLightTest : IosMobileSelectScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileSelectScreenshotDarkTest : IosMobileSelectScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
