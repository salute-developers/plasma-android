// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.spinner

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SpinnerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Spinner
 */
public enum class SpinnerStyles(
    public val key: String,
) {
    SpinnerMDefault("Spinner.M.Default"),
    SpinnerMSecondary("Spinner.M.Secondary"),
    SpinnerMAccent("Spinner.M.Accent"),
    SpinnerMPositive("Spinner.M.Positive"),
    SpinnerMNegative("Spinner.M.Negative"),
    SpinnerMWarning("Spinner.M.Warning"),
    SpinnerMInfo("Spinner.M.Info"),
    SpinnerSDefault("Spinner.S.Default"),
    SpinnerSSecondary("Spinner.S.Secondary"),
    SpinnerSAccent("Spinner.S.Accent"),
    SpinnerSPositive("Spinner.S.Positive"),
    SpinnerSNegative("Spinner.S.Negative"),
    SpinnerSWarning("Spinner.S.Warning"),
    SpinnerSInfo("Spinner.S.Info"),
    SpinnerXsDefault("Spinner.Xs.Default"),
    SpinnerXsSecondary("Spinner.Xs.Secondary"),
    SpinnerXsAccent("Spinner.Xs.Accent"),
    SpinnerXsPositive("Spinner.Xs.Positive"),
    SpinnerXsNegative("Spinner.Xs.Negative"),
    SpinnerXsWarning("Spinner.Xs.Warning"),
    SpinnerXsInfo("Spinner.Xs.Info"),
    SpinnerXxsDefault("Spinner.Xxs.Default"),
    SpinnerXxsSecondary("Spinner.Xxs.Secondary"),
    SpinnerXxsAccent("Spinner.Xxs.Accent"),
    SpinnerXxsPositive("Spinner.Xxs.Positive"),
    SpinnerXxsNegative("Spinner.Xxs.Negative"),
    SpinnerXxsWarning("Spinner.Xxs.Warning"),
    SpinnerXxsInfo("Spinner.Xxs.Info"),
    SpinnerScalableDefault("Spinner.Scalable.Default"),
    SpinnerScalableSecondary("Spinner.Scalable.Secondary"),
    SpinnerScalableAccent("Spinner.Scalable.Accent"),
    SpinnerScalablePositive("Spinner.Scalable.Positive"),
    SpinnerScalableNegative("Spinner.Scalable.Negative"),
    SpinnerScalableWarning("Spinner.Scalable.Warning"),
    SpinnerScalableInfo("Spinner.Scalable.Info"),
}

/**
 * Возвращает [SpinnerStyle] для [SpinnerStyles]
 */
@Composable
public fun SpinnerStyles.style(modifyAction: @Composable SpinnerStyleBuilder.() -> Unit = {}): SpinnerStyle {
    val builder = when (this) {
        SpinnerStyles.SpinnerMDefault -> Spinner.M.Default
        SpinnerStyles.SpinnerMSecondary -> Spinner.M.Secondary
        SpinnerStyles.SpinnerMAccent -> Spinner.M.Accent
        SpinnerStyles.SpinnerMPositive -> Spinner.M.Positive
        SpinnerStyles.SpinnerMNegative -> Spinner.M.Negative
        SpinnerStyles.SpinnerMWarning -> Spinner.M.Warning
        SpinnerStyles.SpinnerMInfo -> Spinner.M.Info
        SpinnerStyles.SpinnerSDefault -> Spinner.S.Default
        SpinnerStyles.SpinnerSSecondary -> Spinner.S.Secondary
        SpinnerStyles.SpinnerSAccent -> Spinner.S.Accent
        SpinnerStyles.SpinnerSPositive -> Spinner.S.Positive
        SpinnerStyles.SpinnerSNegative -> Spinner.S.Negative
        SpinnerStyles.SpinnerSWarning -> Spinner.S.Warning
        SpinnerStyles.SpinnerSInfo -> Spinner.S.Info
        SpinnerStyles.SpinnerXsDefault -> Spinner.Xs.Default
        SpinnerStyles.SpinnerXsSecondary -> Spinner.Xs.Secondary
        SpinnerStyles.SpinnerXsAccent -> Spinner.Xs.Accent
        SpinnerStyles.SpinnerXsPositive -> Spinner.Xs.Positive
        SpinnerStyles.SpinnerXsNegative -> Spinner.Xs.Negative
        SpinnerStyles.SpinnerXsWarning -> Spinner.Xs.Warning
        SpinnerStyles.SpinnerXsInfo -> Spinner.Xs.Info
        SpinnerStyles.SpinnerXxsDefault -> Spinner.Xxs.Default
        SpinnerStyles.SpinnerXxsSecondary -> Spinner.Xxs.Secondary
        SpinnerStyles.SpinnerXxsAccent -> Spinner.Xxs.Accent
        SpinnerStyles.SpinnerXxsPositive -> Spinner.Xxs.Positive
        SpinnerStyles.SpinnerXxsNegative -> Spinner.Xxs.Negative
        SpinnerStyles.SpinnerXxsWarning -> Spinner.Xxs.Warning
        SpinnerStyles.SpinnerXxsInfo -> Spinner.Xxs.Info
        SpinnerStyles.SpinnerScalableDefault -> Spinner.Scalable.Default
        SpinnerStyles.SpinnerScalableSecondary -> Spinner.Scalable.Secondary
        SpinnerStyles.SpinnerScalableAccent -> Spinner.Scalable.Accent
        SpinnerStyles.SpinnerScalablePositive -> Spinner.Scalable.Positive
        SpinnerStyles.SpinnerScalableNegative -> Spinner.Scalable.Negative
        SpinnerStyles.SpinnerScalableWarning -> Spinner.Scalable.Warning
        SpinnerStyles.SpinnerScalableInfo -> Spinner.Scalable.Info
    }
    return builder.modify(modifyAction).style()
}
