package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.S
import com.sdds.serv.styles.select.SelectSingleTight
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs

internal object SddsServSelectSingleTightVariationsCompose : ComposeStyleProvider<String, SelectStyle>() {
    override val variations: Map<String, @Composable () -> SelectStyle> =
        mapOf(
            "Xl" to { SelectSingleTight.Xl.style() },
            "L" to { SelectSingleTight.L.style() },
            "M" to { SelectSingleTight.M.style() },
            "S" to { SelectSingleTight.S.style() },
            "Xs" to { SelectSingleTight.Xs.style() },
        )
}
