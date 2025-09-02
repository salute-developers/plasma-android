package com.sdds.playground.sandbox.plasma.sd.service.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.sd.service.styles.drawer.HasShadow
import com.sdds.plasma.sd.service.styles.drawer.M
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceDrawerCloseOuterVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "M" to { DrawerCloseOuter.M.style() },
            "M.HasShadow" to { DrawerCloseOuter.M.HasShadow.style() },
        )
}
