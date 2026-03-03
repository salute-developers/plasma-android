package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.toolbar.HasShadow
import com.sdds.plasma.sd.service.styles.toolbar.L
import com.sdds.plasma.sd.service.styles.toolbar.M
import com.sdds.plasma.sd.service.styles.toolbar.S
import com.sdds.plasma.sd.service.styles.toolbar.ToolBarVertical
import com.sdds.plasma.sd.service.styles.toolbar.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cToolBarVerticalVariationsCompose : ComposeStyleProvider<String, ToolBarStyle>() {
    override val variations: Map<String, @Composable () -> ToolBarStyle> =
        mapOf(
            "L" to { ToolBarVertical.L.style() },
            "L.HasShadow" to { ToolBarVertical.L.HasShadow.style() },
            "M" to { ToolBarVertical.M.style() },
            "M.HasShadow" to { ToolBarVertical.M.HasShadow.style() },
            "S" to { ToolBarVertical.S.style() },
            "S.HasShadow" to { ToolBarVertical.S.HasShadow.style() },
            "Xs" to { ToolBarVertical.Xs.style() },
            "Xs.HasShadow" to { ToolBarVertical.Xs.HasShadow.style() },
        )
}
