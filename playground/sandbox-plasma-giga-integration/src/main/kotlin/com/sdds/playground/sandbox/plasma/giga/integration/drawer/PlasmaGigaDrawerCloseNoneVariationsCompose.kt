package com.sdds.playground.sandbox.plasma.giga.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.drawer.DrawerCloseNone
import com.sdds.plasma.giga.styles.drawer.HasShadow
import com.sdds.plasma.giga.styles.drawer.M
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaDrawerCloseNoneVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "M" to { DrawerCloseNone.M.style() },
            "M.HasShadow" to { DrawerCloseNone.M.HasShadow.style() },
        )
}
