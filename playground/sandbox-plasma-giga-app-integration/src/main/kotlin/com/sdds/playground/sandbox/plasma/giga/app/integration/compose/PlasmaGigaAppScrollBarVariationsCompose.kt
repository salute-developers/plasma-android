package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.scrollbar.M
import com.sdds.plasma.giga.app.styles.scrollbar.S
import com.sdds.plasma.giga.app.styles.scrollbar.ScrollBar
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppScrollBarVariationsCompose : ComposeStyleProvider<String, ScrollBarStyle>() {
    override val variations: Map<String, @Composable () -> ScrollBarStyle> =
        mapOf(
            "S" to { ScrollBar.S.style() },
            "M" to { ScrollBar.M.style() },
        )
}
