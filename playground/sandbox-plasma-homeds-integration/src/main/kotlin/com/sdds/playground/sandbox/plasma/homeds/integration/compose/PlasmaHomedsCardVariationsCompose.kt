package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.HasInnerPaddings
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.card.S
import com.sdds.plasma.homeds.styles.card.Xl
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsCardVariationsCompose : ComposeStyleProvider<String, CardStyle>() {
    override val variations: Map<String, @Composable () -> CardStyle> =
        mapOf(
            "Xl" to { Card.Xl.style() },
            "Xl.HasInnerPaddings" to { Card.Xl.HasInnerPaddings.style() },
            "L" to { Card.L.style() },
            "L.HasInnerPaddings" to { Card.L.HasInnerPaddings.style() },
            "M" to { Card.M.style() },
            "M.HasInnerPaddings" to { Card.M.HasInnerPaddings.style() },
            "S" to { Card.S.style() },
            "S.HasInnerPaddings" to { Card.S.HasInnerPaddings.style() },
        )
}
