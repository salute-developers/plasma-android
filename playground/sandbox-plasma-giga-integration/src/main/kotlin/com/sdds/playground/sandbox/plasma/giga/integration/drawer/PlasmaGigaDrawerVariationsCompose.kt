package com.sdds.playground.sandbox.plasma.giga.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.drawer.Drawer
import com.sdds.plasma.giga.styles.drawer.HasShadow
import com.sdds.plasma.giga.styles.drawer.NoShadow
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaDrawerVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "NoShadow" to { Drawer.NoShadow.style() },
            "HasShadow" to { Drawer.HasShadow.style() },
        )
}
