package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tabbar.Accent
import com.sdds.plasma.giga.styles.tabbar.Default
import com.sdds.plasma.giga.styles.tabbar.L
import com.sdds.plasma.giga.styles.tabbar.M
import com.sdds.plasma.giga.styles.tabbar.Secondary
import com.sdds.plasma.giga.styles.tabbar.Shadow
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelSolid
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaTabBarIslandHasLabelSolidVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarIslandHasLabelSolid.M.Default.style() },
            "M.Secondary" to { TabBarIslandHasLabelSolid.M.Secondary.style() },
            "M.Accent" to { TabBarIslandHasLabelSolid.M.Accent.style() },
            "M.Shadow.Default" to { TabBarIslandHasLabelSolid.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarIslandHasLabelSolid.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarIslandHasLabelSolid.M.Shadow.Accent.style() },
            "L.Default" to { TabBarIslandHasLabelSolid.L.Default.style() },
            "L.Secondary" to { TabBarIslandHasLabelSolid.L.Secondary.style() },
            "L.Accent" to { TabBarIslandHasLabelSolid.L.Accent.style() },
            "L.Shadow.Default" to { TabBarIslandHasLabelSolid.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarIslandHasLabelSolid.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarIslandHasLabelSolid.L.Shadow.Accent.style() },
        )
}
