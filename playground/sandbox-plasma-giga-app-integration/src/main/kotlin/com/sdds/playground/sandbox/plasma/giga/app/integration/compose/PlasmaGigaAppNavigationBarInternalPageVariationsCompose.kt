package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.navigationbar.HasBackground
import com.sdds.plasma.giga.app.styles.navigationbar.NavigationBarInternalPage
import com.sdds.plasma.giga.app.styles.navigationbar.NoBackground
import com.sdds.plasma.giga.app.styles.navigationbar.Rounded
import com.sdds.plasma.giga.app.styles.navigationbar.Shadow
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<String, NavigationBarStyle>() {
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
