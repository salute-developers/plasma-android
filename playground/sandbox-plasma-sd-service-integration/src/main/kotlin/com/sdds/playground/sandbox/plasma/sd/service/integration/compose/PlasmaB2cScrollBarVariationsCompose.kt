package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.scrollbar.M
import com.sdds.plasma.sd.service.styles.scrollbar.S
import com.sdds.plasma.sd.service.styles.scrollbar.ScrollBar
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cScrollBarVariationsCompose : ComposeStyleProvider<String, ScrollBarStyle>() {
    override val variations: Map<String, @Composable () -> ScrollBarStyle> =
        mapOf(
            "S" to { ScrollBar.S.style() },
            "M" to { ScrollBar.M.style() },
        )
}
