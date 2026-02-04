package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.overlay.Default
import com.sdds.plasma.homeds.styles.overlay.DirectionBottom
import com.sdds.plasma.homeds.styles.overlay.DirectionTop
import com.sdds.plasma.homeds.styles.overlay.Overlay
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsOverlayVariationsCompose : ComposeStyleProvider<String, OverlayStyle>() {
    override val variations: Map<String, @Composable () -> OverlayStyle> =
        mapOf(
            "Default" to { Overlay.Default.style() },
            "DirectionTop" to { Overlay.DirectionTop.style() },
            "DirectionBottom" to { Overlay.DirectionBottom.style() },
        )
}
