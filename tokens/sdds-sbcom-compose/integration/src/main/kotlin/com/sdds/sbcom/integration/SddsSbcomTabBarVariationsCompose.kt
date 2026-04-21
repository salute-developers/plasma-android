// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.tabbar.Default
import com.sdds.sbcom.styles.tabbar.TabBar

internal object SddsSbcomTabBarVariationsCompose : ComposeStyleProvider<TabBarStyle>() {

    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "TabBar.Default" to ComposeStyleReference { TabBar.Default.style() },
        )
}
