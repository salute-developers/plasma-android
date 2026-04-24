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
    ;

    /**
     * Typed API для подбора стиля spinner
     */
    public companion object
}

/**
 * Возможные значения свойства size для spinner
 */
public enum class SpinnerSize {
    M,
    S,
    Xs,
    Xxs,
    Scalable,
}

/**
 * Возможные значения свойства view для spinner
 */
public enum class SpinnerView {
    Default,
    Secondary,
    Accent,
    Positive,
    Negative,
    Warning,
    Info,
}

/**
 * Возвращает [SpinnerStyle] для [SpinnerStyles]
 */
@Composable
public fun SpinnerStyles.style(modify: @Composable SpinnerStyleBuilder.() -> Unit = {}): SpinnerStyle {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SpinnerStyles] для spinner
 */
public fun SpinnerStyles.Companion.resolve(
    size: SpinnerSize = SpinnerSize.M,
    view: SpinnerView =
        SpinnerView.Default,
): SpinnerStyles = when {
    size == SpinnerSize.M && view == SpinnerView.Default -> SpinnerStyles.SpinnerMDefault
    size == SpinnerSize.M && view == SpinnerView.Secondary -> SpinnerStyles.SpinnerMSecondary
    size == SpinnerSize.M && view == SpinnerView.Accent -> SpinnerStyles.SpinnerMAccent
    size == SpinnerSize.M && view == SpinnerView.Positive -> SpinnerStyles.SpinnerMPositive
    size == SpinnerSize.M && view == SpinnerView.Negative -> SpinnerStyles.SpinnerMNegative
    size == SpinnerSize.M && view == SpinnerView.Warning -> SpinnerStyles.SpinnerMWarning
    size == SpinnerSize.M && view == SpinnerView.Info -> SpinnerStyles.SpinnerMInfo
    size == SpinnerSize.S && view == SpinnerView.Default -> SpinnerStyles.SpinnerSDefault
    size == SpinnerSize.S && view == SpinnerView.Secondary -> SpinnerStyles.SpinnerSSecondary
    size == SpinnerSize.S && view == SpinnerView.Accent -> SpinnerStyles.SpinnerSAccent
    size == SpinnerSize.S && view == SpinnerView.Positive -> SpinnerStyles.SpinnerSPositive
    size == SpinnerSize.S && view == SpinnerView.Negative -> SpinnerStyles.SpinnerSNegative
    size == SpinnerSize.S && view == SpinnerView.Warning -> SpinnerStyles.SpinnerSWarning
    size == SpinnerSize.S && view == SpinnerView.Info -> SpinnerStyles.SpinnerSInfo
    size == SpinnerSize.Xs && view == SpinnerView.Default -> SpinnerStyles.SpinnerXsDefault
    size == SpinnerSize.Xs && view == SpinnerView.Secondary -> SpinnerStyles.SpinnerXsSecondary
    size == SpinnerSize.Xs && view == SpinnerView.Accent -> SpinnerStyles.SpinnerXsAccent
    size == SpinnerSize.Xs && view == SpinnerView.Positive -> SpinnerStyles.SpinnerXsPositive
    size == SpinnerSize.Xs && view == SpinnerView.Negative -> SpinnerStyles.SpinnerXsNegative
    size == SpinnerSize.Xs && view == SpinnerView.Warning -> SpinnerStyles.SpinnerXsWarning
    size == SpinnerSize.Xs && view == SpinnerView.Info -> SpinnerStyles.SpinnerXsInfo
    size == SpinnerSize.Xxs && view == SpinnerView.Default -> SpinnerStyles.SpinnerXxsDefault
    size == SpinnerSize.Xxs && view == SpinnerView.Secondary -> SpinnerStyles.SpinnerXxsSecondary
    size == SpinnerSize.Xxs && view == SpinnerView.Accent -> SpinnerStyles.SpinnerXxsAccent
    size == SpinnerSize.Xxs && view == SpinnerView.Positive -> SpinnerStyles.SpinnerXxsPositive
    size == SpinnerSize.Xxs && view == SpinnerView.Negative -> SpinnerStyles.SpinnerXxsNegative
    size == SpinnerSize.Xxs && view == SpinnerView.Warning -> SpinnerStyles.SpinnerXxsWarning
    size == SpinnerSize.Xxs && view == SpinnerView.Info -> SpinnerStyles.SpinnerXxsInfo
    size == SpinnerSize.Scalable && view == SpinnerView.Default ->
        SpinnerStyles.SpinnerScalableDefault
    size == SpinnerSize.Scalable && view == SpinnerView.Secondary ->
        SpinnerStyles.SpinnerScalableSecondary
    size == SpinnerSize.Scalable && view == SpinnerView.Accent ->
        SpinnerStyles.SpinnerScalableAccent
    size == SpinnerSize.Scalable && view == SpinnerView.Positive ->
        SpinnerStyles.SpinnerScalablePositive
    size == SpinnerSize.Scalable && view == SpinnerView.Negative ->
        SpinnerStyles.SpinnerScalableNegative
    size == SpinnerSize.Scalable && view == SpinnerView.Warning ->
        SpinnerStyles.SpinnerScalableWarning
    size == SpinnerSize.Scalable && view == SpinnerView.Info -> SpinnerStyles.SpinnerScalableInfo
    else -> error("Unsupported spinner style combination")
}

/**
 * Возвращает [SpinnerStyle] для spinner
 */
@Composable
public fun SpinnerStyles.Companion.style(
    size: SpinnerSize = SpinnerSize.M,
    view: SpinnerView = SpinnerView.Default,
    modify: @Composable SpinnerStyleBuilder.() -> Unit = {},
): SpinnerStyle = resolve(size, view).style(modify)
