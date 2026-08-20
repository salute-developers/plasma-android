@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.TabsDisabled
import com.sdds.compose.uikit.fixtures.testcases.TabsLHorizontalFiveHasDividerScroll
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.TabsDefault
import kotlin.test.Test

internal class ComposeTabsKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    @Test
    fun testTabsLHorizontalFiveHasDividerScroll() {
        content(::testTabsLHorizontalFiveHasDividerScroll) {
            TabsLHorizontalFiveHasDividerScroll(TabsDefault.L.Horizontal.style())
        }
    }

    @Test
    fun testTabsDisabled() {
        content(::testTabsDisabled) {
            TabsDisabled(TabsDefault.L.Horizontal.style())
        }
    }
}
