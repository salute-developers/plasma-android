package com.sdds.playground.sandbox.sdds.serv.integration.tabbar

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

internal object SddsServTabBarIslandSolidVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarIslandSolid.L.Default.style() },
            "LSecondary" to { TabBarIslandSolid.L.Secondary.style() },
            "LAccent" to { TabBarIslandSolid.L.Accent.style() },
            "LShadowDefault" to { TabBarIslandSolid.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarIslandSolid.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarIslandSolid.L.Shadow.Accent.style() },

            "MDefault" to { TabBarIslandSolid.M.Default.style() },
            "MSecondary" to { TabBarIslandSolid.M.Secondary.style() },
            "MAccent" to { TabBarIslandSolid.M.Accent.style() },
            "MShadowDefault" to { TabBarIslandSolid.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarIslandSolid.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarIslandSolid.M.Shadow.Accent.style() },
        )
}
