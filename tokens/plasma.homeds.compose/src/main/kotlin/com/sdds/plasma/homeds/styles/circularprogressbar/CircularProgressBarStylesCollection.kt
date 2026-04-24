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
    ;

    /**
     * Typed API для подбора стиля circular-progress-bar
     */
    public companion object
}

/**
 * Возможные значения свойства size для circular-progress-bar
 */
public enum class CircularProgressBarSize {
    Xxl,
    Xl,
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства view для circular-progress-bar
 */
public enum class CircularProgressBarView {
    Default,
    Secondary,
    Accent,
    Gradient,
    Info,
    Negative,
    Positive,
    Warning,
}

/**
 * Возвращает [CircularProgressBarStyle] для [CircularProgressBarStyles]
 */
@Composable
public fun CircularProgressBarStyles.style(
    modify: @Composable
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CircularProgressBarStyles] для circular-progress-bar
 */
public fun CircularProgressBarStyles.Companion.resolve(
    size: CircularProgressBarSize =
        CircularProgressBarSize.Xxl,
    view: CircularProgressBarView =
        CircularProgressBarView.Default,
): CircularProgressBarStyles = when {
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarXxlDefault
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarXxlSecondary
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarXxlAccent
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarXxlGradient
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarXxlInfo
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarXxlNegative
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarXxlPositive
    size == CircularProgressBarSize.Xxl && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarXxlWarning
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarXlDefault
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarXlSecondary
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarXlAccent
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarXlGradient
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarXlInfo
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarXlNegative
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarXlPositive
    size == CircularProgressBarSize.Xl && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarXlWarning
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarLDefault
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarLSecondary
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarLAccent
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarLGradient
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarLInfo
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarLNegative
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarLPositive
    size == CircularProgressBarSize.L && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarLWarning
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarMDefault
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarMSecondary
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarMAccent
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarMGradient
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarMInfo
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarMNegative
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarMPositive
    size == CircularProgressBarSize.M && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarMWarning
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarSDefault
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarSSecondary
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarSAccent
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarSGradient
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarSInfo
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarSNegative
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarSPositive
    size == CircularProgressBarSize.S && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarSWarning
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarXsDefault
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarXsSecondary
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarXsAccent
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarXsGradient
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarXsInfo
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarXsNegative
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarXsPositive
    size == CircularProgressBarSize.Xs && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarXsWarning
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Default ->
        CircularProgressBarStyles.CircularProgressBarXxsDefault
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Secondary ->
        CircularProgressBarStyles.CircularProgressBarXxsSecondary
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Accent ->
        CircularProgressBarStyles.CircularProgressBarXxsAccent
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Gradient ->
        CircularProgressBarStyles.CircularProgressBarXxsGradient
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Info ->
        CircularProgressBarStyles.CircularProgressBarXxsInfo
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Negative ->
        CircularProgressBarStyles.CircularProgressBarXxsNegative
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Positive ->
        CircularProgressBarStyles.CircularProgressBarXxsPositive
    size == CircularProgressBarSize.Xxs && view == CircularProgressBarView.Warning ->
        CircularProgressBarStyles.CircularProgressBarXxsWarning
    else -> error("Unsupported circular-progress-bar style combination")
}

/**
 * Возвращает [CircularProgressBarStyle] для circular-progress-bar
 */
@Composable
public fun CircularProgressBarStyles.Companion.style(
    size: CircularProgressBarSize = CircularProgressBarSize.Xxl,
    view: CircularProgressBarView = CircularProgressBarView.Default,
    modify: @Composable CircularProgressBarStyleBuilder.() -> Unit = {},
): CircularProgressBarStyle = resolve(size, view).style(modify)
