// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.navigationbar.Default
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarMainPage

internal object PlasmaHomedsNavigationBarMainPageVariationsCompose : ComposeStyleProvider<NavigationBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<NavigationBarStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { NavigationBarMainPage.Default.style() },
        )
}
