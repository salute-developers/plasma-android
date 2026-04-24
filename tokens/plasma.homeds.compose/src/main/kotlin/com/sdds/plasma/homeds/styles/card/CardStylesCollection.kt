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
import kotlin.Boolean
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
    ;

    /**
     * Typed API для подбора стиля card
     */
    public companion object
}

/**
 * Возможные значения свойства size для card
 */
public enum class CardSize {
    Xl,
    L,
    M,
    S,
}

/**
 * Возвращает [CardStyle] для [CardStyles]
 */
@Composable
public fun CardStyles.style(modify: @Composable CardStyleBuilder.() -> Unit = {}): CardStyle {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CardStyles] для card
 */
public fun CardStyles.Companion.resolve(
    size: CardSize = CardSize.Xl,
    hasInnerPaddings: Boolean =
        false,
): CardStyles = when {
    size == CardSize.Xl && hasInnerPaddings == true -> CardStyles.CardXlHasInnerPaddings
    size == CardSize.L && hasInnerPaddings == true -> CardStyles.CardLHasInnerPaddings
    size == CardSize.M && hasInnerPaddings == true -> CardStyles.CardMHasInnerPaddings
    size == CardSize.S && hasInnerPaddings == true -> CardStyles.CardSHasInnerPaddings
    size == CardSize.Xl -> CardStyles.CardXl
    size == CardSize.L -> CardStyles.CardL
    size == CardSize.M -> CardStyles.CardM
    size == CardSize.S -> CardStyles.CardS
    else -> error("Unsupported card style combination")
}

/**
 * Возвращает [CardStyle] для card
 */
@Composable
public fun CardStyles.Companion.style(
    size: CardSize = CardSize.Xl,
    hasInnerPaddings: Boolean = false,
    modify: @Composable CardStyleBuilder.() -> Unit = {},
): CardStyle = resolve(size, hasInnerPaddings).style(modify)
