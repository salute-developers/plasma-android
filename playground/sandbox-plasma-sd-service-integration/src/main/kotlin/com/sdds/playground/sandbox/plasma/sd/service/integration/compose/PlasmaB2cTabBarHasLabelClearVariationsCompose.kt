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
import com.sdds.plasma.sd.service.styles.tabbar.TabBarHasLabelClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cTabBarHasLabelClearVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "M.Default" to { TabBarHasLabelClear.M.Default.style() },
            "M.Secondary" to { TabBarHasLabelClear.M.Secondary.style() },
            "M.Accent" to { TabBarHasLabelClear.M.Accent.style() },
            "M.Rounded.Default" to { TabBarHasLabelClear.M.Rounded.Default.style() },
            "M.Rounded.Secondary" to { TabBarHasLabelClear.M.Rounded.Secondary.style() },
            "M.Rounded.Accent" to { TabBarHasLabelClear.M.Rounded.Accent.style() },
            "M.Shadow.Default" to { TabBarHasLabelClear.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to { TabBarHasLabelClear.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to { TabBarHasLabelClear.M.Shadow.Accent.style() },
            "M.Shadow.Rounded.Default" to { TabBarHasLabelClear.M.Shadow.Rounded.Default.style() },
            "M.Shadow.Rounded.Secondary" to { TabBarHasLabelClear.M.Shadow.Rounded.Secondary.style() },
            "M.Shadow.Rounded.Accent" to { TabBarHasLabelClear.M.Shadow.Rounded.Accent.style() },
            "M.Divider.Default" to { TabBarHasLabelClear.M.Divider.Default.style() },
            "M.Divider.Secondary" to { TabBarHasLabelClear.M.Divider.Secondary.style() },
            "M.Divider.Accent" to { TabBarHasLabelClear.M.Divider.Accent.style() },
            "M.Divider.Rounded.Default" to { TabBarHasLabelClear.M.Divider.Rounded.Default.style() },
            "M.Divider.Rounded.Secondary" to { TabBarHasLabelClear.M.Divider.Rounded.Secondary.style() },
            "M.Divider.Rounded.Accent" to { TabBarHasLabelClear.M.Divider.Rounded.Accent.style() },
            "L.Default" to { TabBarHasLabelClear.L.Default.style() },
            "L.Secondary" to { TabBarHasLabelClear.L.Secondary.style() },
            "L.Accent" to { TabBarHasLabelClear.L.Accent.style() },
            "L.Rounded.Default" to { TabBarHasLabelClear.L.Rounded.Default.style() },
            "L.Rounded.Secondary" to { TabBarHasLabelClear.L.Rounded.Secondary.style() },
            "L.Rounded.Accent" to { TabBarHasLabelClear.L.Rounded.Accent.style() },
            "L.Shadow.Default" to { TabBarHasLabelClear.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to { TabBarHasLabelClear.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to { TabBarHasLabelClear.L.Shadow.Accent.style() },
            "L.Shadow.Rounded.Default" to { TabBarHasLabelClear.L.Shadow.Rounded.Default.style() },
            "L.Shadow.Rounded.Secondary" to { TabBarHasLabelClear.L.Shadow.Rounded.Secondary.style() },
            "L.Shadow.Rounded.Accent" to { TabBarHasLabelClear.L.Shadow.Rounded.Accent.style() },
            "L.Divider.Default" to { TabBarHasLabelClear.L.Divider.Default.style() },
            "L.Divider.Secondary" to { TabBarHasLabelClear.L.Divider.Secondary.style() },
            "L.Divider.Accent" to { TabBarHasLabelClear.L.Divider.Accent.style() },
            "L.Divider.Rounded.Default" to { TabBarHasLabelClear.L.Divider.Rounded.Default.style() },
            "L.Divider.Rounded.Secondary" to { TabBarHasLabelClear.L.Divider.Rounded.Secondary.style() },
            "L.Divider.Rounded.Accent" to { TabBarHasLabelClear.L.Divider.Rounded.Accent.style() },
        )
}
