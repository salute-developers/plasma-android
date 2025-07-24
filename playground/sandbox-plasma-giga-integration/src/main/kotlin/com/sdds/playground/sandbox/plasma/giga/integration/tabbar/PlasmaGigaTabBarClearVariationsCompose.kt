package com.sdds.playground.sandbox.plasma.giga.integration.tabbar

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

internal object PlasmaGigaTabBarClearVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarClear.L.Default.style() },
            "LSecondary" to { TabBarClear.L.Secondary.style() },
            "LAccent" to { TabBarClear.L.Accent.style() },
            "LRoundedDefault" to { TabBarClear.L.Rounded.Default.style() },
            "LRoundedSecondary" to { TabBarClear.L.Rounded.Secondary.style() },
            "LRoundedAccent" to { TabBarClear.L.Rounded.Accent.style() },
            "LDividerDefault" to { TabBarClear.L.Divider.Default.style() },
            "LDividerSecondary" to { TabBarClear.L.Divider.Secondary.style() },
            "LDividerAccent" to { TabBarClear.L.Divider.Accent.style() },
            "LDividerRoundedDefault" to { TabBarClear.L.Divider.Rounded.Default.style() },
            "LDividerRoundedSecondary" to { TabBarClear.L.Divider.Rounded.Secondary.style() },
            "LDividerRoundedAccent" to { TabBarClear.L.Divider.Rounded.Accent.style() },
            "LShadowDefault" to { TabBarClear.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarClear.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarClear.L.Shadow.Accent.style() },
            "LShadowRoundedDefault" to { TabBarClear.L.Shadow.Rounded.Default.style() },
            "LShadowRoundedSecondary" to { TabBarClear.L.Shadow.Rounded.Secondary.style() },
            "LShadowRoundedAccent" to { TabBarClear.L.Shadow.Rounded.Accent.style() },

            "MDefault" to { TabBarClear.M.Default.style() },
            "MSecondary" to { TabBarClear.M.Secondary.style() },
            "MAccent" to { TabBarClear.M.Accent.style() },
            "MRoundedDefault" to { TabBarClear.M.Rounded.Default.style() },
            "MRoundedSecondary" to { TabBarClear.M.Rounded.Secondary.style() },
            "MRoundedAccent" to { TabBarClear.M.Rounded.Accent.style() },
            "MDividerDefault" to { TabBarClear.M.Divider.Default.style() },
            "MDividerSecondary" to { TabBarClear.M.Divider.Secondary.style() },
            "MDividerAccent" to { TabBarClear.M.Divider.Accent.style() },
            "MDividerRoundedDefault" to { TabBarClear.M.Divider.Rounded.Default.style() },
            "MDividerRoundedSecondary" to { TabBarClear.M.Divider.Rounded.Secondary.style() },
            "MDividerRoundedAccent" to { TabBarClear.M.Divider.Rounded.Accent.style() },
            "MShadowDefault" to { TabBarClear.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarClear.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarClear.M.Shadow.Accent.style() },
            "MShadowRoundedDefault" to { TabBarClear.M.Shadow.Rounded.Default.style() },
            "MShadowRoundedSecondary" to { TabBarClear.M.Shadow.Rounded.Secondary.style() },
            "MShadowRoundedAccent" to { TabBarClear.M.Shadow.Rounded.Accent.style() },
        )
}
