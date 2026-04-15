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
    return builder.modify(modifyAction).style()
}
