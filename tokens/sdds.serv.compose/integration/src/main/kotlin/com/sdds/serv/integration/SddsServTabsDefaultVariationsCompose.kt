// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs

internal object SddsServTabsDefaultVariationsCompose : ComposeStyleProvider<TabsStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabsStyle>> =
        mapOf(
            "L" to ComposeStyleReference { TabsDefault.L.style() },
            "L.Vertical" to ComposeStyleReference { TabsDefault.L.Vertical.style() },
            "L.Horizontal" to ComposeStyleReference { TabsDefault.L.Horizontal.style() },
            "M" to ComposeStyleReference { TabsDefault.M.style() },
            "M.Vertical" to ComposeStyleReference { TabsDefault.M.Vertical.style() },
            "M.Horizontal" to ComposeStyleReference { TabsDefault.M.Horizontal.style() },
            "S" to ComposeStyleReference { TabsDefault.S.style() },
            "S.Vertical" to ComposeStyleReference { TabsDefault.S.Vertical.style() },
            "S.Horizontal" to ComposeStyleReference { TabsDefault.S.Horizontal.style() },
            "Xs" to ComposeStyleReference { TabsDefault.Xs.style() },
            "Xs.Vertical" to ComposeStyleReference { TabsDefault.Xs.Vertical.style() },
            "Xs.Horizontal" to ComposeStyleReference { TabsDefault.Xs.Horizontal.style() },
        )
}
