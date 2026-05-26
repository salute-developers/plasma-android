// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NavigationDrawerItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.navigationdraweritem.Default
import com.sdds.sbcom.styles.navigationdraweritem.NavigationDrawerItem

internal object SddsSbcomNavigationDrawerItemVariationsCompose : ComposeStyleProvider<NavigationDrawerItemStyle>() {

    override val variations: Map<String, ComposeStyleReference<NavigationDrawerItemStyle>> =
        mapOf(
            "NavigationDrawerItem.Default" to ComposeStyleReference { NavigationDrawerItem.Default.style() },
        )
}
