package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.PopoverMDefaultLooseStartCenterBottomEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.PopoverMDefaultLooseTopEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.PopoverMDefaultStrictBottomEndTopStartKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import kotlin.test.Test

abstract class IosMobilePopoverScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2007
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testPopoverMDefaultStrictBottomEndTopStart() {
        content(
            ::testPopoverMDefaultStrictBottomEndTopStart,
            capture = { captureLastRootRoboImage(it) },
        ) {
            PopoverMDefaultStrictBottomEndTopStartKmp(
                Popover.M.Default.style(),
                BasicButton.S.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2013
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testPopoverMDefaultLooseTopEnd() {
        content(
            ::testPopoverMDefaultLooseTopEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            PopoverMDefaultLooseTopEndKmp(
                Popover.M.Default.style(),
                BasicButton.S.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2015
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testPopoverMDefaultLooseStartCenterBottomEnd() {
        content(
            ::testPopoverMDefaultLooseStartCenterBottomEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            PopoverMDefaultLooseStartCenterBottomEndKmp(
                Popover.M.Default.style(),
                BasicButton.S.Default.style(),
            )
        }
    }
}

class IosMobilePopoverScreenshotLightTest : IosMobilePopoverScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobilePopoverScreenshotDarkTest : IosMobilePopoverScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
