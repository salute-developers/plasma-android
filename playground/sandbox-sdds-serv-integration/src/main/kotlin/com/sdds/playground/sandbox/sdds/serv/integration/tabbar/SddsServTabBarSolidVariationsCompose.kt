package com.sdds.playground.sandbox.sdds.serv.integration.tabbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabbar.Accent
import com.sdds.serv.styles.tabbar.Default
import com.sdds.serv.styles.tabbar.Divider
import com.sdds.serv.styles.tabbar.L
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.Rounded
import com.sdds.serv.styles.tabbar.Secondary
import com.sdds.serv.styles.tabbar.Shadow
import com.sdds.serv.styles.tabbar.TabBarSolid

internal object SddsServTabBarSolidVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarSolid.L.Default.style() },
            "LSecondary" to { TabBarSolid.L.Secondary.style() },
            "LAccent" to { TabBarSolid.L.Accent.style() },
            "LRoundedDefault" to { TabBarSolid.L.Rounded.Default.style() },
            "LRoundedSecondary" to { TabBarSolid.L.Rounded.Secondary.style() },
            "LRoundedAccent" to { TabBarSolid.L.Rounded.Accent.style() },
            "LDividerDefault" to { TabBarSolid.L.Divider.Default.style() },
            "LDividerSecondary" to { TabBarSolid.L.Divider.Secondary.style() },
            "LDividerAccent" to { TabBarSolid.L.Divider.Accent.style() },
            "LDividerRoundedDefault" to { TabBarSolid.L.Divider.Rounded.Default.style() },
            "LDividerRoundedSecondary" to { TabBarSolid.L.Divider.Rounded.Secondary.style() },
            "LDividerRoundedAccent" to { TabBarSolid.L.Divider.Rounded.Accent.style() },
            "LShadowDefault" to { TabBarSolid.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarSolid.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarSolid.L.Shadow.Accent.style() },
            "LShadowRoundedDefault" to { TabBarSolid.L.Shadow.Rounded.Default.style() },
            "LShadowRoundedSecondary" to { TabBarSolid.L.Shadow.Rounded.Secondary.style() },
            "LShadowRoundedAccent" to { TabBarSolid.L.Shadow.Rounded.Accent.style() },

            "MDefault" to { TabBarSolid.M.Default.style() },
            "MSecondary" to { TabBarSolid.M.Secondary.style() },
            "MAccent" to { TabBarSolid.M.Accent.style() },
            "MRoundedDefault" to { TabBarSolid.M.Rounded.Default.style() },
            "MRoundedSecondary" to { TabBarSolid.M.Rounded.Secondary.style() },
            "MRoundedAccent" to { TabBarSolid.M.Rounded.Accent.style() },
            "MDividerDefault" to { TabBarSolid.M.Divider.Default.style() },
            "MDividerSecondary" to { TabBarSolid.M.Divider.Secondary.style() },
            "MDividerAccent" to { TabBarSolid.M.Divider.Accent.style() },
            "MDividerRoundedDefault" to { TabBarSolid.M.Divider.Rounded.Default.style() },
            "MDividerRoundedSecondary" to { TabBarSolid.M.Divider.Rounded.Secondary.style() },
            "MDividerRoundedAccent" to { TabBarSolid.M.Divider.Rounded.Accent.style() },
            "MShadowDefault" to { TabBarSolid.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarSolid.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarSolid.M.Shadow.Accent.style() },
            "MShadowRoundedDefault" to { TabBarSolid.M.Shadow.Rounded.Default.style() },
            "MShadowRoundedSecondary" to { TabBarSolid.M.Shadow.Rounded.Secondary.style() },
            "MShadowRoundedAccent" to { TabBarSolid.M.Shadow.Rounded.Accent.style() },
        )
}
