package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.IconTabs
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs

internal object SddsServIconTabsVariationsCompose : ComposeStyleProvider<String, TabsStyle>() {
    override val variations: Map<String, @Composable () -> TabsStyle> =
        mapOf(
            "L" to { IconTabs.L.style() },
            "L.Vertical" to { IconTabs.L.Vertical.style() },
            "L.Horizontal" to { IconTabs.L.Horizontal.style() },
            "M" to { IconTabs.M.style() },
            "M.Vertical" to { IconTabs.M.Vertical.style() },
            "M.Horizontal" to { IconTabs.M.Horizontal.style() },
            "S" to { IconTabs.S.style() },
            "S.Vertical" to { IconTabs.S.Vertical.style() },
            "S.Horizontal" to { IconTabs.S.Horizontal.style() },
            "Xs" to { IconTabs.Xs.style() },
            "Xs.Vertical" to { IconTabs.Xs.Vertical.style() },
            "Xs.Horizontal" to { IconTabs.Xs.Horizontal.style() },
        )
}
