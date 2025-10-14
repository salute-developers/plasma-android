package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabbaritem.Accent
import com.sdds.serv.styles.tabbaritem.Default
import com.sdds.serv.styles.tabbaritem.L
import com.sdds.serv.styles.tabbaritem.Label
import com.sdds.serv.styles.tabbaritem.M
import com.sdds.serv.styles.tabbaritem.Secondary
import com.sdds.serv.styles.tabbaritem.TabBarItemSolid

internal object SddsServTabBarItemSolidVariationsCompose : ComposeStyleProvider<String, TabBarItemStyle>() {
    override val variations: Map<String, @Composable () -> TabBarItemStyle> =
        mapOf(
            "M.Default" to { TabBarItemSolid.M.Default.style() },
            "M.Accent" to { TabBarItemSolid.M.Accent.style() },
            "M.Secondary" to { TabBarItemSolid.M.Secondary.style() },
            "M.Label.Default" to { TabBarItemSolid.M.Label.Default.style() },
            "M.Label.Accent" to { TabBarItemSolid.M.Label.Accent.style() },
            "M.Label.Secondary" to { TabBarItemSolid.M.Label.Secondary.style() },
            "L.Default" to { TabBarItemSolid.L.Default.style() },
            "L.Accent" to { TabBarItemSolid.L.Accent.style() },
            "L.Secondary" to { TabBarItemSolid.L.Secondary.style() },
            "L.Label.Default" to { TabBarItemSolid.L.Label.Default.style() },
            "L.Label.Accent" to { TabBarItemSolid.L.Label.Accent.style() },
            "L.Label.Secondary" to { TabBarItemSolid.L.Label.Secondary.style() },
        )
}
