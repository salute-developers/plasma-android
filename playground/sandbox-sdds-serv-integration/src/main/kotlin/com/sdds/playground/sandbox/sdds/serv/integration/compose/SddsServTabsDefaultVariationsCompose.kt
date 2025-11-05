package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs

internal object SddsServTabsDefaultVariationsCompose : ComposeStyleProvider<String, TabsStyle>() {
    override val variations: Map<String, @Composable () -> TabsStyle> =
        mapOf(
            "L" to { TabsDefault.L.style() },
            "L.Vertical" to { TabsDefault.L.Vertical.style() },
            "L.Horizontal" to { TabsDefault.L.Horizontal.style() },
            "M" to { TabsDefault.M.style() },
            "M.Vertical" to { TabsDefault.M.Vertical.style() },
            "M.Horizontal" to { TabsDefault.M.Horizontal.style() },
            "S" to { TabsDefault.S.style() },
            "S.Vertical" to { TabsDefault.S.Vertical.style() },
            "S.Horizontal" to { TabsDefault.S.Horizontal.style() },
            "Xs" to { TabsDefault.Xs.style() },
            "Xs.Vertical" to { TabsDefault.Xs.Vertical.style() },
            "Xs.Horizontal" to { TabsDefault.Xs.Horizontal.style() },
        )
}
