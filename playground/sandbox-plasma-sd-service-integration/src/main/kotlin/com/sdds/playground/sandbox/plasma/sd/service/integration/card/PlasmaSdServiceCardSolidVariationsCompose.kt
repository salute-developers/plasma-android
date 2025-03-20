package com.sdds.playground.sandbox.plasma.sd.service.integration.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.card.CardSolid
import com.sdds.plasma.sd.service.styles.card.L
import com.sdds.plasma.sd.service.styles.card.M
import com.sdds.plasma.sd.service.styles.card.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceCardSolidVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "SolidL" to { CardSolid.L.style() },
            "SolidM" to { CardSolid.M.style() },
            "SolidS" to { CardSolid.S.style() },
        )
}
