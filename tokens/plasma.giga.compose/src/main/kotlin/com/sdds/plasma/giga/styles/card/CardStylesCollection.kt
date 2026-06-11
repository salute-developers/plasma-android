// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.card

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
    CardSolidL("CardSolid.L"),
    CardSolidM("CardSolid.M"),
    CardSolidS("CardSolid.S"),
    CardClearL("CardClear.L"),
    CardClearM("CardClear.M"),
    CardClearS("CardClear.S"),
    ;

    /**
     * Typed API для подбора стиля card-solid
     */
    public object Solid

    /**
     * Typed API для подбора стиля card-clear
     */
    public object Clear
}

/**
 * Возможные значения свойства size для card-solid
 */
public enum class CardSolidSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства size для card-clear
 */
public enum class CardClearSize {
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
        CardStyles.CardSolidL -> CardSolid.L
        CardStyles.CardSolidM -> CardSolid.M
        CardStyles.CardSolidS -> CardSolid.S
        CardStyles.CardClearL -> CardClear.L
        CardStyles.CardClearM -> CardClear.M
        CardStyles.CardClearS -> CardClear.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CardStyles] для card-solid
 */
public fun CardStyles.Solid.resolve(size: CardSolidSize = CardSolidSize.L): CardStyles = when {
    size == CardSolidSize.L -> CardStyles.CardSolidL
    size == CardSolidSize.M -> CardStyles.CardSolidM
    size == CardSolidSize.S -> CardStyles.CardSolidS
    else -> error("Unsupported card-solid style combination")
}

/**
 * Возвращает [CardStyle] для card-solid
 */
@Composable
public fun CardStyles.Solid.style(
    size: CardSolidSize = CardSolidSize.L,
    modify: @Composable
    CardStyleBuilder.() -> Unit = {},
): CardStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [CardStyles] для card-clear
 */
public fun CardStyles.Clear.resolve(size: CardClearSize = CardClearSize.L): CardStyles = when {
    size == CardClearSize.L -> CardStyles.CardClearL
    size == CardClearSize.M -> CardStyles.CardClearM
    size == CardClearSize.S -> CardStyles.CardClearS
    else -> error("Unsupported card-clear style combination")
}

/**
 * Возвращает [CardStyle] для card-clear
 */
@Composable
public fun CardStyles.Clear.style(
    size: CardClearSize = CardClearSize.L,
    modify: @Composable
    CardStyleBuilder.() -> Unit = {},
): CardStyle = resolve(size).style(modify)
