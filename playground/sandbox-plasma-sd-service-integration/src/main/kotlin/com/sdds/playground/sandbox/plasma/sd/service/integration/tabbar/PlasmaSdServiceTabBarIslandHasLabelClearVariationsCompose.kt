package com.sdds.playground.sandbox.plasma.sd.service.integration.tabbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.tabbar.Accent
import com.sdds.plasma.sd.service.styles.tabbar.Default
import com.sdds.plasma.sd.service.styles.tabbar.L
import com.sdds.plasma.sd.service.styles.tabbar.M
import com.sdds.plasma.sd.service.styles.tabbar.Secondary
import com.sdds.plasma.sd.service.styles.tabbar.Shadow
import com.sdds.plasma.sd.service.styles.tabbar.TabBarIslandHasLabelClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceTabBarIslandHasLabelClearVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarIslandHasLabelClear.L.Default.style() },
            "LSecondary" to { TabBarIslandHasLabelClear.L.Secondary.style() },
            "LAccent" to { TabBarIslandHasLabelClear.L.Accent.style() },
            "LShadowDefault" to { TabBarIslandHasLabelClear.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarIslandHasLabelClear.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarIslandHasLabelClear.L.Shadow.Accent.style() },

            "MDefault" to { TabBarIslandHasLabelClear.M.Default.style() },
            "MSecondary" to { TabBarIslandHasLabelClear.M.Secondary.style() },
            "MAccent" to { TabBarIslandHasLabelClear.M.Accent.style() },
            "MShadowDefault" to { TabBarIslandHasLabelClear.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarIslandHasLabelClear.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarIslandHasLabelClear.M.Shadow.Accent.style() },
        )
}
