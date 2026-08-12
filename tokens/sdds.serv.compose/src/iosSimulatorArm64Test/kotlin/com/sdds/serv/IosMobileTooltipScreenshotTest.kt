package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.TooltipMLooseStartCenterBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.TooltipMLooseTopEnd
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
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
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
            TooltipMLooseStartCenterBottomEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
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
