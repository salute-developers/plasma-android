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
import com.sdds.serv.styles.tabbar.TabBarIslandSolid

internal object SddsServTabBarIslandSolidVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarIslandSolid.M.Default.style() },
            "M.Secondary" to { TabBarIslandSolid.M.Secondary.style() },
            "M.Accent" to { TabBarIslandSolid.M.Accent.style() },
            "M.Shadow.Default" to { TabBarIslandSolid.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarIslandSolid.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarIslandSolid.M.Shadow.Accent.style() },
            "L.Default" to { TabBarIslandSolid.L.Default.style() },
            "L.Secondary" to { TabBarIslandSolid.L.Secondary.style() },
            "L.Accent" to { TabBarIslandSolid.L.Accent.style() },
            "L.Shadow.Default" to { TabBarIslandSolid.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarIslandSolid.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarIslandSolid.L.Shadow.Accent.style() },
        )
}
