package com.sdds.playground.sandbox.sdds.serv.integration.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.card.CardSolid
import com.sdds.serv.styles.card.L
import com.sdds.serv.styles.card.M
import com.sdds.serv.styles.card.S

internal object SddsServCardSolidVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "SolidL" to { CardSolid.L.style() },
            "SolidM" to { CardSolid.M.style() },
            "Solids" to { CardSolid.S.style() },
        )
}
