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
}

/**
 * Возвращает [CounterStyle] для [CounterStyles]
 */
@Composable
public fun CounterStyles.style(modifyAction: @Composable CounterStyleBuilder.() -> Unit = {}): CounterStyle {
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
    }
    return builder.modify(modifyAction).style()
}
