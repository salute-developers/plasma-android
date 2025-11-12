package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.icontabitem.IconTabItem
import com.sdds.serv.styles.icontabitem.L
import com.sdds.serv.styles.icontabitem.M
import com.sdds.serv.styles.icontabitem.S
import com.sdds.serv.styles.icontabitem.Xs

internal object SddsServIconTabItemVariationsCompose : ComposeStyleProvider<String, TabItemStyle>() {
    override val variations: Map<String, @Composable () -> TabItemStyle> =
        mapOf(
            "L" to { IconTabItem.L.style() },
            "M" to { IconTabItem.M.style() },
            "S" to { IconTabItem.S.style() },
            "Xs" to { IconTabItem.Xs.style() },
        )
}
