package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tabbar.Accent
import com.sdds.plasma.giga.styles.tabbar.Default
import com.sdds.plasma.giga.styles.tabbar.Divider
import com.sdds.plasma.giga.styles.tabbar.L
import com.sdds.plasma.giga.styles.tabbar.M
import com.sdds.plasma.giga.styles.tabbar.Rounded
import com.sdds.plasma.giga.styles.tabbar.Secondary
import com.sdds.plasma.giga.styles.tabbar.Shadow
import com.sdds.plasma.giga.styles.tabbar.TabBarClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaTabBarClearVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarClear.M.Default.style() },
            "M.Secondary" to { TabBarClear.M.Secondary.style() },
            "M.Accent" to { TabBarClear.M.Accent.style() },
            "M.Rounded.Default" to { TabBarClear.M.Rounded.Default.style() },
            "M.Rounded.Secondary" to { TabBarClear.M.Rounded.Secondary.style() },
            "M.Rounded.Accent" to { TabBarClear.M.Rounded.Accent.style() },
            "M.Shadow.Default" to { TabBarClear.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarClear.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarClear.M.Shadow.Accent.style() },
            "M.Shadow.Rounded.Default" to { TabBarClear.M.Shadow.Rounded.Default.style() },
            "M.Shadow.Rounded.Secondary" to { TabBarClear.M.Shadow.Rounded.Secondary.style() },
            "M.Shadow.Rounded.Accent" to { TabBarClear.M.Shadow.Rounded.Accent.style() },
            "M.Divider.Default" to { TabBarClear.M.Divider.Default.style() },
            "M.Divider.Secondary" to { TabBarClear.M.Divider.Secondary.style() },
            "M.Divider.Accent" to { TabBarClear.M.Divider.Accent.style() },
            "M.Divider.Rounded.Default" to { TabBarClear.M.Divider.Rounded.Default.style() },
            "M.Divider.Rounded.Secondary" to { TabBarClear.M.Divider.Rounded.Secondary.style() },
            "M.Divider.Rounded.Accent" to { TabBarClear.M.Divider.Rounded.Accent.style() },
            "L.Default" to { TabBarClear.L.Default.style() },
            "L.Secondary" to { TabBarClear.L.Secondary.style() },
            "L.Accent" to { TabBarClear.L.Accent.style() },
            "L.Rounded.Default" to { TabBarClear.L.Rounded.Default.style() },
            "L.Rounded.Secondary" to { TabBarClear.L.Rounded.Secondary.style() },
            "L.Rounded.Accent" to { TabBarClear.L.Rounded.Accent.style() },
            "L.Shadow.Default" to { TabBarClear.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarClear.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarClear.L.Shadow.Accent.style() },
            "L.Shadow.Rounded.Default" to { TabBarClear.L.Shadow.Rounded.Default.style() },
            "L.Shadow.Rounded.Secondary" to { TabBarClear.L.Shadow.Rounded.Secondary.style() },
            "L.Shadow.Rounded.Accent" to { TabBarClear.L.Shadow.Rounded.Accent.style() },
            "L.Divider.Default" to { TabBarClear.L.Divider.Default.style() },
            "L.Divider.Secondary" to { TabBarClear.L.Divider.Secondary.style() },
            "L.Divider.Accent" to { TabBarClear.L.Divider.Accent.style() },
            "L.Divider.Rounded.Default" to { TabBarClear.L.Divider.Rounded.Default.style() },
            "L.Divider.Rounded.Secondary" to { TabBarClear.L.Divider.Rounded.Secondary.style() },
            "L.Divider.Rounded.Accent" to { TabBarClear.L.Divider.Rounded.Accent.style() },
        )
}
