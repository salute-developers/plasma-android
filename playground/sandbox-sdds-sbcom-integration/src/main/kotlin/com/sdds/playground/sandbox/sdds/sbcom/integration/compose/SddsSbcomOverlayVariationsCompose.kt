package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.overlay.Default
import com.sdds.sbcom.styles.overlay.Overlay

internal object SddsSbcomOverlayVariationsCompose : ComposeStyleProvider<String, OverlayStyle>() {
    override val variations: Map<String, @Composable () -> OverlayStyle> =
        mapOf(
            "Default" to { Overlay.Default.style() },
        )
}
