@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
)

package com.sdds.plasma.homeds.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.numberedcard.CardWithNumbersStyle
import com.sdds.plasma.homeds.styles.customcomponents.numberedcard.CardWithNumbers
import com.sdds.plasma.homeds.styles.customcomponents.numberedcard.HasInnerPaddings
import com.sdds.plasma.homeds.styles.customcomponents.numberedcard.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.numberedcard.L
import com.sdds.plasma.homeds.styles.customcomponents.numberedcard.M

object PlasmaHomedsCardWithNumbersVariationsCompose : ComposeStyleProvider<CardWithNumbersStyle>() {
    override val variations: Map<String, ComposeStyleReference<CardWithNumbersStyle>> =
        mapOf(
            "CardWithNumbers.M" to ComposeStyleReference { CardWithNumbers.M.style() },
            "CardWithNumbers.L" to ComposeStyleReference { CardWithNumbers.L.style() },
            "CardWithNumbersM.HasInnerPaddings" to ComposeStyleReference { CardWithNumbers.M.HasInnerPaddings.style() },
            "CardWithNumbersL.HasInnerPaddings" to ComposeStyleReference { CardWithNumbers.L.HasInnerPaddings.style() },
            "CardWithNumbers.M.Humidity" to ComposeStyleReference { CardWithNumbers.M.Humidity.style() },
            "CardWithNumbers.L.Humidity" to ComposeStyleReference { CardWithNumbers.L.Humidity.style() },
            "CardWithNumbersMHumidity.HasInnerPaddings" to ComposeStyleReference {
                CardWithNumbers.M.Humidity.HasInnerPaddings.style()
            },
            "CardWithNumbersLHumidity.HasInnerPaddings" to ComposeStyleReference {
                CardWithNumbers.L.Humidity.HasInnerPaddings.style()
            },
        )
}
