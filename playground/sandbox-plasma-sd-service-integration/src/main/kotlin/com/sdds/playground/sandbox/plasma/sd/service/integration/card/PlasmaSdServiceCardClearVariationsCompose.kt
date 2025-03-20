package com.sdds.playground.sandbox.plasma.sd.service.integration.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.card.CardClear
import com.sdds.plasma.sd.service.styles.card.L
import com.sdds.plasma.sd.service.styles.card.M
import com.sdds.plasma.sd.service.styles.card.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceCardClearVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "ClearL" to { CardClear.L.style() },
            "ClearM" to { CardClear.M.style() },
            "ClearS" to { CardClear.S.style() },
        )
}
