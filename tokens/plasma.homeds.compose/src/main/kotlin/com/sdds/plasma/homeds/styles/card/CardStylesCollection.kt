// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CardStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Card
 */
public enum class CardStyles(
    public val key: String,
) {
    CardXl("Card.Xl"),
    CardXlHasInnerPaddings("Card.Xl.HasInnerPaddings"),
    CardL("Card.L"),
    CardLHasInnerPaddings("Card.L.HasInnerPaddings"),
    CardM("Card.M"),
    CardMHasInnerPaddings("Card.M.HasInnerPaddings"),
    CardS("Card.S"),
    CardSHasInnerPaddings("Card.S.HasInnerPaddings"),
}

/**
 * Возвращает [CardStyle] для [CardStyles]
 */
@Composable
public fun CardStyles.style(modifyAction: @Composable CardStyleBuilder.() -> Unit = {}): CardStyle {
    val builder = when (this) {
        CardStyles.CardXl -> Card.Xl
        CardStyles.CardXlHasInnerPaddings -> Card.Xl.HasInnerPaddings
        CardStyles.CardL -> Card.L
        CardStyles.CardLHasInnerPaddings -> Card.L.HasInnerPaddings
        CardStyles.CardM -> Card.M
        CardStyles.CardMHasInnerPaddings -> Card.M.HasInnerPaddings
        CardStyles.CardS -> Card.S
        CardStyles.CardSHasInnerPaddings -> Card.S.HasInnerPaddings
    }
    return builder.modify(modifyAction).style()
}
