// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabbar.Accent
import com.sdds.serv.styles.tabbar.Default
import com.sdds.serv.styles.tabbar.L
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.Secondary
import com.sdds.serv.styles.tabbar.Shadow
import com.sdds.serv.styles.tabbar.TabBarIslandHasLabelSolid

internal object SddsServTabBarIslandHasLabelSolidVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Secondary.style() },
            "M.Accent" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Accent.style() },
            "M.Shadow.Default" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Shadow.Accent.style() },
            "L.Default" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Default.style() },
            "L.Secondary" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Secondary.style() },
            "L.Accent" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Accent.style() },
            "L.Shadow.Default" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Shadow.Accent.style() },
        )
}
