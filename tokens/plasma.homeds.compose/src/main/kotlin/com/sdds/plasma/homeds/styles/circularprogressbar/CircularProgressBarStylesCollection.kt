// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.circularprogressbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.CircularProgressBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CircularProgressBar
 */
public enum class CircularProgressBarStyles(
    public val key: String,
) {
    CircularProgressBarXxlDefault("CircularProgressBar.Xxl.Default"),
    CircularProgressBarXxlSecondary("CircularProgressBar.Xxl.Secondary"),
    CircularProgressBarXxlAccent("CircularProgressBar.Xxl.Accent"),
    CircularProgressBarXxlGradient("CircularProgressBar.Xxl.Gradient"),
    CircularProgressBarXxlInfo("CircularProgressBar.Xxl.Info"),
    CircularProgressBarXxlNegative("CircularProgressBar.Xxl.Negative"),
    CircularProgressBarXxlPositive("CircularProgressBar.Xxl.Positive"),
    CircularProgressBarXxlWarning("CircularProgressBar.Xxl.Warning"),
    CircularProgressBarXlDefault("CircularProgressBar.Xl.Default"),
    CircularProgressBarXlSecondary("CircularProgressBar.Xl.Secondary"),
    CircularProgressBarXlAccent("CircularProgressBar.Xl.Accent"),
    CircularProgressBarXlGradient("CircularProgressBar.Xl.Gradient"),
    CircularProgressBarXlInfo("CircularProgressBar.Xl.Info"),
    CircularProgressBarXlNegative("CircularProgressBar.Xl.Negative"),
    CircularProgressBarXlPositive("CircularProgressBar.Xl.Positive"),
    CircularProgressBarXlWarning("CircularProgressBar.Xl.Warning"),
    CircularProgressBarLDefault("CircularProgressBar.L.Default"),
    CircularProgressBarLSecondary("CircularProgressBar.L.Secondary"),
    CircularProgressBarLAccent("CircularProgressBar.L.Accent"),
    CircularProgressBarLGradient("CircularProgressBar.L.Gradient"),
    CircularProgressBarLInfo("CircularProgressBar.L.Info"),
    CircularProgressBarLNegative("CircularProgressBar.L.Negative"),
    CircularProgressBarLPositive("CircularProgressBar.L.Positive"),
    CircularProgressBarLWarning("CircularProgressBar.L.Warning"),
    CircularProgressBarMDefault("CircularProgressBar.M.Default"),
    CircularProgressBarMSecondary("CircularProgressBar.M.Secondary"),
    CircularProgressBarMAccent("CircularProgressBar.M.Accent"),
    CircularProgressBarMGradient("CircularProgressBar.M.Gradient"),
    CircularProgressBarMInfo("CircularProgressBar.M.Info"),
    CircularProgressBarMNegative("CircularProgressBar.M.Negative"),
    CircularProgressBarMPositive("CircularProgressBar.M.Positive"),
    CircularProgressBarMWarning("CircularProgressBar.M.Warning"),
    CircularProgressBarSDefault("CircularProgressBar.S.Default"),
    CircularProgressBarSSecondary("CircularProgressBar.S.Secondary"),
    CircularProgressBarSAccent("CircularProgressBar.S.Accent"),
    CircularProgressBarSGradient("CircularProgressBar.S.Gradient"),
    CircularProgressBarSInfo("CircularProgressBar.S.Info"),
    CircularProgressBarSNegative("CircularProgressBar.S.Negative"),
    CircularProgressBarSPositive("CircularProgressBar.S.Positive"),
    CircularProgressBarSWarning("CircularProgressBar.S.Warning"),
    CircularProgressBarXsDefault("CircularProgressBar.Xs.Default"),
    CircularProgressBarXsSecondary("CircularProgressBar.Xs.Secondary"),
    CircularProgressBarXsAccent("CircularProgressBar.Xs.Accent"),
    CircularProgressBarXsGradient("CircularProgressBar.Xs.Gradient"),
    CircularProgressBarXsInfo("CircularProgressBar.Xs.Info"),
    CircularProgressBarXsNegative("CircularProgressBar.Xs.Negative"),
    CircularProgressBarXsPositive("CircularProgressBar.Xs.Positive"),
    CircularProgressBarXsWarning("CircularProgressBar.Xs.Warning"),
    CircularProgressBarXxsDefault("CircularProgressBar.Xxs.Default"),
    CircularProgressBarXxsSecondary("CircularProgressBar.Xxs.Secondary"),
    CircularProgressBarXxsAccent("CircularProgressBar.Xxs.Accent"),
    CircularProgressBarXxsGradient("CircularProgressBar.Xxs.Gradient"),
    CircularProgressBarXxsInfo("CircularProgressBar.Xxs.Info"),
    CircularProgressBarXxsNegative("CircularProgressBar.Xxs.Negative"),
    CircularProgressBarXxsPositive("CircularProgressBar.Xxs.Positive"),
    CircularProgressBarXxsWarning("CircularProgressBar.Xxs.Warning"),
}

/**
 * Возвращает [CircularProgressBarStyle] для [CircularProgressBarStyles]
 */
@Composable
public fun CircularProgressBarStyles.style(
    modifyAction: @Composable
    CircularProgressBarStyleBuilder.() -> Unit = {},
): CircularProgressBarStyle {
    val builder = when (this) {
        CircularProgressBarStyles.CircularProgressBarXxlDefault -> CircularProgressBar.Xxl.Default
        CircularProgressBarStyles.CircularProgressBarXxlSecondary ->
            CircularProgressBar.Xxl.Secondary
        CircularProgressBarStyles.CircularProgressBarXxlAccent -> CircularProgressBar.Xxl.Accent
        CircularProgressBarStyles.CircularProgressBarXxlGradient -> CircularProgressBar.Xxl.Gradient
        CircularProgressBarStyles.CircularProgressBarXxlInfo -> CircularProgressBar.Xxl.Info
        CircularProgressBarStyles.CircularProgressBarXxlNegative -> CircularProgressBar.Xxl.Negative
        CircularProgressBarStyles.CircularProgressBarXxlPositive -> CircularProgressBar.Xxl.Positive
        CircularProgressBarStyles.CircularProgressBarXxlWarning -> CircularProgressBar.Xxl.Warning
        CircularProgressBarStyles.CircularProgressBarXlDefault -> CircularProgressBar.Xl.Default
        CircularProgressBarStyles.CircularProgressBarXlSecondary -> CircularProgressBar.Xl.Secondary
        CircularProgressBarStyles.CircularProgressBarXlAccent -> CircularProgressBar.Xl.Accent
        CircularProgressBarStyles.CircularProgressBarXlGradient -> CircularProgressBar.Xl.Gradient
        CircularProgressBarStyles.CircularProgressBarXlInfo -> CircularProgressBar.Xl.Info
        CircularProgressBarStyles.CircularProgressBarXlNegative -> CircularProgressBar.Xl.Negative
        CircularProgressBarStyles.CircularProgressBarXlPositive -> CircularProgressBar.Xl.Positive
        CircularProgressBarStyles.CircularProgressBarXlWarning -> CircularProgressBar.Xl.Warning
        CircularProgressBarStyles.CircularProgressBarLDefault -> CircularProgressBar.L.Default
        CircularProgressBarStyles.CircularProgressBarLSecondary -> CircularProgressBar.L.Secondary
        CircularProgressBarStyles.CircularProgressBarLAccent -> CircularProgressBar.L.Accent
        CircularProgressBarStyles.CircularProgressBarLGradient -> CircularProgressBar.L.Gradient
        CircularProgressBarStyles.CircularProgressBarLInfo -> CircularProgressBar.L.Info
        CircularProgressBarStyles.CircularProgressBarLNegative -> CircularProgressBar.L.Negative
        CircularProgressBarStyles.CircularProgressBarLPositive -> CircularProgressBar.L.Positive
        CircularProgressBarStyles.CircularProgressBarLWarning -> CircularProgressBar.L.Warning
        CircularProgressBarStyles.CircularProgressBarMDefault -> CircularProgressBar.M.Default
        CircularProgressBarStyles.CircularProgressBarMSecondary -> CircularProgressBar.M.Secondary
        CircularProgressBarStyles.CircularProgressBarMAccent -> CircularProgressBar.M.Accent
        CircularProgressBarStyles.CircularProgressBarMGradient -> CircularProgressBar.M.Gradient
        CircularProgressBarStyles.CircularProgressBarMInfo -> CircularProgressBar.M.Info
        CircularProgressBarStyles.CircularProgressBarMNegative -> CircularProgressBar.M.Negative
        CircularProgressBarStyles.CircularProgressBarMPositive -> CircularProgressBar.M.Positive
        CircularProgressBarStyles.CircularProgressBarMWarning -> CircularProgressBar.M.Warning
        CircularProgressBarStyles.CircularProgressBarSDefault -> CircularProgressBar.S.Default
        CircularProgressBarStyles.CircularProgressBarSSecondary -> CircularProgressBar.S.Secondary
        CircularProgressBarStyles.CircularProgressBarSAccent -> CircularProgressBar.S.Accent
        CircularProgressBarStyles.CircularProgressBarSGradient -> CircularProgressBar.S.Gradient
        CircularProgressBarStyles.CircularProgressBarSInfo -> CircularProgressBar.S.Info
        CircularProgressBarStyles.CircularProgressBarSNegative -> CircularProgressBar.S.Negative
        CircularProgressBarStyles.CircularProgressBarSPositive -> CircularProgressBar.S.Positive
        CircularProgressBarStyles.CircularProgressBarSWarning -> CircularProgressBar.S.Warning
        CircularProgressBarStyles.CircularProgressBarXsDefault -> CircularProgressBar.Xs.Default
        CircularProgressBarStyles.CircularProgressBarXsSecondary -> CircularProgressBar.Xs.Secondary
        CircularProgressBarStyles.CircularProgressBarXsAccent -> CircularProgressBar.Xs.Accent
        CircularProgressBarStyles.CircularProgressBarXsGradient -> CircularProgressBar.Xs.Gradient
        CircularProgressBarStyles.CircularProgressBarXsInfo -> CircularProgressBar.Xs.Info
        CircularProgressBarStyles.CircularProgressBarXsNegative -> CircularProgressBar.Xs.Negative
        CircularProgressBarStyles.CircularProgressBarXsPositive -> CircularProgressBar.Xs.Positive
        CircularProgressBarStyles.CircularProgressBarXsWarning -> CircularProgressBar.Xs.Warning
        CircularProgressBarStyles.CircularProgressBarXxsDefault -> CircularProgressBar.Xxs.Default
        CircularProgressBarStyles.CircularProgressBarXxsSecondary ->
            CircularProgressBar.Xxs.Secondary
        CircularProgressBarStyles.CircularProgressBarXxsAccent -> CircularProgressBar.Xxs.Accent
        CircularProgressBarStyles.CircularProgressBarXxsGradient -> CircularProgressBar.Xxs.Gradient
        CircularProgressBarStyles.CircularProgressBarXxsInfo -> CircularProgressBar.Xxs.Info
        CircularProgressBarStyles.CircularProgressBarXxsNegative -> CircularProgressBar.Xxs.Negative
        CircularProgressBarStyles.CircularProgressBarXxsPositive -> CircularProgressBar.Xxs.Positive
        CircularProgressBarStyles.CircularProgressBarXxsWarning -> CircularProgressBar.Xxs.Warning
    }
    return builder.modify(modifyAction).style()
}
