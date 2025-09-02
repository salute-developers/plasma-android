package com.sdds.playground.sandbox.plasma.giga.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.giga.styles.drawer.HasShadow
import com.sdds.plasma.giga.styles.drawer.M
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaDrawerCloseOuterVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "M" to { DrawerCloseOuter.M.style() },
            "M.HasShadow" to { DrawerCloseOuter.M.HasShadow.style() },
        )
}
