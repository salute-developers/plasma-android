package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.tabbar.Accent
import com.sdds.plasma.sd.service.styles.tabbar.Default
import com.sdds.plasma.sd.service.styles.tabbar.Divider
import com.sdds.plasma.sd.service.styles.tabbar.L
import com.sdds.plasma.sd.service.styles.tabbar.M
import com.sdds.plasma.sd.service.styles.tabbar.Rounded
import com.sdds.plasma.sd.service.styles.tabbar.Secondary
import com.sdds.plasma.sd.service.styles.tabbar.Shadow
import com.sdds.plasma.sd.service.styles.tabbar.TabBarSolid
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cTabBarSolidVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarSolid.M.Default.style() },
            "M.Secondary" to { TabBarSolid.M.Secondary.style() },
            "M.Accent" to { TabBarSolid.M.Accent.style() },
            "M.Rounded.Default" to { TabBarSolid.M.Rounded.Default.style() },
            "M.Rounded.Secondary" to { TabBarSolid.M.Rounded.Secondary.style() },
            "M.Rounded.Accent" to { TabBarSolid.M.Rounded.Accent.style() },
            "M.Shadow.Default" to { TabBarSolid.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarSolid.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarSolid.M.Shadow.Accent.style() },
            "M.Shadow.Rounded.Default" to { TabBarSolid.M.Shadow.Rounded.Default.style() },
            "M.Shadow.Rounded.Secondary" to { TabBarSolid.M.Shadow.Rounded.Secondary.style() },
            "M.Shadow.Rounded.Accent" to { TabBarSolid.M.Shadow.Rounded.Accent.style() },
            "M.Divider.Default" to { TabBarSolid.M.Divider.Default.style() },
            "M.Divider.Secondary" to { TabBarSolid.M.Divider.Secondary.style() },
            "M.Divider.Accent" to { TabBarSolid.M.Divider.Accent.style() },
            "M.Divider.Rounded.Default" to { TabBarSolid.M.Divider.Rounded.Default.style() },
            "M.Divider.Rounded.Secondary" to { TabBarSolid.M.Divider.Rounded.Secondary.style() },
            "M.Divider.Rounded.Accent" to { TabBarSolid.M.Divider.Rounded.Accent.style() },
            "L.Default" to { TabBarSolid.L.Default.style() },
            "L.Secondary" to { TabBarSolid.L.Secondary.style() },
            "L.Accent" to { TabBarSolid.L.Accent.style() },
            "L.Rounded.Default" to { TabBarSolid.L.Rounded.Default.style() },
            "L.Rounded.Secondary" to { TabBarSolid.L.Rounded.Secondary.style() },
            "L.Rounded.Accent" to { TabBarSolid.L.Rounded.Accent.style() },
            "L.Shadow.Default" to { TabBarSolid.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarSolid.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarSolid.L.Shadow.Accent.style() },
            "L.Shadow.Rounded.Default" to { TabBarSolid.L.Shadow.Rounded.Default.style() },
            "L.Shadow.Rounded.Secondary" to { TabBarSolid.L.Shadow.Rounded.Secondary.style() },
            "L.Shadow.Rounded.Accent" to { TabBarSolid.L.Shadow.Rounded.Accent.style() },
            "L.Divider.Default" to { TabBarSolid.L.Divider.Default.style() },
            "L.Divider.Secondary" to { TabBarSolid.L.Divider.Secondary.style() },
            "L.Divider.Accent" to { TabBarSolid.L.Divider.Accent.style() },
            "L.Divider.Rounded.Default" to { TabBarSolid.L.Divider.Rounded.Default.style() },
            "L.Divider.Rounded.Secondary" to { TabBarSolid.L.Divider.Rounded.Secondary.style() },
            "L.Divider.Rounded.Accent" to { TabBarSolid.L.Divider.Rounded.Accent.style() },
        )
}
