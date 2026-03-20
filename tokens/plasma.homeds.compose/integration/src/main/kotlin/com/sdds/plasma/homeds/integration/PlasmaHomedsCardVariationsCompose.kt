// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.HasInnerPaddings
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.card.S
import com.sdds.plasma.homeds.styles.card.Xl

internal object PlasmaHomedsCardVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { Card.Xl.style() },
            "Xl.HasInnerPaddings" to ComposeStyleReference { Card.Xl.HasInnerPaddings.style() },
            "L" to ComposeStyleReference { Card.L.style() },
            "L.HasInnerPaddings" to ComposeStyleReference { Card.L.HasInnerPaddings.style() },
            "M" to ComposeStyleReference { Card.M.style() },
            "M.HasInnerPaddings" to ComposeStyleReference { Card.M.HasInnerPaddings.style() },
            "S" to ComposeStyleReference { Card.S.style() },
            "S.HasInnerPaddings" to ComposeStyleReference { Card.S.HasInnerPaddings.style() },
        )
}
