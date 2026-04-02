// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tabbaritem.Accent
import com.sdds.plasma.giga.styles.tabbaritem.Default
import com.sdds.plasma.giga.styles.tabbaritem.L
import com.sdds.plasma.giga.styles.tabbaritem.Label
import com.sdds.plasma.giga.styles.tabbaritem.M
import com.sdds.plasma.giga.styles.tabbaritem.Secondary
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemClear

internal object PlasmaGigaTabBarItemClearVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
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
