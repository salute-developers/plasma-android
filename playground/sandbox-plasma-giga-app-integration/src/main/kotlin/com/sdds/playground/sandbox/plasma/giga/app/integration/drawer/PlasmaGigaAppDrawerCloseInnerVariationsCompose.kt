package com.sdds.playground.sandbox.plasma.giga.app.integration.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.drawer.DrawerCloseInner
import com.sdds.plasma.giga.app.styles.drawer.HasShadow
import com.sdds.plasma.giga.app.styles.drawer.M
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppDrawerCloseInnerVariationsCompose : ComposeStyleProvider<String, DrawerStyle>() {
    override val variations: Map<String, @Composable () -> DrawerStyle> =
        mapOf(
            "M" to { DrawerCloseInner.M.style() },
            "M.HasShadow" to { DrawerCloseInner.M.HasShadow.style() },
        )
}
