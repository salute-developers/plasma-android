package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabbar.Accent
import com.sdds.serv.styles.tabbar.Default
import com.sdds.serv.styles.tabbar.L
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.Secondary
import com.sdds.serv.styles.tabbar.Shadow
import com.sdds.serv.styles.tabbar.TabBarIslandClear

internal object SddsServTabBarIslandClearVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarIslandClear.M.Default.style() },
            "M.Secondary" to { TabBarIslandClear.M.Secondary.style() },
            "M.Accent" to { TabBarIslandClear.M.Accent.style() },
            "M.Shadow.Default" to { TabBarIslandClear.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarIslandClear.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarIslandClear.M.Shadow.Accent.style() },
            "L.Default" to { TabBarIslandClear.L.Default.style() },
            "L.Secondary" to { TabBarIslandClear.L.Secondary.style() },
            "L.Accent" to { TabBarIslandClear.L.Accent.style() },
            "L.Shadow.Default" to { TabBarIslandClear.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarIslandClear.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarIslandClear.L.Shadow.Accent.style() },
        )
}
