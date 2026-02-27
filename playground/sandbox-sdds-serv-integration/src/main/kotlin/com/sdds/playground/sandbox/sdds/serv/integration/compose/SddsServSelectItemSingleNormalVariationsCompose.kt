package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemSingleNormal
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs

internal object SddsServSelectItemSingleNormalVariationsCompose : ComposeStyleProvider<String, SelectItemStyle>() {
    override val variations: Map<String, @Composable () -> SelectItemStyle> =
        mapOf(
            "Xl" to { SelectItemSingleNormal.Xl.style() },
            "L" to { SelectItemSingleNormal.L.style() },
            "M" to { SelectItemSingleNormal.M.style() },
            "S" to { SelectItemSingleNormal.S.style() },
            "Xs" to { SelectItemSingleNormal.Xs.style() },
        )
}
