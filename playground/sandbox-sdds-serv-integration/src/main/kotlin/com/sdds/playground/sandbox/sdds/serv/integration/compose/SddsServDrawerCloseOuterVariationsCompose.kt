package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.drawer.DrawerCloseOuter
import com.sdds.serv.styles.drawer.HasShadow
import com.sdds.serv.styles.drawer.M

internal object SddsServDrawerCloseOuterVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "M" to { DrawerCloseOuter.M.style() },
            "M.HasShadow" to { DrawerCloseOuter.M.HasShadow.style() },
        )
}
