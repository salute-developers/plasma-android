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
import com.sdds.compose.uikit.NavigationDrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.navigationdrawer.Default
import com.sdds.sbcom.styles.navigationdrawer.NavigationDrawer

internal object SddsSbcomNavigationDrawerVariationsCompose : ComposeStyleProvider<NavigationDrawerStyle>() {

    override val variations: Map<String, ComposeStyleReference<NavigationDrawerStyle>> =
        mapOf(
            "NavigationDrawer.Default" to ComposeStyleReference { NavigationDrawer.Default.style() },
        )
}
