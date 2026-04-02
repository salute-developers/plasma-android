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
import com.sdds.serv.styles.tabs.IconTabs
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs

internal object SddsServIconTabsVariationsCompose : ComposeStyleProvider<TabsStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabsStyle>> =
        mapOf(
            "L" to ComposeStyleReference { IconTabs.L.style() },
            "L.Vertical" to ComposeStyleReference { IconTabs.L.Vertical.style() },
            "L.Horizontal" to ComposeStyleReference { IconTabs.L.Horizontal.style() },
            "M" to ComposeStyleReference { IconTabs.M.style() },
            "M.Vertical" to ComposeStyleReference { IconTabs.M.Vertical.style() },
            "M.Horizontal" to ComposeStyleReference { IconTabs.M.Horizontal.style() },
            "S" to ComposeStyleReference { IconTabs.S.style() },
            "S.Vertical" to ComposeStyleReference { IconTabs.S.Vertical.style() },
            "S.Horizontal" to ComposeStyleReference { IconTabs.S.Horizontal.style() },
            "Xs" to ComposeStyleReference { IconTabs.Xs.style() },
            "Xs.Vertical" to ComposeStyleReference { IconTabs.Xs.Vertical.style() },
            "Xs.Horizontal" to ComposeStyleReference { IconTabs.Xs.Horizontal.style() },
        )
}
