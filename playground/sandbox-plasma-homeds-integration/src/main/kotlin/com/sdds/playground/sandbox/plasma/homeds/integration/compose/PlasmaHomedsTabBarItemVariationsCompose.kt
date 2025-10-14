package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.tabbaritem.Default
import com.sdds.plasma.homeds.styles.tabbaritem.TabBarItem
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsTabBarItemVariationsCompose : ComposeStyleProvider<String, TabBarItemStyle>() {
    override val variations: Map<String, @Composable () -> TabBarItemStyle> =
        mapOf(
            "Default" to { TabBarItem.Default.style() },
        )
}
