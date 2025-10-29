package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.tabbar.Accent
import com.sdds.plasma.giga.app.styles.tabbar.Default
import com.sdds.plasma.giga.app.styles.tabbar.L
import com.sdds.plasma.giga.app.styles.tabbar.M
import com.sdds.plasma.giga.app.styles.tabbar.Secondary
import com.sdds.plasma.giga.app.styles.tabbar.Shadow
import com.sdds.plasma.giga.app.styles.tabbar.TabBarIslandHasLabelClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppTabBarIslandHasLabelClearVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarIslandHasLabelClear.M.Default.style() },
            "M.Secondary" to { TabBarIslandHasLabelClear.M.Secondary.style() },
            "M.Accent" to { TabBarIslandHasLabelClear.M.Accent.style() },
            "M.Shadow.Default" to { TabBarIslandHasLabelClear.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarIslandHasLabelClear.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarIslandHasLabelClear.M.Shadow.Accent.style() },
            "L.Default" to { TabBarIslandHasLabelClear.L.Default.style() },
            "L.Secondary" to { TabBarIslandHasLabelClear.L.Secondary.style() },
            "L.Accent" to { TabBarIslandHasLabelClear.L.Accent.style() },
            "L.Shadow.Default" to { TabBarIslandHasLabelClear.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarIslandHasLabelClear.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarIslandHasLabelClear.L.Shadow.Accent.style() },
        )
}
