// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.tabbaritem.Default
import com.sdds.plasma.homeds.styles.tabbaritem.TabBarItem

internal object PlasmaHomedsTabBarItemVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabBarItemStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { TabBarItem.Default.style() },
        )
}
