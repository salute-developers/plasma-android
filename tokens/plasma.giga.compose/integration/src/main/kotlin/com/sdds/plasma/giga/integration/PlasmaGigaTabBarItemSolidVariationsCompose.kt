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
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemSolid

internal object PlasmaGigaTabBarItemSolidVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabBarItemStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { TabBarItemSolid.M.Default.style() },
            "M.Accent" to ComposeStyleReference { TabBarItemSolid.M.Accent.style() },
            "M.Secondary" to ComposeStyleReference { TabBarItemSolid.M.Secondary.style() },
            "M.Label.Default" to ComposeStyleReference { TabBarItemSolid.M.Label.Default.style() },
            "M.Label.Accent" to ComposeStyleReference { TabBarItemSolid.M.Label.Accent.style() },
            "M.Label.Secondary" to ComposeStyleReference { TabBarItemSolid.M.Label.Secondary.style() },
            "L.Default" to ComposeStyleReference { TabBarItemSolid.L.Default.style() },
            "L.Accent" to ComposeStyleReference { TabBarItemSolid.L.Accent.style() },
            "L.Secondary" to ComposeStyleReference { TabBarItemSolid.L.Secondary.style() },
            "L.Label.Default" to ComposeStyleReference { TabBarItemSolid.L.Label.Default.style() },
            "L.Label.Accent" to ComposeStyleReference { TabBarItemSolid.L.Label.Accent.style() },
            "L.Label.Secondary" to ComposeStyleReference { TabBarItemSolid.L.Label.Secondary.style() },
        )
}
