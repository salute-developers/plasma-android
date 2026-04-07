// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabbaritem.Accent
import com.sdds.serv.styles.tabbaritem.Default
import com.sdds.serv.styles.tabbaritem.L
import com.sdds.serv.styles.tabbaritem.Label
import com.sdds.serv.styles.tabbaritem.M
import com.sdds.serv.styles.tabbaritem.Secondary
import com.sdds.serv.styles.tabbaritem.TabBarItemClear

internal object SddsServTabBarItemClearVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabBarItemStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { TabBarItemClear.M.Default.style() },
            "M.Accent" to ComposeStyleReference { TabBarItemClear.M.Accent.style() },
            "M.Secondary" to ComposeStyleReference { TabBarItemClear.M.Secondary.style() },
            "M.Label.Default" to ComposeStyleReference { TabBarItemClear.M.Label.Default.style() },
            "M.Label.Accent" to ComposeStyleReference { TabBarItemClear.M.Label.Accent.style() },
            "M.Label.Secondary" to ComposeStyleReference { TabBarItemClear.M.Label.Secondary.style() },
            "L.Default" to ComposeStyleReference { TabBarItemClear.L.Default.style() },
            "L.Accent" to ComposeStyleReference { TabBarItemClear.L.Accent.style() },
            "L.Secondary" to ComposeStyleReference { TabBarItemClear.L.Secondary.style() },
            "L.Label.Default" to ComposeStyleReference { TabBarItemClear.L.Label.Default.style() },
            "L.Label.Accent" to ComposeStyleReference { TabBarItemClear.L.Label.Accent.style() },
            "L.Label.Secondary" to ComposeStyleReference { TabBarItemClear.L.Label.Secondary.style() },
        )
}
