package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.tabbaritem.Default
import com.sdds.sbcom.styles.tabbaritem.TabBarItem

internal object SddsSbcomTabBarItemVariationsCompose : ComposeStyleProvider<String, TabBarItemStyle>() {
    override val variations: Map<String, @Composable () -> TabBarItemStyle> =
        mapOf(
            "Default" to { TabBarItem.Default.style() },
        )
}
