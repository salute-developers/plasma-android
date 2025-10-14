package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.listitem.L
import com.sdds.plasma.giga.styles.listitem.ListItemTight
import com.sdds.plasma.giga.styles.listitem.M
import com.sdds.plasma.giga.styles.listitem.S
import com.sdds.plasma.giga.styles.listitem.Xl
import com.sdds.plasma.giga.styles.listitem.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaListItemTightVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl" to { ListItemTight.Xl.style() },
            "L" to { ListItemTight.L.style() },
            "M" to { ListItemTight.M.style() },
            "S" to { ListItemTight.S.style() },
            "Xs" to { ListItemTight.Xs.style() },
        )
}
