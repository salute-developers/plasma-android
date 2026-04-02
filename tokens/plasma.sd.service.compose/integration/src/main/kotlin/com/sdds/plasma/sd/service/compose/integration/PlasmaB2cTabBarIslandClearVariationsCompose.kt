// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.tabbar.Accent
import com.sdds.plasma.sd.service.styles.tabbar.Default
import com.sdds.plasma.sd.service.styles.tabbar.L
import com.sdds.plasma.sd.service.styles.tabbar.M
import com.sdds.plasma.sd.service.styles.tabbar.Secondary
import com.sdds.plasma.sd.service.styles.tabbar.Shadow
import com.sdds.plasma.sd.service.styles.tabbar.TabBarIslandClear

internal object PlasmaB2cTabBarIslandClearVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { TabBarIslandClear.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { TabBarIslandClear.M.Secondary.style() },
            "M.Accent" to ComposeStyleReference { TabBarIslandClear.M.Accent.style() },
            "M.Shadow.Default" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Default.style() },
            "M.Shadow.Secondary" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Secondary.style() },
            "M.Shadow.Accent" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Accent.style() },
            "L.Default" to ComposeStyleReference { TabBarIslandClear.L.Default.style() },
            "L.Secondary" to ComposeStyleReference { TabBarIslandClear.L.Secondary.style() },
            "L.Accent" to ComposeStyleReference { TabBarIslandClear.L.Accent.style() },
            "L.Shadow.Default" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Default.style() },
            "L.Shadow.Secondary" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Secondary.style() },
            "L.Shadow.Accent" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Accent.style() },
        )
}
