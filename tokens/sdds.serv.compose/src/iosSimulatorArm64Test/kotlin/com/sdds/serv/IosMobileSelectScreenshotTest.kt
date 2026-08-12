package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalDisabled
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalMTopCenter
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalReadOnly
import com.sdds.compose.uikit.fixtures.testcases.SelectSingleNormalXlTopStart
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
            SelectSingleNormalXlTopStart(
                style = SelectSingleNormal.Xl.style(),
                initialOpened = true,
            )
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
            SelectMultipleNormalMTopCenter(
                style = SelectMultipleNormal.M.style(),
                initialOpened = true,
            )
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
            SelectMultipleNormalDisabled(
                style = SelectMultipleNormal.L.style(),
                initialOpened = true,
            )
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
            SelectMultipleNormalReadOnly(
                style = SelectMultipleNormal.L.style(),
                initialOpened = true,
            )
        }
    }
}

class IosMobileSelectScreenshotLightTest : IosMobileSelectScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileSelectScreenshotDarkTest : IosMobileSelectScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
