package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.toolbar.HasShadow
import com.sdds.serv.styles.toolbar.L
import com.sdds.serv.styles.toolbar.M
import com.sdds.serv.styles.toolbar.S
import com.sdds.serv.styles.toolbar.ToolBarHorizontal
import com.sdds.serv.styles.toolbar.Xs

internal object SddsServToolBarHorizontalVariationsCompose : ComposeStyleProvider<String, ToolBarStyle>() {
    override val variations: Map<String, @Composable () -> ToolBarStyle> =
        mapOf(
            "L" to { ToolBarHorizontal.L.style() },
            "L.HasShadow" to { ToolBarHorizontal.L.HasShadow.style() },
            "M" to { ToolBarHorizontal.M.style() },
            "M.HasShadow" to { ToolBarHorizontal.M.HasShadow.style() },
            "S" to { ToolBarHorizontal.S.style() },
            "S.HasShadow" to { ToolBarHorizontal.S.HasShadow.style() },
            "Xs" to { ToolBarHorizontal.Xs.style() },
            "Xs.HasShadow" to { ToolBarHorizontal.Xs.HasShadow.style() },
        )
}
