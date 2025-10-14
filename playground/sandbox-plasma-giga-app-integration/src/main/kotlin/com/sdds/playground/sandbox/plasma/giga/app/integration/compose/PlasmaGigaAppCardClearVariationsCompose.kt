package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.card.CardClear
import com.sdds.plasma.giga.app.styles.card.L
import com.sdds.plasma.giga.app.styles.card.M
import com.sdds.plasma.giga.app.styles.card.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppCardClearVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "L" to { CardClear.L.style() },
            "M" to { CardClear.M.style() },
            "S" to { CardClear.S.style() },
        )
}
