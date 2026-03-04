package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.S
import com.sdds.serv.styles.select.SelectMultipleNormal
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs

internal object SddsServSelectMultipleNormalVariationsCompose : ComposeStyleProvider<String, SelectStyle>() {
    override val variations: Map<String, @Composable () -> SelectStyle> =
        mapOf(
            "Xl" to { SelectMultipleNormal.Xl.style() },
            "L" to { SelectMultipleNormal.L.style() },
            "M" to { SelectMultipleNormal.M.style() },
            "S" to { SelectMultipleNormal.S.style() },
            "Xs" to { SelectMultipleNormal.Xs.style() },
        )
}
