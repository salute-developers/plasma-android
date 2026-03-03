package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.toolbar.HasShadow
import com.sdds.serv.styles.toolbar.L
import com.sdds.serv.styles.toolbar.M
import com.sdds.serv.styles.toolbar.S
import com.sdds.serv.styles.toolbar.ToolBarVertical
import com.sdds.serv.styles.toolbar.Xs

internal object SddsServToolBarVerticalVariationsCompose : ComposeStyleProvider<String, ToolBarStyle>() {
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
