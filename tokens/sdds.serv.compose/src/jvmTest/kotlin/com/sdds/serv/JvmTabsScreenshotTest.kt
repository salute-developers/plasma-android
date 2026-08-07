package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.TabsDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.TabsLHorizontalFiveHasDividerScrollKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.TabsDefault
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmTabsScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    @Test
    fun testTabsLHorizontalFiveHasDividerScroll() {
        content {
            TabsLHorizontalFiveHasDividerScrollKmp(TabsDefault.L.Horizontal.style())
        }
    }

    @Test
    fun testTabsDisabled() {
        content {
            TabsDisabledKmp(TabsDefault.L.Horizontal.style())
        }
    }
}
