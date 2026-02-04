package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.navigationbar.Default
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarMainPage
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsNavigationBarMainPageVariationsCompose : ComposeStyleProvider<String, NavigationBarStyle>() {
    override val variations: Map<String, @Composable () -> NavigationBarStyle> =
        mapOf(
            "Default" to { NavigationBarMainPage.Default.style() },
        )
}
