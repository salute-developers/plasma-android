// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.card.CardClear
import com.sdds.plasma.giga.styles.card.L
import com.sdds.plasma.giga.styles.card.M
import com.sdds.plasma.giga.styles.card.S

internal object PlasmaGigaCardClearVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CardClear.L.style() },
            "M" to ComposeStyleReference { CardClear.M.style() },
            "S" to ComposeStyleReference { CardClear.S.style() },
        )
}
