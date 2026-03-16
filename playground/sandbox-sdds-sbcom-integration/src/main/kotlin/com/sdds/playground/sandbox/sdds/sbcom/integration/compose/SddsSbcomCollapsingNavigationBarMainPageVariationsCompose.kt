package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.sbcom.styles.collapsingnavigationbar.Default

internal object SddsSbcomCollapsingNavigationBarMainPageVariationsCompose : ComposeStyleProvider<String, CollapsingNavigationBarStyle>() {
    override val variations: Map<String, @Composable () -> CollapsingNavigationBarStyle> =
        mapOf(
            "Default" to { CollapsingNavigationBarMainPage.Default.style() },
        )
}
