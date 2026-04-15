// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tabbar.Accent
import com.sdds.plasma.giga.styles.tabbar.Default
import com.sdds.plasma.giga.styles.tabbar.L
import com.sdds.plasma.giga.styles.tabbar.M
import com.sdds.plasma.giga.styles.tabbar.Secondary
import com.sdds.plasma.giga.styles.tabbar.Shadow
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandSolid

internal object PlasmaGigaTabBarIslandSolidVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { TabBarIslandSolid.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { TabBarIslandSolid.M.Secondary.style() },
            "M.Accent" to ComposeStyleReference { TabBarIslandSolid.M.Accent.style() },
            "M.Shadow.Default" to ComposeStyleReference { TabBarIslandSolid.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to ComposeStyleReference { TabBarIslandSolid.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to ComposeStyleReference { TabBarIslandSolid.M.Shadow.Accent.style() },
            "L.Default" to ComposeStyleReference { TabBarIslandSolid.L.Default.style() },
            "L.Secondary" to ComposeStyleReference { TabBarIslandSolid.L.Secondary.style() },
            "L.Accent" to ComposeStyleReference { TabBarIslandSolid.L.Accent.style() },
            "L.Shadow.Default" to ComposeStyleReference { TabBarIslandSolid.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to ComposeStyleReference { TabBarIslandSolid.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to ComposeStyleReference { TabBarIslandSolid.L.Shadow.Accent.style() },
        )
}
