package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.navigationbar.HasBackground
import com.sdds.plasma.sd.service.styles.navigationbar.NavigationBarMainPage
import com.sdds.plasma.sd.service.styles.navigationbar.NoBackground
import com.sdds.plasma.sd.service.styles.navigationbar.Rounded
import com.sdds.plasma.sd.service.styles.navigationbar.Shadow
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cNavigationBarMainPageVariationsCompose : ComposeStyleProvider<String, NavigationBarStyle>() {
    override val variations: Map<String, @Composable () -> NavigationBarStyle> =
        mapOf(
            "NoBackground" to { NavigationBarMainPage.NoBackground.style() },
            "NoBackground.Rounded" to { NavigationBarMainPage.NoBackground.Rounded.style() },
            "HasBackground" to { NavigationBarMainPage.HasBackground.style() },
            "HasBackground.Rounded" to { NavigationBarMainPage.HasBackground.Rounded.style() },
            "HasBackground.Shadow" to { NavigationBarMainPage.HasBackground.Shadow.style() },
            "HasBackground.Shadow.Rounded" to { NavigationBarMainPage.HasBackground.Shadow.Rounded.style() },
        )
}
