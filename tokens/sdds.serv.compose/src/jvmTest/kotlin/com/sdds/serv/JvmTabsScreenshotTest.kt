package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.testcases.TabsDisabled
import com.sdds.compose.uikit.fixtures.testcases.TabsLHorizontalFiveHasDividerScroll
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
            TabsLHorizontalFiveHasDividerScroll(TabsDefault.L.Horizontal.style())
        }
    }

    @Test
    fun testTabsDisabled() {
        content {
            TabsDisabled(TabsDefault.L.Horizontal.style())
        }
    }
}
