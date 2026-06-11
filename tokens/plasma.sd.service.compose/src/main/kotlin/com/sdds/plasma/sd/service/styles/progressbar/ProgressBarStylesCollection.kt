// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.progressbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ProgressBar
 */
public enum class ProgressBarStyles(
    public val key: String,
) {
    ProgressBarDefault("ProgressBar.Default"),
    ProgressBarSecondary("ProgressBar.Secondary"),
    ProgressBarAccent("ProgressBar.Accent"),
    ProgressBarGradient("ProgressBar.Gradient"),
    ProgressBarInfo("ProgressBar.Info"),
    ProgressBarNegative("ProgressBar.Negative"),
    ProgressBarPositive("ProgressBar.Positive"),
    ProgressBarWarning("ProgressBar.Warning"),
    ;

    /**
     * Typed API для подбора стиля progress-bar
     */
    public companion object
}

/**
 * Возможные значения свойства view для progress-bar
 */
public enum class ProgressBarView {
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
 * Возвращает [ProgressBarStyle] для [ProgressBarStyles]
 */
@Composable
public fun ProgressBarStyles.style(modify: @Composable ProgressBarStyleBuilder.() -> Unit = {}): ProgressBarStyle {
    val builder = when (this) {
        ProgressBarStyles.ProgressBarDefault -> ProgressBar.Default
        ProgressBarStyles.ProgressBarSecondary -> ProgressBar.Secondary
        ProgressBarStyles.ProgressBarAccent -> ProgressBar.Accent
        ProgressBarStyles.ProgressBarGradient -> ProgressBar.Gradient
        ProgressBarStyles.ProgressBarInfo -> ProgressBar.Info
        ProgressBarStyles.ProgressBarNegative -> ProgressBar.Negative
        ProgressBarStyles.ProgressBarPositive -> ProgressBar.Positive
        ProgressBarStyles.ProgressBarWarning -> ProgressBar.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ProgressBarStyles] для progress-bar
 */
public fun ProgressBarStyles.Companion.resolve(view: ProgressBarView = ProgressBarView.Default):
    ProgressBarStyles = when {
    view == ProgressBarView.Default -> ProgressBarStyles.ProgressBarDefault
    view == ProgressBarView.Secondary -> ProgressBarStyles.ProgressBarSecondary
    view == ProgressBarView.Accent -> ProgressBarStyles.ProgressBarAccent
    view == ProgressBarView.Gradient -> ProgressBarStyles.ProgressBarGradient
    view == ProgressBarView.Info -> ProgressBarStyles.ProgressBarInfo
    view == ProgressBarView.Negative -> ProgressBarStyles.ProgressBarNegative
    view == ProgressBarView.Positive -> ProgressBarStyles.ProgressBarPositive
    view == ProgressBarView.Warning -> ProgressBarStyles.ProgressBarWarning
    else -> error("Unsupported progress-bar style combination")
}

/**
 * Возвращает [ProgressBarStyle] для progress-bar
 */
@Composable
public fun ProgressBarStyles.Companion.style(
    view: ProgressBarView = ProgressBarView.Default,
    modify: @Composable ProgressBarStyleBuilder.() -> Unit = {},
): ProgressBarStyle =
    resolve(view).style(modify)
