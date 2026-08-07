package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.TooltipMLooseStartCenterBottomEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.TooltipMLooseTopEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.tooltip.M
import com.sdds.serv.styles.tooltip.Tooltip
import kotlin.test.Test

abstract class IosMobileTooltipScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2093
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTooltipMLooseTopEnd() {
        content(
            ::testTooltipMLooseTopEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            TooltipMLooseTopEnd(
                Tooltip.M.style(),
                BasicButton.S.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2024
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTooltipMLooseStartCenterBottomEnd() {
        content(
            ::testTooltipMLooseStartCenterBottomEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            TooltipMLooseStartCenterBottomEndKmp(
                Tooltip.M.style(),
                BasicButton.S.Default.style(),
            )
        }
    }
}

class IosMobileTooltipScreenshotLightTest : IosMobileTooltipScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileTooltipScreenshotDarkTest : IosMobileTooltipScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
