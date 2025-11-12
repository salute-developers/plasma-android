package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabitem.Horizontal
import com.sdds.serv.styles.tabitem.L
import com.sdds.serv.styles.tabitem.M
import com.sdds.serv.styles.tabitem.S
import com.sdds.serv.styles.tabitem.TabItemDefault
import com.sdds.serv.styles.tabitem.Vertical
import com.sdds.serv.styles.tabitem.Xs

internal object SddsServTabItemDefaultVariationsCompose : ComposeStyleProvider<String, TabItemStyle>() {
    override val variations: Map<String, @Composable () -> TabItemStyle> =
        mapOf(
            "L" to { TabItemDefault.L.style() },
            "L.Horizontal" to { TabItemDefault.L.Horizontal.style() },
            "L.Vertical" to { TabItemDefault.L.Vertical.style() },
            "M" to { TabItemDefault.M.style() },
            "M.Horizontal" to { TabItemDefault.M.Horizontal.style() },
            "M.Vertical" to { TabItemDefault.M.Vertical.style() },
            "S" to { TabItemDefault.S.style() },
            "S.Horizontal" to { TabItemDefault.S.Horizontal.style() },
            "S.Vertical" to { TabItemDefault.S.Vertical.style() },
            "Xs" to { TabItemDefault.Xs.style() },
            "Xs.Horizontal" to { TabItemDefault.Xs.Horizontal.style() },
            "Xs.Vertical" to { TabItemDefault.Xs.Vertical.style() },
        )
}
