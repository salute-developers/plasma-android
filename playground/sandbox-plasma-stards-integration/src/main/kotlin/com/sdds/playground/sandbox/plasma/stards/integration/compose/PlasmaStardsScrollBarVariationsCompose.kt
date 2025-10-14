package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.scrollbar.M
import com.sdkit.star.designsystem.styles.scrollbar.S
import com.sdkit.star.designsystem.styles.scrollbar.ScrollBar

internal object PlasmaStardsScrollBarVariationsCompose : ComposeStyleProvider<String, ScrollBarStyle>() {
    override val variations: Map<String, @Composable () -> ScrollBarStyle> =
        mapOf(
            "S" to { ScrollBar.S.style() },
            "M" to { ScrollBar.M.style() },
        )
}
