package com.sdds.playground.sandbox.plasma.giga.app.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.drawer.Drawer
import com.sdds.plasma.giga.app.styles.drawer.HasShadow
import com.sdds.plasma.giga.app.styles.drawer.NoShadow
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppDrawerVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "NoShadow" to { Drawer.NoShadow.style() },
            "HasShadow" to { Drawer.HasShadow.style() },
        )
}
