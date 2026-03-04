package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemSingleTight
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs

internal object SddsServSelectItemSingleTightVariationsCompose : ComposeStyleProvider<String, SelectItemStyle>() {
    override val variations: Map<String, @Composable () -> SelectItemStyle> =
        mapOf(
            "Xl" to { SelectItemSingleTight.Xl.style() },
            "L" to { SelectItemSingleTight.L.style() },
            "M" to { SelectItemSingleTight.M.style() },
            "S" to { SelectItemSingleTight.S.style() },
            "Xs" to { SelectItemSingleTight.Xs.style() },
        )
}
