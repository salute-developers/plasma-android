package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.TabsDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.TabsLHorizontalFiveHasDividerScrollKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.TabsDefault
import kotlin.test.Test

abstract class IosMobileTabsScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTabsLHorizontalFiveHasDividerScroll() {
        content(::testTabsLHorizontalFiveHasDividerScroll) {
            TabsLHorizontalFiveHasDividerScrollKmp(TabsDefault.L.Horizontal.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTabsDisabled() {
        content(::testTabsDisabled) {
            TabsDisabledKmp(TabsDefault.L.Horizontal.style())
        }
    }
}

class IosMobileTabsScreenshotLightTest : IosMobileTabsScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileTabsScreenshotDarkTest : IosMobileTabsScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
