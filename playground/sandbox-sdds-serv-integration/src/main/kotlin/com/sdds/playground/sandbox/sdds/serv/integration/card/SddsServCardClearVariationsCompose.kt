package com.sdds.playground.sandbox.sdds.serv.integration.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.card.CardClear
import com.sdds.serv.styles.card.L
import com.sdds.serv.styles.card.M
import com.sdds.serv.styles.card.S

internal object SddsServCardClearVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "ClearL" to { CardClear.L.style() },
            "ClearM" to { CardClear.M.style() },
            "ClearS" to { CardClear.S.style() },
        )
}
