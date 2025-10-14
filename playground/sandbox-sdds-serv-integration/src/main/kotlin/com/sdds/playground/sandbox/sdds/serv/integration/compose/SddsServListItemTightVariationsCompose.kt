package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.listitem.L
import com.sdds.serv.styles.listitem.ListItemTight
import com.sdds.serv.styles.listitem.M
import com.sdds.serv.styles.listitem.S
import com.sdds.serv.styles.listitem.Xl
import com.sdds.serv.styles.listitem.Xs

internal object SddsServListItemTightVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl" to { ListItemTight.Xl.style() },
            "L" to { ListItemTight.L.style() },
            "M" to { ListItemTight.M.style() },
            "S" to { ListItemTight.S.style() },
            "Xs" to { ListItemTight.Xs.style() },
        )
}
