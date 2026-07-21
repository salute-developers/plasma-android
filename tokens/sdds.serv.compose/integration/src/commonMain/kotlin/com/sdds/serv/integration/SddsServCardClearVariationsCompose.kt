// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.card.CardClear
import com.sdds.serv.styles.card.CardClearSize
import com.sdds.serv.styles.card.CardStyles
import com.sdds.serv.styles.card.L
import com.sdds.serv.styles.card.M
import com.sdds.serv.styles.card.S
import com.sdds.serv.styles.card.resolve

internal object SddsServCardClearVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "CardClear.L" to ComposeStyleReference { CardClear.L.style() },
            "CardClear.M" to ComposeStyleReference { CardClear.M.style() },
            "CardClear.S" to ComposeStyleReference { CardClear.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CardStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CardClearSize.L
                "M" -> CardClearSize.M
                "S" -> CardClearSize.S
                else -> CardClearSize.L
            },
        ).key
    }
}
