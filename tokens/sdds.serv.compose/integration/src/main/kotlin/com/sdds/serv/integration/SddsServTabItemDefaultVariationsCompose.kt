// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabitem.Horizontal
import com.sdds.serv.styles.tabitem.L
import com.sdds.serv.styles.tabitem.M
import com.sdds.serv.styles.tabitem.S
import com.sdds.serv.styles.tabitem.TabItemDefault
import com.sdds.serv.styles.tabitem.Vertical
import com.sdds.serv.styles.tabitem.Xs

internal object SddsServTabItemDefaultVariationsCompose : ComposeStyleProvider<TabItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "L" to ComposeStyleReference { TabItemDefault.L.style() },
            "L.Horizontal" to ComposeStyleReference { TabItemDefault.L.Horizontal.style() },
            "L.Vertical" to ComposeStyleReference { TabItemDefault.L.Vertical.style() },
            "M" to ComposeStyleReference { TabItemDefault.M.style() },
            "M.Horizontal" to ComposeStyleReference { TabItemDefault.M.Horizontal.style() },
            "M.Vertical" to ComposeStyleReference { TabItemDefault.M.Vertical.style() },
            "S" to ComposeStyleReference { TabItemDefault.S.style() },
            "S.Horizontal" to ComposeStyleReference { TabItemDefault.S.Horizontal.style() },
            "S.Vertical" to ComposeStyleReference { TabItemDefault.S.Vertical.style() },
            "Xs" to ComposeStyleReference { TabItemDefault.Xs.style() },
            "Xs.Horizontal" to ComposeStyleReference { TabItemDefault.Xs.Horizontal.style() },
            "Xs.Vertical" to ComposeStyleReference { TabItemDefault.Xs.Vertical.style() },
        )
}
