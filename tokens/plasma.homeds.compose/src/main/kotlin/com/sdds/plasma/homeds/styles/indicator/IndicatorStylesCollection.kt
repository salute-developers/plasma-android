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
}

/**
 * Возвращает [IndicatorStyle] для [IndicatorStyles]
 */
@Composable
public fun IndicatorStyles.style(modifyAction: @Composable IndicatorStyleBuilder.() -> Unit = {}): IndicatorStyle {
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
    return builder.modify(modifyAction).style()
}
