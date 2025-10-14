package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.card.CardSolid
import com.sdds.plasma.sd.service.styles.card.L
import com.sdds.plasma.sd.service.styles.card.M
import com.sdds.plasma.sd.service.styles.card.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cCardSolidVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "L" to { CardSolid.L.style() },
            "M" to { CardSolid.M.style() },
            "S" to { CardSolid.S.style() },
        )
}
