package com.sdds.playground.sandbox.plasma.giga.integration.overlay.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.overlay.Default
import com.sdds.plasma.giga.styles.overlay.Overlay
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaOverlayVariationsCompose :
    ComposeStyleProvider<String, OverlayStyle>() {
    override val variations: Map<String, @Composable () -> OverlayStyle> =
        mapOf(
            "Default" to { Overlay.Default.style() },
        )
}
