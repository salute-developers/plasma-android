// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.card.CardSolid
import com.sdds.serv.styles.card.L
import com.sdds.serv.styles.card.M
import com.sdds.serv.styles.card.S

internal object SddsServCardSolidVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CardSolid.L.style() },
            "M" to ComposeStyleReference { CardSolid.M.style() },
            "S" to ComposeStyleReference { CardSolid.S.style() },
        )
}
