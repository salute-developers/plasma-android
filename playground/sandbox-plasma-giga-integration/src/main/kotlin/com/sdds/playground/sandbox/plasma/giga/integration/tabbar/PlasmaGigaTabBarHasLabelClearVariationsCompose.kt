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
import com.sdds.plasma.giga.styles.tabbar.TabBarHasLabelClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaTabBarHasLabelClearVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarHasLabelClear.L.Default.style() },
            "LSecondary" to { TabBarHasLabelClear.L.Secondary.style() },
            "LAccent" to { TabBarHasLabelClear.L.Accent.style() },
            "LRoundedDefault" to { TabBarHasLabelClear.L.Rounded.Default.style() },
            "LRoundedSecondary" to { TabBarHasLabelClear.L.Rounded.Secondary.style() },
            "LRoundedAccent" to { TabBarHasLabelClear.L.Rounded.Accent.style() },
            "LDividerDefault" to { TabBarHasLabelClear.L.Divider.Default.style() },
            "LDividerSecondary" to { TabBarHasLabelClear.L.Divider.Secondary.style() },
            "LDividerAccent" to { TabBarHasLabelClear.L.Divider.Accent.style() },
            "LDividerRoundedDefault" to { TabBarHasLabelClear.L.Divider.Rounded.Default.style() },
            "LDividerRoundedSecondary" to { TabBarHasLabelClear.L.Divider.Rounded.Secondary.style() },
            "LDividerRoundedAccent" to { TabBarHasLabelClear.L.Divider.Rounded.Accent.style() },
            "LShadowDefault" to { TabBarHasLabelClear.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarHasLabelClear.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarHasLabelClear.L.Shadow.Accent.style() },
            "LShadowRoundedDefault" to { TabBarHasLabelClear.L.Shadow.Rounded.Default.style() },
            "LShadowRoundedSecondary" to { TabBarHasLabelClear.L.Shadow.Rounded.Secondary.style() },
            "LShadowRoundedAccent" to { TabBarHasLabelClear.L.Shadow.Rounded.Accent.style() },

            "MDefault" to { TabBarHasLabelClear.M.Default.style() },
            "MSecondary" to { TabBarHasLabelClear.M.Secondary.style() },
            "MAccent" to { TabBarHasLabelClear.M.Accent.style() },
            "MRoundedDefault" to { TabBarHasLabelClear.M.Rounded.Default.style() },
            "MRoundedSecondary" to { TabBarHasLabelClear.M.Rounded.Secondary.style() },
            "MRoundedAccent" to { TabBarHasLabelClear.M.Rounded.Accent.style() },
            "MDividerDefault" to { TabBarHasLabelClear.M.Divider.Default.style() },
            "MDividerSecondary" to { TabBarHasLabelClear.M.Divider.Secondary.style() },
            "MDividerAccent" to { TabBarHasLabelClear.M.Divider.Accent.style() },
            "MDividerRoundedDefault" to { TabBarHasLabelClear.M.Divider.Rounded.Default.style() },
            "MDividerRoundedSecondary" to { TabBarHasLabelClear.M.Divider.Rounded.Secondary.style() },
            "MDividerRoundedAccent" to { TabBarHasLabelClear.M.Divider.Rounded.Accent.style() },
            "MShadowDefault" to { TabBarHasLabelClear.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarHasLabelClear.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarHasLabelClear.M.Shadow.Accent.style() },
            "MShadowRoundedDefault" to { TabBarHasLabelClear.M.Shadow.Rounded.Default.style() },
            "MShadowRoundedSecondary" to { TabBarHasLabelClear.M.Shadow.Rounded.Secondary.style() },
            "MShadowRoundedAccent" to { TabBarHasLabelClear.M.Shadow.Rounded.Accent.style() },
        )
}
