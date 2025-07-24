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
import com.sdds.serv.styles.tabbar.TabBarHasLabelSolid

internal object SddsServTabBarHasLabelSolidVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarHasLabelSolid.L.Default.style() },
            "LSecondary" to { TabBarHasLabelSolid.L.Secondary.style() },
            "LAccent" to { TabBarHasLabelSolid.L.Accent.style() },
            "LRoundedDefault" to { TabBarHasLabelSolid.L.Rounded.Default.style() },
            "LRoundedSecondary" to { TabBarHasLabelSolid.L.Rounded.Secondary.style() },
            "LRoundedAccent" to { TabBarHasLabelSolid.L.Rounded.Accent.style() },
            "LDividerDefault" to { TabBarHasLabelSolid.L.Divider.Default.style() },
            "LDividerSecondary" to { TabBarHasLabelSolid.L.Divider.Secondary.style() },
            "LDividerAccent" to { TabBarHasLabelSolid.L.Divider.Accent.style() },
            "LDividerRoundedDefault" to { TabBarHasLabelSolid.L.Divider.Rounded.Default.style() },
            "LDividerRoundedSecondary" to { TabBarHasLabelSolid.L.Divider.Rounded.Secondary.style() },
            "LDividerRoundedAccent" to { TabBarHasLabelSolid.L.Divider.Rounded.Accent.style() },
            "LShadowDefault" to { TabBarHasLabelSolid.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarHasLabelSolid.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarHasLabelSolid.L.Shadow.Accent.style() },
            "LShadowRoundedDefault" to { TabBarHasLabelSolid.L.Shadow.Rounded.Default.style() },
            "LShadowRoundedSecondary" to { TabBarHasLabelSolid.L.Shadow.Rounded.Secondary.style() },
            "LShadowRoundedAccent" to { TabBarHasLabelSolid.L.Shadow.Rounded.Accent.style() },

            "MDefault" to { TabBarHasLabelSolid.M.Default.style() },
            "MSecondary" to { TabBarHasLabelSolid.M.Secondary.style() },
            "MAccent" to { TabBarHasLabelSolid.M.Accent.style() },
            "MRoundedDefault" to { TabBarHasLabelSolid.M.Rounded.Default.style() },
            "MRoundedSecondary" to { TabBarHasLabelSolid.M.Rounded.Secondary.style() },
            "MRoundedAccent" to { TabBarHasLabelSolid.M.Rounded.Accent.style() },
            "MDividerDefault" to { TabBarHasLabelSolid.M.Divider.Default.style() },
            "MDividerSecondary" to { TabBarHasLabelSolid.M.Divider.Secondary.style() },
            "MDividerAccent" to { TabBarHasLabelSolid.M.Divider.Accent.style() },
            "MDividerRoundedDefault" to { TabBarHasLabelSolid.M.Divider.Rounded.Default.style() },
            "MDividerRoundedSecondary" to { TabBarHasLabelSolid.M.Divider.Rounded.Secondary.style() },
            "MDividerRoundedAccent" to { TabBarHasLabelSolid.M.Divider.Rounded.Accent.style() },
            "MShadowDefault" to { TabBarHasLabelSolid.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarHasLabelSolid.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarHasLabelSolid.M.Shadow.Accent.style() },
            "MShadowRoundedDefault" to { TabBarHasLabelSolid.M.Shadow.Rounded.Default.style() },
            "MShadowRoundedSecondary" to { TabBarHasLabelSolid.M.Shadow.Rounded.Secondary.style() },
            "MShadowRoundedAccent" to { TabBarHasLabelSolid.M.Shadow.Rounded.Accent.style() },
        )
}
