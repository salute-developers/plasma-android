package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemMultiple
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs

internal object SddsServSelectItemMultipleVariationsCompose : ComposeStyleProvider<String, SelectItemStyle>() {
    override val variations: Map<String, @Composable () -> SelectItemStyle> =
        mapOf(
            "Xl" to { SelectItemMultiple.Xl.style() },
            "L" to { SelectItemMultiple.L.style() },
            "M" to { SelectItemMultiple.M.style() },
            "S" to { SelectItemMultiple.S.style() },
            "Xs" to { SelectItemMultiple.Xs.style() },
        )
}
