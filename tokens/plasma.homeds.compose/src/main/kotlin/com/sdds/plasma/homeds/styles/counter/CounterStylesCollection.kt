// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.counter

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Counter
 */
public enum class CounterStyles(
    public val key: String,
) {
    CounterLDefault("Counter.L.Default"),
    CounterLSecondary("Counter.L.Secondary"),
    CounterLAccent("Counter.L.Accent"),
    CounterLPositive("Counter.L.Positive"),
    CounterLWarning("Counter.L.Warning"),
    CounterLNegative("Counter.L.Negative"),
    CounterLBlack("Counter.L.Black"),
    CounterLWhite("Counter.L.White"),
    CounterMDefault("Counter.M.Default"),
    CounterMSecondary("Counter.M.Secondary"),
    CounterMAccent("Counter.M.Accent"),
    CounterMPositive("Counter.M.Positive"),
    CounterMWarning("Counter.M.Warning"),
    CounterMNegative("Counter.M.Negative"),
    CounterMBlack("Counter.M.Black"),
    CounterMWhite("Counter.M.White"),
    CounterSDefault("Counter.S.Default"),
    CounterSSecondary("Counter.S.Secondary"),
    CounterSAccent("Counter.S.Accent"),
    CounterSPositive("Counter.S.Positive"),
    CounterSWarning("Counter.S.Warning"),
    CounterSNegative("Counter.S.Negative"),
    CounterSBlack("Counter.S.Black"),
    CounterSWhite("Counter.S.White"),
    CounterXsDefault("Counter.Xs.Default"),
    CounterXsSecondary("Counter.Xs.Secondary"),
    CounterXsAccent("Counter.Xs.Accent"),
    CounterXsPositive("Counter.Xs.Positive"),
    CounterXsWarning("Counter.Xs.Warning"),
    CounterXsNegative("Counter.Xs.Negative"),
    CounterXsBlack("Counter.Xs.Black"),
    CounterXsWhite("Counter.Xs.White"),
    CounterXxsDefault("Counter.Xxs.Default"),
    CounterXxsSecondary("Counter.Xxs.Secondary"),
    CounterXxsAccent("Counter.Xxs.Accent"),
    CounterXxsPositive("Counter.Xxs.Positive"),
    CounterXxsWarning("Counter.Xxs.Warning"),
    CounterXxsNegative("Counter.Xxs.Negative"),
    CounterXxsBlack("Counter.Xxs.Black"),
    CounterXxsWhite("Counter.Xxs.White"),
    ;

    /**
     * Typed API для подбора стиля counter
     */
    public companion object
}

/**
 * Возможные значения свойства size для counter
 */
public enum class CounterSize {
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства view для counter
 */
public enum class CounterView {
    Default,
    Secondary,
    Accent,
    Positive,
    Warning,
    Negative,
    Black,
    White,
}

/**
 * Возвращает [CounterStyle] для [CounterStyles]
 */
@Composable
public fun CounterStyles.style(modify: @Composable CounterStyleBuilder.() -> Unit = {}): CounterStyle {
    val builder = when (this) {
        CounterStyles.CounterLDefault -> Counter.L.Default
        CounterStyles.CounterLSecondary -> Counter.L.Secondary
        CounterStyles.CounterLAccent -> Counter.L.Accent
        CounterStyles.CounterLPositive -> Counter.L.Positive
        CounterStyles.CounterLWarning -> Counter.L.Warning
        CounterStyles.CounterLNegative -> Counter.L.Negative
        CounterStyles.CounterLBlack -> Counter.L.Black
        CounterStyles.CounterLWhite -> Counter.L.White
        CounterStyles.CounterMDefault -> Counter.M.Default
        CounterStyles.CounterMSecondary -> Counter.M.Secondary
        CounterStyles.CounterMAccent -> Counter.M.Accent
        CounterStyles.CounterMPositive -> Counter.M.Positive
        CounterStyles.CounterMWarning -> Counter.M.Warning
        CounterStyles.CounterMNegative -> Counter.M.Negative
        CounterStyles.CounterMBlack -> Counter.M.Black
        CounterStyles.CounterMWhite -> Counter.M.White
        CounterStyles.CounterSDefault -> Counter.S.Default
        CounterStyles.CounterSSecondary -> Counter.S.Secondary
        CounterStyles.CounterSAccent -> Counter.S.Accent
        CounterStyles.CounterSPositive -> Counter.S.Positive
        CounterStyles.CounterSWarning -> Counter.S.Warning
        CounterStyles.CounterSNegative -> Counter.S.Negative
        CounterStyles.CounterSBlack -> Counter.S.Black
        CounterStyles.CounterSWhite -> Counter.S.White
        CounterStyles.CounterXsDefault -> Counter.Xs.Default
        CounterStyles.CounterXsSecondary -> Counter.Xs.Secondary
        CounterStyles.CounterXsAccent -> Counter.Xs.Accent
        CounterStyles.CounterXsPositive -> Counter.Xs.Positive
        CounterStyles.CounterXsWarning -> Counter.Xs.Warning
        CounterStyles.CounterXsNegative -> Counter.Xs.Negative
        CounterStyles.CounterXsBlack -> Counter.Xs.Black
        CounterStyles.CounterXsWhite -> Counter.Xs.White
        CounterStyles.CounterXxsDefault -> Counter.Xxs.Default
        CounterStyles.CounterXxsSecondary -> Counter.Xxs.Secondary
        CounterStyles.CounterXxsAccent -> Counter.Xxs.Accent
        CounterStyles.CounterXxsPositive -> Counter.Xxs.Positive
        CounterStyles.CounterXxsWarning -> Counter.Xxs.Warning
        CounterStyles.CounterXxsNegative -> Counter.Xxs.Negative
        CounterStyles.CounterXxsBlack -> Counter.Xxs.Black
        CounterStyles.CounterXxsWhite -> Counter.Xxs.White
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CounterStyles] для counter
 */
public fun CounterStyles.Companion.resolve(
    size: CounterSize = CounterSize.L,
    view: CounterView =
        CounterView.Default,
): CounterStyles = when {
    size == CounterSize.L && view == CounterView.Default -> CounterStyles.CounterLDefault
    size == CounterSize.L && view == CounterView.Secondary -> CounterStyles.CounterLSecondary
    size == CounterSize.L && view == CounterView.Accent -> CounterStyles.CounterLAccent
    size == CounterSize.L && view == CounterView.Positive -> CounterStyles.CounterLPositive
    size == CounterSize.L && view == CounterView.Warning -> CounterStyles.CounterLWarning
    size == CounterSize.L && view == CounterView.Negative -> CounterStyles.CounterLNegative
    size == CounterSize.L && view == CounterView.Black -> CounterStyles.CounterLBlack
    size == CounterSize.L && view == CounterView.White -> CounterStyles.CounterLWhite
    size == CounterSize.M && view == CounterView.Default -> CounterStyles.CounterMDefault
    size == CounterSize.M && view == CounterView.Secondary -> CounterStyles.CounterMSecondary
    size == CounterSize.M && view == CounterView.Accent -> CounterStyles.CounterMAccent
    size == CounterSize.M && view == CounterView.Positive -> CounterStyles.CounterMPositive
    size == CounterSize.M && view == CounterView.Warning -> CounterStyles.CounterMWarning
    size == CounterSize.M && view == CounterView.Negative -> CounterStyles.CounterMNegative
    size == CounterSize.M && view == CounterView.Black -> CounterStyles.CounterMBlack
    size == CounterSize.M && view == CounterView.White -> CounterStyles.CounterMWhite
    size == CounterSize.S && view == CounterView.Default -> CounterStyles.CounterSDefault
    size == CounterSize.S && view == CounterView.Secondary -> CounterStyles.CounterSSecondary
    size == CounterSize.S && view == CounterView.Accent -> CounterStyles.CounterSAccent
    size == CounterSize.S && view == CounterView.Positive -> CounterStyles.CounterSPositive
    size == CounterSize.S && view == CounterView.Warning -> CounterStyles.CounterSWarning
    size == CounterSize.S && view == CounterView.Negative -> CounterStyles.CounterSNegative
    size == CounterSize.S && view == CounterView.Black -> CounterStyles.CounterSBlack
    size == CounterSize.S && view == CounterView.White -> CounterStyles.CounterSWhite
    size == CounterSize.Xs && view == CounterView.Default -> CounterStyles.CounterXsDefault
    size == CounterSize.Xs && view == CounterView.Secondary -> CounterStyles.CounterXsSecondary
    size == CounterSize.Xs && view == CounterView.Accent -> CounterStyles.CounterXsAccent
    size == CounterSize.Xs && view == CounterView.Positive -> CounterStyles.CounterXsPositive
    size == CounterSize.Xs && view == CounterView.Warning -> CounterStyles.CounterXsWarning
    size == CounterSize.Xs && view == CounterView.Negative -> CounterStyles.CounterXsNegative
    size == CounterSize.Xs && view == CounterView.Black -> CounterStyles.CounterXsBlack
    size == CounterSize.Xs && view == CounterView.White -> CounterStyles.CounterXsWhite
    size == CounterSize.Xxs && view == CounterView.Default -> CounterStyles.CounterXxsDefault
    size == CounterSize.Xxs && view == CounterView.Secondary -> CounterStyles.CounterXxsSecondary
    size == CounterSize.Xxs && view == CounterView.Accent -> CounterStyles.CounterXxsAccent
    size == CounterSize.Xxs && view == CounterView.Positive -> CounterStyles.CounterXxsPositive
    size == CounterSize.Xxs && view == CounterView.Warning -> CounterStyles.CounterXxsWarning
    size == CounterSize.Xxs && view == CounterView.Negative -> CounterStyles.CounterXxsNegative
    size == CounterSize.Xxs && view == CounterView.Black -> CounterStyles.CounterXxsBlack
    size == CounterSize.Xxs && view == CounterView.White -> CounterStyles.CounterXxsWhite
    else -> error("Unsupported counter style combination")
}

/**
 * Возвращает [CounterStyle] для counter
 */
@Composable
public fun CounterStyles.Companion.style(
    size: CounterSize = CounterSize.L,
    view: CounterView = CounterView.Default,
    modify: @Composable CounterStyleBuilder.() -> Unit = {},
): CounterStyle = resolve(size, view).style(modify)
