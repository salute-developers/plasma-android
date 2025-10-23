package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.navigationbar.HasBackground
import com.sdds.serv.styles.navigationbar.NavigationBarInternalPage
import com.sdds.serv.styles.navigationbar.NoBackground
import com.sdds.serv.styles.navigationbar.Rounded
import com.sdds.serv.styles.navigationbar.Shadow

internal object SddsServNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<String, NavigationBarStyle>() {
    override val variations: Map<String, @Composable () -> NavigationBarStyle> =
        mapOf(
            "NoBackground" to { NavigationBarInternalPage.NoBackground.style() },
            "NoBackground.Rounded" to { NavigationBarInternalPage.NoBackground.Rounded.style() },
            "HasBackground" to { NavigationBarInternalPage.HasBackground.style() },
            "HasBackground.Rounded" to { NavigationBarInternalPage.HasBackground.Rounded.style() },
            "HasBackground.Shadow" to { NavigationBarInternalPage.HasBackground.Shadow.style() },
            "HasBackground.Shadow.Rounded" to { NavigationBarInternalPage.HasBackground.Shadow.Rounded.style() },
        )
}
