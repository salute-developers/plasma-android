package com.sdds.playground.sandbox.sdds.serv.integration.scrollbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.scrollbar.M
import com.sdds.serv.styles.scrollbar.S
import com.sdds.serv.styles.scrollbar.ScrollBar

internal object SddsServScrollBarVariationsCompose :
    ComposeStyleProvider<String, ScrollBarStyle>() {
    override val variations: Map<String, @Composable () -> ScrollBarStyle> =
        mapOf(
            "S" to { ScrollBar.S.style() },
            "M" to { ScrollBar.M.style() },
        )
}
