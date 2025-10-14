package com.sdds.playground.sandbox.sdds.serv.integration.compose

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

internal object SddsServTabBarHasLabelSolidVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarHasLabelSolid.M.Default.style() },
            "M.Secondary" to { TabBarHasLabelSolid.M.Secondary.style() },
            "M.Accent" to { TabBarHasLabelSolid.M.Accent.style() },
            "M.Rounded.Default" to { TabBarHasLabelSolid.M.Rounded.Default.style() },
            "M.Rounded.Secondary" to { TabBarHasLabelSolid.M.Rounded.Secondary.style() },
            "M.Rounded.Accent" to { TabBarHasLabelSolid.M.Rounded.Accent.style() },
            "M.Shadow.Default" to { TabBarHasLabelSolid.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarHasLabelSolid.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarHasLabelSolid.M.Shadow.Accent.style() },
            "M.Shadow.Rounded.Default" to { TabBarHasLabelSolid.M.Shadow.Rounded.Default.style() },
            "M.Shadow.Rounded.Secondary" to { TabBarHasLabelSolid.M.Shadow.Rounded.Secondary.style() },
            "M.Shadow.Rounded.Accent" to { TabBarHasLabelSolid.M.Shadow.Rounded.Accent.style() },
            "M.Divider.Default" to { TabBarHasLabelSolid.M.Divider.Default.style() },
            "M.Divider.Secondary" to { TabBarHasLabelSolid.M.Divider.Secondary.style() },
            "M.Divider.Accent" to { TabBarHasLabelSolid.M.Divider.Accent.style() },
            "M.Divider.Rounded.Default" to { TabBarHasLabelSolid.M.Divider.Rounded.Default.style() },
            "M.Divider.Rounded.Secondary" to { TabBarHasLabelSolid.M.Divider.Rounded.Secondary.style() },
            "M.Divider.Rounded.Accent" to { TabBarHasLabelSolid.M.Divider.Rounded.Accent.style() },
            "L.Default" to { TabBarHasLabelSolid.L.Default.style() },
            "L.Secondary" to { TabBarHasLabelSolid.L.Secondary.style() },
            "L.Accent" to { TabBarHasLabelSolid.L.Accent.style() },
            "L.Rounded.Default" to { TabBarHasLabelSolid.L.Rounded.Default.style() },
            "L.Rounded.Secondary" to { TabBarHasLabelSolid.L.Rounded.Secondary.style() },
            "L.Rounded.Accent" to { TabBarHasLabelSolid.L.Rounded.Accent.style() },
            "L.Shadow.Default" to { TabBarHasLabelSolid.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarHasLabelSolid.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarHasLabelSolid.L.Shadow.Accent.style() },
            "L.Shadow.Rounded.Default" to { TabBarHasLabelSolid.L.Shadow.Rounded.Default.style() },
            "L.Shadow.Rounded.Secondary" to { TabBarHasLabelSolid.L.Shadow.Rounded.Secondary.style() },
            "L.Shadow.Rounded.Accent" to { TabBarHasLabelSolid.L.Shadow.Rounded.Accent.style() },
            "L.Divider.Default" to { TabBarHasLabelSolid.L.Divider.Default.style() },
            "L.Divider.Secondary" to { TabBarHasLabelSolid.L.Divider.Secondary.style() },
            "L.Divider.Accent" to { TabBarHasLabelSolid.L.Divider.Accent.style() },
            "L.Divider.Rounded.Default" to { TabBarHasLabelSolid.L.Divider.Rounded.Default.style() },
            "L.Divider.Rounded.Secondary" to { TabBarHasLabelSolid.L.Divider.Rounded.Secondary.style() },
            "L.Divider.Rounded.Accent" to { TabBarHasLabelSolid.L.Divider.Rounded.Accent.style() },
        )
}
