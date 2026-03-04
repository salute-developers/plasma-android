package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.S
import com.sdds.serv.styles.select.SelectMultipleTight
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs

internal object SddsServSelectMultipleTightVariationsCompose : ComposeStyleProvider<String, SelectStyle>() {
    override val variations: Map<String, @Composable () -> SelectStyle> =
        mapOf(
            "Xl" to { SelectMultipleTight.Xl.style() },
            "L" to { SelectMultipleTight.L.style() },
            "M" to { SelectMultipleTight.M.style() },
            "S" to { SelectMultipleTight.S.style() },
            "Xs" to { SelectMultipleTight.Xs.style() },
        )
}
