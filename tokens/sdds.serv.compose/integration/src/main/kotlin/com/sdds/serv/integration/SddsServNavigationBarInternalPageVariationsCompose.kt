// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.navigationbar.HasBackground
import com.sdds.serv.styles.navigationbar.NavigationBarInternalPage
import com.sdds.serv.styles.navigationbar.NoBackground
import com.sdds.serv.styles.navigationbar.Rounded
import com.sdds.serv.styles.navigationbar.Shadow

internal object SddsServNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<NavigationBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<NavigationBarStyle>> =
        mapOf(
            "NoBackground" to ComposeStyleReference { NavigationBarInternalPage.NoBackground.style() },
            "NoBackground.Rounded" to ComposeStyleReference { NavigationBarInternalPage.NoBackground.Rounded.style() },
            "HasBackground" to ComposeStyleReference { NavigationBarInternalPage.HasBackground.style() },
            "HasBackground.Rounded" to ComposeStyleReference { NavigationBarInternalPage.HasBackground.Rounded.style() },
            "HasBackground.Shadow" to ComposeStyleReference { NavigationBarInternalPage.HasBackground.Shadow.style() },
            "HasBackground.Shadow.Rounded" to ComposeStyleReference {
                NavigationBarInternalPage.HasBackground.Shadow.Rounded.style()
            },
        )
}
