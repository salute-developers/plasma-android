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
import com.sdds.plasma.sd.service.styles.tabbar.TabBarIslandClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceTabBarIslandClearVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "LDefault" to { TabBarIslandClear.L.Default.style() },
            "LSecondary" to { TabBarIslandClear.L.Secondary.style() },
            "LAccent" to { TabBarIslandClear.L.Accent.style() },
            "LShadowDefault" to { TabBarIslandClear.L.Shadow.Default.style() },
            "LShadowSecondary" to { TabBarIslandClear.L.Shadow.Secondary.style() },
            "LShadowAccent" to { TabBarIslandClear.L.Shadow.Accent.style() },

            "MDefault" to { TabBarIslandClear.M.Default.style() },
            "MSecondary" to { TabBarIslandClear.M.Secondary.style() },
            "MAccent" to { TabBarIslandClear.M.Accent.style() },
            "MShadowDefault" to { TabBarIslandClear.M.Shadow.Default.style() },
            "MShadowSecondary" to { TabBarIslandClear.M.Shadow.Secondary.style() },
            "MShadowAccent" to { TabBarIslandClear.M.Shadow.Accent.style() },
        )
}
