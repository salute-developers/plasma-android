// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.CardSize
import com.sdds.plasma.homeds.styles.card.CardStyles
import com.sdds.plasma.homeds.styles.card.HasInnerPaddings
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.card.S
import com.sdds.plasma.homeds.styles.card.Xl
import com.sdds.plasma.homeds.styles.card.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsCardVariationsCompose : ComposeStyleProvider<CardStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S")),
            Property.BooleanProperty(name = "hasInnerPaddings", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<CardStyle>> =
        mapOf(
            "Card.Xl" to ComposeStyleReference { Card.Xl.style() },
            "Card.Xl.HasInnerPaddings" to ComposeStyleReference { Card.Xl.HasInnerPaddings.style() },
            "Card.L" to ComposeStyleReference { Card.L.style() },
            "Card.L.HasInnerPaddings" to ComposeStyleReference { Card.L.HasInnerPaddings.style() },
            "Card.M" to ComposeStyleReference { Card.M.style() },
            "Card.M.HasInnerPaddings" to ComposeStyleReference { Card.M.HasInnerPaddings.style() },
            "Card.S" to ComposeStyleReference { Card.S.style() },
            "Card.S.HasInnerPaddings" to ComposeStyleReference { Card.S.HasInnerPaddings.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CardStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> CardSize.Xl
                "L" -> CardSize.L
                "M" -> CardSize.M
                "S" -> CardSize.S
                else -> CardSize.Xl
            },
            hasInnerPaddings = booleanBindingValue(bindings, "hasInnerPaddings", false),
        ).key
    }
}
