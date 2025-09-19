package com.sdds.playground.sandbox.plasma.homeds.integration.tabbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.tabbar.Default
import com.sdds.plasma.homeds.styles.tabbar.TabBar
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsTabBarVariationsCompose :
    ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "Default" to { TabBar.Default.style() },
        )
}
