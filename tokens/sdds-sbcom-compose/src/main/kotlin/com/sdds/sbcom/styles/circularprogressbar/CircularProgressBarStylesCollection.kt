// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.circularprogressbar

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
    CircularProgressBarSize40ModeColorPrimary("CircularProgressBar.Size40.ModeColorPrimary"),
    CircularProgressBarSize40ModeColorSecondary("CircularProgressBar.Size40.ModeColorSecondary"),
    CircularProgressBarSize40ModeColorGlobalWhite("CircularProgressBar.Size40.ModeColorGlobalWhite"),
    CircularProgressBarSize40ModeColorAccent("CircularProgressBar.Size40.ModeColorAccent"),
    CircularProgressBarSize40ModeColorDanger("CircularProgressBar.Size40.ModeColorDanger"),
    CircularProgressBarSize32ModeColorPrimary("CircularProgressBar.Size32.ModeColorPrimary"),
    CircularProgressBarSize32ModeColorSecondary("CircularProgressBar.Size32.ModeColorSecondary"),
    CircularProgressBarSize32ModeColorGlobalWhite("CircularProgressBar.Size32.ModeColorGlobalWhite"),
    CircularProgressBarSize32ModeColorAccent("CircularProgressBar.Size32.ModeColorAccent"),
    CircularProgressBarSize32ModeColorDanger("CircularProgressBar.Size32.ModeColorDanger"),
    CircularProgressBarSize24ModeColorPrimary("CircularProgressBar.Size24.ModeColorPrimary"),
    CircularProgressBarSize24ModeColorSecondary("CircularProgressBar.Size24.ModeColorSecondary"),
    CircularProgressBarSize24ModeColorGlobalWhite("CircularProgressBar.Size24.ModeColorGlobalWhite"),
    CircularProgressBarSize24ModeColorAccent("CircularProgressBar.Size24.ModeColorAccent"),
    CircularProgressBarSize24ModeColorDanger("CircularProgressBar.Size24.ModeColorDanger"),
    CircularProgressBarSize16ModeColorPrimary("CircularProgressBar.Size16.ModeColorPrimary"),
    CircularProgressBarSize16ModeColorSecondary("CircularProgressBar.Size16.ModeColorSecondary"),
    CircularProgressBarSize16ModeColorGlobalWhite("CircularProgressBar.Size16.ModeColorGlobalWhite"),
    CircularProgressBarSize16ModeColorAccent("CircularProgressBar.Size16.ModeColorAccent"),
    CircularProgressBarSize16ModeColorDanger("CircularProgressBar.Size16.ModeColorDanger"),
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
    Size40,
    Size32,
    Size24,
    Size16,
}

/**
 * Возможные значения свойства mode-color для circular-progress-bar
 */
public enum class CircularProgressBarModeColor {
    Primary,
    Secondary,
    GlobalWhite,
    Accent,
    Danger,
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
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorPrimary ->
            CircularProgressBar.Size40.ModeColorPrimary
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorSecondary ->
            CircularProgressBar.Size40.ModeColorSecondary
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorGlobalWhite ->
            CircularProgressBar.Size40.ModeColorGlobalWhite
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorAccent ->
            CircularProgressBar.Size40.ModeColorAccent
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorDanger ->
            CircularProgressBar.Size40.ModeColorDanger
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorPrimary ->
            CircularProgressBar.Size32.ModeColorPrimary
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorSecondary ->
            CircularProgressBar.Size32.ModeColorSecondary
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorGlobalWhite ->
            CircularProgressBar.Size32.ModeColorGlobalWhite
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorAccent ->
            CircularProgressBar.Size32.ModeColorAccent
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorDanger ->
            CircularProgressBar.Size32.ModeColorDanger
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorPrimary ->
            CircularProgressBar.Size24.ModeColorPrimary
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorSecondary ->
            CircularProgressBar.Size24.ModeColorSecondary
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorGlobalWhite ->
            CircularProgressBar.Size24.ModeColorGlobalWhite
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorAccent ->
            CircularProgressBar.Size24.ModeColorAccent
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorDanger ->
            CircularProgressBar.Size24.ModeColorDanger
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorPrimary ->
            CircularProgressBar.Size16.ModeColorPrimary
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorSecondary ->
            CircularProgressBar.Size16.ModeColorSecondary
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorGlobalWhite ->
            CircularProgressBar.Size16.ModeColorGlobalWhite
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorAccent ->
            CircularProgressBar.Size16.ModeColorAccent
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorDanger ->
            CircularProgressBar.Size16.ModeColorDanger
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CircularProgressBarStyles] для circular-progress-bar
 */
public fun CircularProgressBarStyles.Companion.resolve(
    size: CircularProgressBarSize =
        CircularProgressBarSize.Size40,
    modeColor: CircularProgressBarModeColor =
        CircularProgressBarModeColor.Primary,
): CircularProgressBarStyles = when {
    size == CircularProgressBarSize.Size40 && modeColor == CircularProgressBarModeColor.Primary ->
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorPrimary
    size == CircularProgressBarSize.Size40 && modeColor == CircularProgressBarModeColor.Secondary ->
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorSecondary
    size == CircularProgressBarSize.Size40 && modeColor ==
        CircularProgressBarModeColor.GlobalWhite ->
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorGlobalWhite
    size == CircularProgressBarSize.Size40 && modeColor == CircularProgressBarModeColor.Accent ->
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorAccent
    size == CircularProgressBarSize.Size40 && modeColor == CircularProgressBarModeColor.Danger ->
        CircularProgressBarStyles.CircularProgressBarSize40ModeColorDanger
    size == CircularProgressBarSize.Size32 && modeColor == CircularProgressBarModeColor.Primary ->
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorPrimary
    size == CircularProgressBarSize.Size32 && modeColor == CircularProgressBarModeColor.Secondary ->
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorSecondary
    size == CircularProgressBarSize.Size32 && modeColor ==
        CircularProgressBarModeColor.GlobalWhite ->
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorGlobalWhite
    size == CircularProgressBarSize.Size32 && modeColor == CircularProgressBarModeColor.Accent ->
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorAccent
    size == CircularProgressBarSize.Size32 && modeColor == CircularProgressBarModeColor.Danger ->
        CircularProgressBarStyles.CircularProgressBarSize32ModeColorDanger
    size == CircularProgressBarSize.Size24 && modeColor == CircularProgressBarModeColor.Primary ->
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorPrimary
    size == CircularProgressBarSize.Size24 && modeColor == CircularProgressBarModeColor.Secondary ->
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorSecondary
    size == CircularProgressBarSize.Size24 && modeColor ==
        CircularProgressBarModeColor.GlobalWhite ->
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorGlobalWhite
    size == CircularProgressBarSize.Size24 && modeColor == CircularProgressBarModeColor.Accent ->
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorAccent
    size == CircularProgressBarSize.Size24 && modeColor == CircularProgressBarModeColor.Danger ->
        CircularProgressBarStyles.CircularProgressBarSize24ModeColorDanger
    size == CircularProgressBarSize.Size16 && modeColor == CircularProgressBarModeColor.Primary ->
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorPrimary
    size == CircularProgressBarSize.Size16 && modeColor == CircularProgressBarModeColor.Secondary ->
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorSecondary
    size == CircularProgressBarSize.Size16 && modeColor ==
        CircularProgressBarModeColor.GlobalWhite ->
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorGlobalWhite
    size == CircularProgressBarSize.Size16 && modeColor == CircularProgressBarModeColor.Accent ->
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorAccent
    size == CircularProgressBarSize.Size16 && modeColor == CircularProgressBarModeColor.Danger ->
        CircularProgressBarStyles.CircularProgressBarSize16ModeColorDanger
    else -> error("Unsupported circular-progress-bar style combination")
}

/**
 * Возвращает [CircularProgressBarStyle] для circular-progress-bar
 */
@Composable
public fun CircularProgressBarStyles.Companion.style(
    size: CircularProgressBarSize = CircularProgressBarSize.Size40,
    modeColor: CircularProgressBarModeColor = CircularProgressBarModeColor.Primary,
    modify: @Composable CircularProgressBarStyleBuilder.() -> Unit = {},
): CircularProgressBarStyle = resolve(size, modeColor).style(modify)
