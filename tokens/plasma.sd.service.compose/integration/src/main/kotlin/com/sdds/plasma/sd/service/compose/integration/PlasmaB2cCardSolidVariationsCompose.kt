// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.card.CardSolid
import com.sdds.plasma.sd.service.styles.card.L
import com.sdds.plasma.sd.service.styles.card.M
import com.sdds.plasma.sd.service.styles.card.S

internal object PlasmaB2cCardSolidVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CardSolid.L.style() },
            "M" to ComposeStyleReference { CardSolid.M.style() },
            "S" to ComposeStyleReference { CardSolid.S.style() },
        )
}
