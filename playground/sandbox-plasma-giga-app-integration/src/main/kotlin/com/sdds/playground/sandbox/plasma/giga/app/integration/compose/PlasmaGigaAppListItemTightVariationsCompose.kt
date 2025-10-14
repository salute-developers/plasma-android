package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.listitem.L
import com.sdds.plasma.giga.app.styles.listitem.ListItemTight
import com.sdds.plasma.giga.app.styles.listitem.M
import com.sdds.plasma.giga.app.styles.listitem.S
import com.sdds.plasma.giga.app.styles.listitem.Xl
import com.sdds.plasma.giga.app.styles.listitem.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppListItemTightVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl" to { ListItemTight.Xl.style() },
            "L" to { ListItemTight.L.style() },
            "M" to { ListItemTight.M.style() },
            "S" to { ListItemTight.S.style() },
            "Xs" to { ListItemTight.Xs.style() },
        )
}
