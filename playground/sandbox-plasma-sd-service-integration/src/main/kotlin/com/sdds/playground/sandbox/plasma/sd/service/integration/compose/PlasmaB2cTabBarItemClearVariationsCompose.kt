package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.tabbaritem.Accent
import com.sdds.plasma.sd.service.styles.tabbaritem.Default
import com.sdds.plasma.sd.service.styles.tabbaritem.L
import com.sdds.plasma.sd.service.styles.tabbaritem.Label
import com.sdds.plasma.sd.service.styles.tabbaritem.M
import com.sdds.plasma.sd.service.styles.tabbaritem.Secondary
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemClear
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cTabBarItemClearVariationsCompose : ComposeStyleProvider<String, TabBarItemStyle>() {
    override val variations: Map<String, @Composable () -> TabBarItemStyle> =
        mapOf(
            "M.Default" to { TabBarItemClear.M.Default.style() },
            "M.Accent" to { TabBarItemClear.M.Accent.style() },
            "M.Secondary" to { TabBarItemClear.M.Secondary.style() },
            "M.Label.Default" to { TabBarItemClear.M.Label.Default.style() },
            "M.Label.Accent" to { TabBarItemClear.M.Label.Accent.style() },
            "M.Label.Secondary" to { TabBarItemClear.M.Label.Secondary.style() },
            "L.Default" to { TabBarItemClear.L.Default.style() },
            "L.Accent" to { TabBarItemClear.L.Accent.style() },
            "L.Secondary" to { TabBarItemClear.L.Secondary.style() },
            "L.Label.Default" to { TabBarItemClear.L.Label.Default.style() },
            "L.Label.Accent" to { TabBarItemClear.L.Label.Accent.style() },
            "L.Label.Secondary" to { TabBarItemClear.L.Label.Secondary.style() },
        )
}
