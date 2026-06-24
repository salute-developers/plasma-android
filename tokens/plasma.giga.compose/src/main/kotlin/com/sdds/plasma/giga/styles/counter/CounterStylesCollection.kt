// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.counter

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
    CounterLAccent("Counter.L.Accent"),
    CounterLPositive("Counter.L.Positive"),
    CounterLWarning("Counter.L.Warning"),
    CounterLNegative("Counter.L.Negative"),
    CounterLBlack("Counter.L.Black"),
    CounterLWhite("Counter.L.White"),
    CounterMDefault("Counter.M.Default"),
    CounterMAccent("Counter.M.Accent"),
    CounterMPositive("Counter.M.Positive"),
    CounterMWarning("Counter.M.Warning"),
    CounterMNegative("Counter.M.Negative"),
    CounterMBlack("Counter.M.Black"),
    CounterMWhite("Counter.M.White"),
    CounterSDefault("Counter.S.Default"),
    CounterSAccent("Counter.S.Accent"),
    CounterSPositive("Counter.S.Positive"),
    CounterSWarning("Counter.S.Warning"),
    CounterSNegative("Counter.S.Negative"),
    CounterSBlack("Counter.S.Black"),
    CounterSWhite("Counter.S.White"),
    CounterXsDefault("Counter.Xs.Default"),
    CounterXsAccent("Counter.Xs.Accent"),
    CounterXsPositive("Counter.Xs.Positive"),
    CounterXsWarning("Counter.Xs.Warning"),
    CounterXsNegative("Counter.Xs.Negative"),
    CounterXsBlack("Counter.Xs.Black"),
    CounterXsWhite("Counter.Xs.White"),
    CounterXxsDefault("Counter.Xxs.Default"),
    CounterXxsAccent("Counter.Xxs.Accent"),
    CounterXxsPositive("Counter.Xxs.Positive"),
    CounterXxsWarning("Counter.Xxs.Warning"),
    CounterXxsNegative("Counter.Xxs.Negative"),
    CounterXxsBlack("Counter.Xxs.Black"),
    CounterXxsWhite("Counter.Xxs.White"),
    SegmentItemCounterLDefault("SegmentItemCounter.L.Default"),
    SegmentItemCounterLAccent("SegmentItemCounter.L.Accent"),
    SegmentItemCounterMDefault("SegmentItemCounter.M.Default"),
    SegmentItemCounterMAccent("SegmentItemCounter.M.Accent"),
    SegmentItemCounterSDefault("SegmentItemCounter.S.Default"),
    SegmentItemCounterSAccent("SegmentItemCounter.S.Accent"),
    SegmentItemCounterXsDefault("SegmentItemCounter.Xs.Default"),
    SegmentItemCounterXsAccent("SegmentItemCounter.Xs.Accent"),
    SegmentItemCounterXxsDefault("SegmentItemCounter.Xxs.Default"),
    SegmentItemCounterXxsAccent("SegmentItemCounter.Xxs.Accent"),
    ;

    /**
     * Typed API для подбора стиля counter
     */
    public object Default

    /**
     * Typed API для подбора стиля segment-item-counter
     */
    public object SegmentItemCounter
}

/**
 * Возможные значения свойства size для counter
 */
public enum class CounterDefaultSize {
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства view для counter
 */
public enum class CounterDefaultView {
    Default,
    Accent,
    Positive,
    Warning,
    Negative,
    Black,
    White,
}

/**
 * Возможные значения свойства size для segment-item-counter
 */
public enum class SegmentItemCounterSize {
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства view для segment-item-counter
 */
public enum class SegmentItemCounterView {
    Default,
    Accent,
}

/**
 * Возвращает [CounterStyle] для [CounterStyles]
 */
@Composable
public fun CounterStyles.style(modify: @Composable CounterStyleBuilder.() -> Unit = {}): CounterStyle {
    val builder = when (this) {
        CounterStyles.CounterLDefault -> Counter.L.Default
        CounterStyles.CounterLAccent -> Counter.L.Accent
        CounterStyles.CounterLPositive -> Counter.L.Positive
        CounterStyles.CounterLWarning -> Counter.L.Warning
        CounterStyles.CounterLNegative -> Counter.L.Negative
        CounterStyles.CounterLBlack -> Counter.L.Black
        CounterStyles.CounterLWhite -> Counter.L.White
        CounterStyles.CounterMDefault -> Counter.M.Default
        CounterStyles.CounterMAccent -> Counter.M.Accent
        CounterStyles.CounterMPositive -> Counter.M.Positive
        CounterStyles.CounterMWarning -> Counter.M.Warning
        CounterStyles.CounterMNegative -> Counter.M.Negative
        CounterStyles.CounterMBlack -> Counter.M.Black
        CounterStyles.CounterMWhite -> Counter.M.White
        CounterStyles.CounterSDefault -> Counter.S.Default
        CounterStyles.CounterSAccent -> Counter.S.Accent
        CounterStyles.CounterSPositive -> Counter.S.Positive
        CounterStyles.CounterSWarning -> Counter.S.Warning
        CounterStyles.CounterSNegative -> Counter.S.Negative
        CounterStyles.CounterSBlack -> Counter.S.Black
        CounterStyles.CounterSWhite -> Counter.S.White
        CounterStyles.CounterXsDefault -> Counter.Xs.Default
        CounterStyles.CounterXsAccent -> Counter.Xs.Accent
        CounterStyles.CounterXsPositive -> Counter.Xs.Positive
        CounterStyles.CounterXsWarning -> Counter.Xs.Warning
        CounterStyles.CounterXsNegative -> Counter.Xs.Negative
        CounterStyles.CounterXsBlack -> Counter.Xs.Black
        CounterStyles.CounterXsWhite -> Counter.Xs.White
        CounterStyles.CounterXxsDefault -> Counter.Xxs.Default
        CounterStyles.CounterXxsAccent -> Counter.Xxs.Accent
        CounterStyles.CounterXxsPositive -> Counter.Xxs.Positive
        CounterStyles.CounterXxsWarning -> Counter.Xxs.Warning
        CounterStyles.CounterXxsNegative -> Counter.Xxs.Negative
        CounterStyles.CounterXxsBlack -> Counter.Xxs.Black
        CounterStyles.CounterXxsWhite -> Counter.Xxs.White
        CounterStyles.SegmentItemCounterLDefault -> SegmentItemCounter.L.Default
        CounterStyles.SegmentItemCounterLAccent -> SegmentItemCounter.L.Accent
        CounterStyles.SegmentItemCounterMDefault -> SegmentItemCounter.M.Default
        CounterStyles.SegmentItemCounterMAccent -> SegmentItemCounter.M.Accent
        CounterStyles.SegmentItemCounterSDefault -> SegmentItemCounter.S.Default
        CounterStyles.SegmentItemCounterSAccent -> SegmentItemCounter.S.Accent
        CounterStyles.SegmentItemCounterXsDefault -> SegmentItemCounter.Xs.Default
        CounterStyles.SegmentItemCounterXsAccent -> SegmentItemCounter.Xs.Accent
        CounterStyles.SegmentItemCounterXxsDefault -> SegmentItemCounter.Xxs.Default
        CounterStyles.SegmentItemCounterXxsAccent -> SegmentItemCounter.Xxs.Accent
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CounterStyles] для counter
 */
public fun CounterStyles.Default.resolve(
    size: CounterDefaultSize = CounterDefaultSize.L,
    view: CounterDefaultView = CounterDefaultView.Default,
): CounterStyles = when {
    size == CounterDefaultSize.L && view == CounterDefaultView.Default ->
        CounterStyles.CounterLDefault
    size == CounterDefaultSize.L && view == CounterDefaultView.Accent ->
        CounterStyles.CounterLAccent
    size == CounterDefaultSize.L && view == CounterDefaultView.Positive ->
        CounterStyles.CounterLPositive
    size == CounterDefaultSize.L && view == CounterDefaultView.Warning ->
        CounterStyles.CounterLWarning
    size == CounterDefaultSize.L && view == CounterDefaultView.Negative ->
        CounterStyles.CounterLNegative
    size == CounterDefaultSize.L && view == CounterDefaultView.Black -> CounterStyles.CounterLBlack
    size == CounterDefaultSize.L && view == CounterDefaultView.White -> CounterStyles.CounterLWhite
    size == CounterDefaultSize.M && view == CounterDefaultView.Default ->
        CounterStyles.CounterMDefault
    size == CounterDefaultSize.M && view == CounterDefaultView.Accent ->
        CounterStyles.CounterMAccent
    size == CounterDefaultSize.M && view == CounterDefaultView.Positive ->
        CounterStyles.CounterMPositive
    size == CounterDefaultSize.M && view == CounterDefaultView.Warning ->
        CounterStyles.CounterMWarning
    size == CounterDefaultSize.M && view == CounterDefaultView.Negative ->
        CounterStyles.CounterMNegative
    size == CounterDefaultSize.M && view == CounterDefaultView.Black -> CounterStyles.CounterMBlack
    size == CounterDefaultSize.M && view == CounterDefaultView.White -> CounterStyles.CounterMWhite
    size == CounterDefaultSize.S && view == CounterDefaultView.Default ->
        CounterStyles.CounterSDefault
    size == CounterDefaultSize.S && view == CounterDefaultView.Accent ->
        CounterStyles.CounterSAccent
    size == CounterDefaultSize.S && view == CounterDefaultView.Positive ->
        CounterStyles.CounterSPositive
    size == CounterDefaultSize.S && view == CounterDefaultView.Warning ->
        CounterStyles.CounterSWarning
    size == CounterDefaultSize.S && view == CounterDefaultView.Negative ->
        CounterStyles.CounterSNegative
    size == CounterDefaultSize.S && view == CounterDefaultView.Black -> CounterStyles.CounterSBlack
    size == CounterDefaultSize.S && view == CounterDefaultView.White -> CounterStyles.CounterSWhite
    size == CounterDefaultSize.Xs && view == CounterDefaultView.Default ->
        CounterStyles.CounterXsDefault
    size == CounterDefaultSize.Xs && view == CounterDefaultView.Accent ->
        CounterStyles.CounterXsAccent
    size == CounterDefaultSize.Xs && view == CounterDefaultView.Positive ->
        CounterStyles.CounterXsPositive
    size == CounterDefaultSize.Xs && view == CounterDefaultView.Warning ->
        CounterStyles.CounterXsWarning
    size == CounterDefaultSize.Xs && view == CounterDefaultView.Negative ->
        CounterStyles.CounterXsNegative
    size == CounterDefaultSize.Xs && view == CounterDefaultView.Black ->
        CounterStyles.CounterXsBlack
    size == CounterDefaultSize.Xs && view == CounterDefaultView.White ->
        CounterStyles.CounterXsWhite
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.Default ->
        CounterStyles.CounterXxsDefault
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.Accent ->
        CounterStyles.CounterXxsAccent
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.Positive ->
        CounterStyles.CounterXxsPositive
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.Warning ->
        CounterStyles.CounterXxsWarning
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.Negative ->
        CounterStyles.CounterXxsNegative
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.Black ->
        CounterStyles.CounterXxsBlack
    size == CounterDefaultSize.Xxs && view == CounterDefaultView.White ->
        CounterStyles.CounterXxsWhite
    else -> error("Unsupported counter style combination")
}

/**
 * Возвращает [CounterStyle] для counter
 */
@Composable
public fun CounterStyles.Default.style(
    size: CounterDefaultSize = CounterDefaultSize.L,
    view: CounterDefaultView = CounterDefaultView.Default,
    modify: @Composable CounterStyleBuilder.() -> Unit = {},
): CounterStyle = resolve(size, view).style(modify)

/**
 * Возвращает экземпляр [CounterStyles] для segment-item-counter
 */
public fun CounterStyles.SegmentItemCounter.resolve(
    size: SegmentItemCounterSize =
        SegmentItemCounterSize.L,
    view: SegmentItemCounterView = SegmentItemCounterView.Default,
): CounterStyles = when {
    size == SegmentItemCounterSize.L && view == SegmentItemCounterView.Default ->
        CounterStyles.SegmentItemCounterLDefault
    size == SegmentItemCounterSize.L && view == SegmentItemCounterView.Accent ->
        CounterStyles.SegmentItemCounterLAccent
    size == SegmentItemCounterSize.M && view == SegmentItemCounterView.Default ->
        CounterStyles.SegmentItemCounterMDefault
    size == SegmentItemCounterSize.M && view == SegmentItemCounterView.Accent ->
        CounterStyles.SegmentItemCounterMAccent
    size == SegmentItemCounterSize.S && view == SegmentItemCounterView.Default ->
        CounterStyles.SegmentItemCounterSDefault
    size == SegmentItemCounterSize.S && view == SegmentItemCounterView.Accent ->
        CounterStyles.SegmentItemCounterSAccent
    size == SegmentItemCounterSize.Xs && view == SegmentItemCounterView.Default ->
        CounterStyles.SegmentItemCounterXsDefault
    size == SegmentItemCounterSize.Xs && view == SegmentItemCounterView.Accent ->
        CounterStyles.SegmentItemCounterXsAccent
    size == SegmentItemCounterSize.Xxs && view == SegmentItemCounterView.Default ->
        CounterStyles.SegmentItemCounterXxsDefault
    size == SegmentItemCounterSize.Xxs && view == SegmentItemCounterView.Accent ->
        CounterStyles.SegmentItemCounterXxsAccent
    else -> error("Unsupported segment-item-counter style combination")
}

/**
 * Возвращает [CounterStyle] для segment-item-counter
 */
@Composable
public fun CounterStyles.SegmentItemCounter.style(
    size: SegmentItemCounterSize = SegmentItemCounterSize.L,
    view: SegmentItemCounterView = SegmentItemCounterView.Default,
    modify: @Composable CounterStyleBuilder.() -> Unit = {},
): CounterStyle = resolve(size, view).style(modify)
