package com.sdds.playground.sandbox.plasma.sd.service.integration.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardClear
import com.sdds.compose.uikit.CardSolid
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.card.L
import com.sdds.plasma.sd.service.styles.card.M
import com.sdds.plasma.sd.service.styles.card.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceCardVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "LClear" to { CardClear.L.style() },
            "MClear" to { CardClear.M.style() },
            "SClear" to { CardClear.S.style() },

            "LSolid" to { CardSolid.L.style() },
            "MSolid" to { CardSolid.M.style() },
            "SSolid" to { CardSolid.S.style() },
        )
}
