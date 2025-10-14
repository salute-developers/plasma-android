package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.listitem.L
import com.sdds.stylessalute.styles.listitem.ListItemNormal
import com.sdds.stylessalute.styles.listitem.M
import com.sdds.stylessalute.styles.listitem.S
import com.sdds.stylessalute.styles.listitem.Xl
import com.sdds.stylessalute.styles.listitem.Xs

internal object StylesSaluteListItemNormalVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl" to { ListItemNormal.Xl.style() },
            "L" to { ListItemNormal.L.style() },
            "M" to { ListItemNormal.M.style() },
            "S" to { ListItemNormal.S.style() },
            "Xs" to { ListItemNormal.Xs.style() },
        )
}
