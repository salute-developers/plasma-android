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
import com.sdds.serv.styles.navigationbar.NavigationBarMainPage
import com.sdds.serv.styles.navigationbar.NoBackground
import com.sdds.serv.styles.navigationbar.Rounded
import com.sdds.serv.styles.navigationbar.Shadow

internal object SddsServNavigationBarMainPageVariationsCompose : ComposeStyleProvider<NavigationBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<NavigationBarStyle>> =
        mapOf(
            "NoBackground" to ComposeStyleReference { NavigationBarMainPage.NoBackground.style() },
            "NoBackground.Rounded" to ComposeStyleReference { NavigationBarMainPage.NoBackground.Rounded.style() },
            "HasBackground" to ComposeStyleReference { NavigationBarMainPage.HasBackground.style() },
            "HasBackground.Rounded" to ComposeStyleReference { NavigationBarMainPage.HasBackground.Rounded.style() },
            "HasBackground.Shadow" to ComposeStyleReference { NavigationBarMainPage.HasBackground.Shadow.style() },
            "HasBackground.Shadow.Rounded" to ComposeStyleReference { NavigationBarMainPage.HasBackground.Shadow.Rounded.style() },
        )
}
