package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemSingle
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs

internal object SddsServSelectItemSingleVariationsCompose : ComposeStyleProvider<String, SelectItemStyle>() {
    override val variations: Map<String, @Composable () -> SelectItemStyle> =
        mapOf(
            "Xl" to { SelectItemSingle.Xl.style() },
            "L" to { SelectItemSingle.L.style() },
            "M" to { SelectItemSingle.M.style() },
            "S" to { SelectItemSingle.S.style() },
            "Xs" to { SelectItemSingle.Xs.style() },
        )
}
