package com.sdds.playground.sandbox.sdds.serv.integration.divider.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.divider.Default
import com.sdds.serv.styles.divider.Divider

internal object SddsServDividerVariationsCompose : ComposeStyleProvider<String, DividerStyle>() {
    override val variations: Map<String, @Composable () -> DividerStyle> =
        mapOf(
            "Default" to { Divider.Default.style() },
        )
}
