package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.Default
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsCollapsingNavigationBarMainPageVariationsCompose : ComposeStyleProvider<String, CollapsingNavigationBarStyle>() {
    override val variations: Map<String, @Composable () -> CollapsingNavigationBarStyle> =
        mapOf(
            "Default" to { CollapsingNavigationBarMainPage.Default.style() },
        )
}
