// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.card.CardSolid
import com.sdds.plasma.giga.styles.card.CardSolidSize
import com.sdds.plasma.giga.styles.card.CardStyles
import com.sdds.plasma.giga.styles.card.L
import com.sdds.plasma.giga.styles.card.M
import com.sdds.plasma.giga.styles.card.S
import com.sdds.plasma.giga.styles.card.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaCardSolidVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "CardSolid.L" to ComposeStyleReference { CardSolid.L.style() },
            "CardSolid.M" to ComposeStyleReference { CardSolid.M.style() },
            "CardSolid.S" to ComposeStyleReference { CardSolid.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CardStyles.Solid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CardSolidSize.L
                "M" -> CardSolidSize.M
                "S" -> CardSolidSize.S
                else -> CardSolidSize.L
            },
        ).key
    }
}
