// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.indicator

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Indicator
 */
public enum class IndicatorStyles(
    public val key: String,
) {
    IndicatorLDefault("Indicator.L.Default"),
    IndicatorLAccent("Indicator.L.Accent"),
    IndicatorLInactive("Indicator.L.Inactive"),
    IndicatorLPositive("Indicator.L.Positive"),
    IndicatorLWarning("Indicator.L.Warning"),
    IndicatorLNegative("Indicator.L.Negative"),
    IndicatorLDark("Indicator.L.Dark"),
    IndicatorLBlack("Indicator.L.Black"),
    IndicatorLWhite("Indicator.L.White"),
    IndicatorMDefault("Indicator.M.Default"),
    IndicatorMAccent("Indicator.M.Accent"),
    IndicatorMInactive("Indicator.M.Inactive"),
    IndicatorMPositive("Indicator.M.Positive"),
    IndicatorMWarning("Indicator.M.Warning"),
    IndicatorMNegative("Indicator.M.Negative"),
    IndicatorMDark("Indicator.M.Dark"),
    IndicatorMBlack("Indicator.M.Black"),
    IndicatorMWhite("Indicator.M.White"),
    IndicatorSDefault("Indicator.S.Default"),
    IndicatorSAccent("Indicator.S.Accent"),
    IndicatorSInactive("Indicator.S.Inactive"),
    IndicatorSPositive("Indicator.S.Positive"),
    IndicatorSWarning("Indicator.S.Warning"),
    IndicatorSNegative("Indicator.S.Negative"),
    IndicatorSDark("Indicator.S.Dark"),
    IndicatorSBlack("Indicator.S.Black"),
    IndicatorSWhite("Indicator.S.White"),
    ;

    /**
     * Typed API для подбора стиля indicator
     */
    public companion object
}

/**
 * Возможные значения свойства size для indicator
 */
public enum class IndicatorSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства view для indicator
 */
public enum class IndicatorView {
    Default,
    Accent,
    Inactive,
    Positive,
    Warning,
    Negative,
    Dark,
    Black,
    White,
}

/**
 * Возвращает [IndicatorStyle] для [IndicatorStyles]
 */
@Composable
public fun IndicatorStyles.style(modify: @Composable IndicatorStyleBuilder.() -> Unit = {}): IndicatorStyle {
    val builder = when (this) {
        IndicatorStyles.IndicatorLDefault -> Indicator.L.Default
        IndicatorStyles.IndicatorLAccent -> Indicator.L.Accent
        IndicatorStyles.IndicatorLInactive -> Indicator.L.Inactive
        IndicatorStyles.IndicatorLPositive -> Indicator.L.Positive
        IndicatorStyles.IndicatorLWarning -> Indicator.L.Warning
        IndicatorStyles.IndicatorLNegative -> Indicator.L.Negative
        IndicatorStyles.IndicatorLDark -> Indicator.L.Dark
        IndicatorStyles.IndicatorLBlack -> Indicator.L.Black
        IndicatorStyles.IndicatorLWhite -> Indicator.L.White
        IndicatorStyles.IndicatorMDefault -> Indicator.M.Default
        IndicatorStyles.IndicatorMAccent -> Indicator.M.Accent
        IndicatorStyles.IndicatorMInactive -> Indicator.M.Inactive
        IndicatorStyles.IndicatorMPositive -> Indicator.M.Positive
        IndicatorStyles.IndicatorMWarning -> Indicator.M.Warning
        IndicatorStyles.IndicatorMNegative -> Indicator.M.Negative
        IndicatorStyles.IndicatorMDark -> Indicator.M.Dark
        IndicatorStyles.IndicatorMBlack -> Indicator.M.Black
        IndicatorStyles.IndicatorMWhite -> Indicator.M.White
        IndicatorStyles.IndicatorSDefault -> Indicator.S.Default
        IndicatorStyles.IndicatorSAccent -> Indicator.S.Accent
        IndicatorStyles.IndicatorSInactive -> Indicator.S.Inactive
        IndicatorStyles.IndicatorSPositive -> Indicator.S.Positive
        IndicatorStyles.IndicatorSWarning -> Indicator.S.Warning
        IndicatorStyles.IndicatorSNegative -> Indicator.S.Negative
        IndicatorStyles.IndicatorSDark -> Indicator.S.Dark
        IndicatorStyles.IndicatorSBlack -> Indicator.S.Black
        IndicatorStyles.IndicatorSWhite -> Indicator.S.White
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IndicatorStyles] для indicator
 */
public fun IndicatorStyles.Companion.resolve(
    size: IndicatorSize = IndicatorSize.L,
    view: IndicatorView = IndicatorView.Default,
): IndicatorStyles = when {
    size == IndicatorSize.L && view == IndicatorView.Default -> IndicatorStyles.IndicatorLDefault
    size == IndicatorSize.L && view == IndicatorView.Accent -> IndicatorStyles.IndicatorLAccent
    size == IndicatorSize.L && view == IndicatorView.Inactive -> IndicatorStyles.IndicatorLInactive
    size == IndicatorSize.L && view == IndicatorView.Positive -> IndicatorStyles.IndicatorLPositive
    size == IndicatorSize.L && view == IndicatorView.Warning -> IndicatorStyles.IndicatorLWarning
    size == IndicatorSize.L && view == IndicatorView.Negative -> IndicatorStyles.IndicatorLNegative
    size == IndicatorSize.L && view == IndicatorView.Dark -> IndicatorStyles.IndicatorLDark
    size == IndicatorSize.L && view == IndicatorView.Black -> IndicatorStyles.IndicatorLBlack
    size == IndicatorSize.L && view == IndicatorView.White -> IndicatorStyles.IndicatorLWhite
    size == IndicatorSize.M && view == IndicatorView.Default -> IndicatorStyles.IndicatorMDefault
    size == IndicatorSize.M && view == IndicatorView.Accent -> IndicatorStyles.IndicatorMAccent
    size == IndicatorSize.M && view == IndicatorView.Inactive -> IndicatorStyles.IndicatorMInactive
    size == IndicatorSize.M && view == IndicatorView.Positive -> IndicatorStyles.IndicatorMPositive
    size == IndicatorSize.M && view == IndicatorView.Warning -> IndicatorStyles.IndicatorMWarning
    size == IndicatorSize.M && view == IndicatorView.Negative -> IndicatorStyles.IndicatorMNegative
    size == IndicatorSize.M && view == IndicatorView.Dark -> IndicatorStyles.IndicatorMDark
    size == IndicatorSize.M && view == IndicatorView.Black -> IndicatorStyles.IndicatorMBlack
    size == IndicatorSize.M && view == IndicatorView.White -> IndicatorStyles.IndicatorMWhite
    size == IndicatorSize.S && view == IndicatorView.Default -> IndicatorStyles.IndicatorSDefault
    size == IndicatorSize.S && view == IndicatorView.Accent -> IndicatorStyles.IndicatorSAccent
    size == IndicatorSize.S && view == IndicatorView.Inactive -> IndicatorStyles.IndicatorSInactive
    size == IndicatorSize.S && view == IndicatorView.Positive -> IndicatorStyles.IndicatorSPositive
    size == IndicatorSize.S && view == IndicatorView.Warning -> IndicatorStyles.IndicatorSWarning
    size == IndicatorSize.S && view == IndicatorView.Negative -> IndicatorStyles.IndicatorSNegative
    size == IndicatorSize.S && view == IndicatorView.Dark -> IndicatorStyles.IndicatorSDark
    size == IndicatorSize.S && view == IndicatorView.Black -> IndicatorStyles.IndicatorSBlack
    size == IndicatorSize.S && view == IndicatorView.White -> IndicatorStyles.IndicatorSWhite
    else -> error("Unsupported indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для indicator
 */
@Composable
public fun IndicatorStyles.Companion.style(
    size: IndicatorSize = IndicatorSize.L,
    view: IndicatorView = IndicatorView.Default,
    modify: @Composable IndicatorStyleBuilder.() -> Unit = {},
): IndicatorStyle = resolve(size, view).style(modify)
