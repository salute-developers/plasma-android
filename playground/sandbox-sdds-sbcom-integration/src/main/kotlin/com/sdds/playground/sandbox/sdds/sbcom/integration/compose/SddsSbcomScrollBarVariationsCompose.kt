package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.scrollbar.Default
import com.sdds.sbcom.styles.scrollbar.ScrollBar

internal object SddsSbcomScrollBarVariationsCompose : ComposeStyleProvider<String, ScrollBarStyle>() {
    override val variations: Map<String, @Composable () -> ScrollBarStyle> =
        mapOf(
            "Default" to { ScrollBar.Default.style() },
        )
}
