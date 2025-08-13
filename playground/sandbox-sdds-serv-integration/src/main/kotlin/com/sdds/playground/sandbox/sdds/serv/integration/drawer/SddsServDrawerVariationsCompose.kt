package com.sdds.playground.sandbox.sdds.serv.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.drawer.Drawer
import com.sdds.serv.styles.drawer.HasShadow
import com.sdds.serv.styles.drawer.NoShadow

internal object SddsServDrawerVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "NoShadow" to { Drawer.NoShadow.style() },
            "HasShadow" to { Drawer.HasShadow.style() },
        )
}
