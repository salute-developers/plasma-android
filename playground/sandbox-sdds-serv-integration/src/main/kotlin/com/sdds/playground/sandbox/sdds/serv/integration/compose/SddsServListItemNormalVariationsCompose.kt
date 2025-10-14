package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.listitem.L
import com.sdds.serv.styles.listitem.ListItemNormal
import com.sdds.serv.styles.listitem.M
import com.sdds.serv.styles.listitem.S
import com.sdds.serv.styles.listitem.Xl
import com.sdds.serv.styles.listitem.Xs

internal object SddsServListItemNormalVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl" to { ListItemNormal.Xl.style() },
            "L" to { ListItemNormal.L.style() },
            "M" to { ListItemNormal.M.style() },
            "S" to { ListItemNormal.S.style() },
            "Xs" to { ListItemNormal.Xs.style() },
        )
}
