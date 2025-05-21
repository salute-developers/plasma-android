package com.sdds.playground.sandbox.sdds.serv.integration.overlay.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.overlay.Default
import com.sdds.serv.styles.overlay.Overlay

internal object SddsServOverlayVariationsCompose : ComposeStyleProvider<String, OverlayStyle>() {
    override val variations: Map<String, @Composable () -> OverlayStyle> =
        mapOf(
            "Default" to { Overlay.Default.style() },
        )
}
