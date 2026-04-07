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
import com.sdds.serv.styles.card.CardClear
import com.sdds.serv.styles.card.L
import com.sdds.serv.styles.card.M
import com.sdds.serv.styles.card.S

internal object SddsServCardClearVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CardClear.L.style() },
            "M" to ComposeStyleReference { CardClear.M.style() },
            "S" to ComposeStyleReference { CardClear.S.style() },
        )
}
