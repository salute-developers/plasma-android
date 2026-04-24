// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.navigationbar.Default
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarInternalPage

internal object PlasmaHomedsNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<NavigationBarStyle>() {

    override val variations: Map<String, ComposeStyleReference<NavigationBarStyle>> =
        mapOf(
            "NavigationBarInternalPage.Default" to ComposeStyleReference { NavigationBarInternalPage.Default.style() },
        )
}
