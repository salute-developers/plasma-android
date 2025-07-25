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
import com.sdds.serv.styles.tabbar.TabBarIslandHasLabelSolid

internal object SddsServTabBarIslandHasLabelSolidVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarIslandHasLabelSolid.L.Default.style() },
            "LSecondary" to { TabBarIslandHasLabelSolid.L.Secondary.style() },
            "LAccent" to { TabBarIslandHasLabelSolid.L.Accent.style() },
            "LShadowDefault" to { TabBarIslandHasLabelSolid.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarIslandHasLabelSolid.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarIslandHasLabelSolid.L.Shadow.Accent.style() },

            "MDefault" to { TabBarIslandHasLabelSolid.M.Default.style() },
            "MSecondary" to { TabBarIslandHasLabelSolid.M.Secondary.style() },
            "MAccent" to { TabBarIslandHasLabelSolid.M.Accent.style() },
            "MShadowDefault" to { TabBarIslandHasLabelSolid.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarIslandHasLabelSolid.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarIslandHasLabelSolid.M.Shadow.Accent.style() },
        )
}
