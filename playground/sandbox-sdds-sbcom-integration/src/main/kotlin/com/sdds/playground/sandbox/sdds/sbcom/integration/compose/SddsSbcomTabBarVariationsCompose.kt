package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.tabbar.Default
import com.sdds.sbcom.styles.tabbar.TabBar

internal object SddsSbcomTabBarVariationsCompose : ComposeStyleProvider<String, TabBarStyle>() {
    override val variations: Map<String, @Composable () -> TabBarStyle> =
        mapOf(
            "Default" to { TabBar.Default.style() },
        )
}
