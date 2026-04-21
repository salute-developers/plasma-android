// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.tabbaritem.Default
import com.sdds.sbcom.styles.tabbaritem.TabBarItem

internal object SddsSbcomTabBarItemVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {

    override val variations: Map<String, ComposeStyleReference<TabBarItemStyle>> =
        mapOf(
            "TabBarItem.Default" to ComposeStyleReference { TabBarItem.Default.style() },
        )
}
