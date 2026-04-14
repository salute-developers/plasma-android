// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.spinner

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
    SpinnerSize40ModeColorPrimary("Spinner.Size40.ModeColorPrimary"),
    SpinnerSize40ModeColorSecondary("Spinner.Size40.ModeColorSecondary"),
    SpinnerSize40ModeColorGlobalWhite("Spinner.Size40.ModeColorGlobalWhite"),
    SpinnerSize40ModeColorAccent("Spinner.Size40.ModeColorAccent"),
    SpinnerSize40ModeColorDanger("Spinner.Size40.ModeColorDanger"),
    SpinnerSize32ModeColorPrimary("Spinner.Size32.ModeColorPrimary"),
    SpinnerSize32ModeColorSecondary("Spinner.Size32.ModeColorSecondary"),
    SpinnerSize32ModeColorGlobalWhite("Spinner.Size32.ModeColorGlobalWhite"),
    SpinnerSize32ModeColorAccent("Spinner.Size32.ModeColorAccent"),
    SpinnerSize32ModeColorDanger("Spinner.Size32.ModeColorDanger"),
    SpinnerSize24ModeColorPrimary("Spinner.Size24.ModeColorPrimary"),
    SpinnerSize24ModeColorSecondary("Spinner.Size24.ModeColorSecondary"),
    SpinnerSize24ModeColorGlobalWhite("Spinner.Size24.ModeColorGlobalWhite"),
    SpinnerSize24ModeColorAccent("Spinner.Size24.ModeColorAccent"),
    SpinnerSize24ModeColorDanger("Spinner.Size24.ModeColorDanger"),
    SpinnerSize16ModeColorPrimary("Spinner.Size16.ModeColorPrimary"),
    SpinnerSize16ModeColorSecondary("Spinner.Size16.ModeColorSecondary"),
    SpinnerSize16ModeColorGlobalWhite("Spinner.Size16.ModeColorGlobalWhite"),
    SpinnerSize16ModeColorAccent("Spinner.Size16.ModeColorAccent"),
    SpinnerSize16ModeColorDanger("Spinner.Size16.ModeColorDanger"),
}

/**
 * Возвращает [SpinnerStyle] для [SpinnerStyles]
 */
@Composable
public fun SpinnerStyles.style(modifyAction: @Composable SpinnerStyleBuilder.() -> Unit = {}): SpinnerStyle {
    val builder = when (this) {
        SpinnerStyles.SpinnerSize40ModeColorPrimary -> Spinner.Size40.ModeColorPrimary
        SpinnerStyles.SpinnerSize40ModeColorSecondary -> Spinner.Size40.ModeColorSecondary
        SpinnerStyles.SpinnerSize40ModeColorGlobalWhite -> Spinner.Size40.ModeColorGlobalWhite
        SpinnerStyles.SpinnerSize40ModeColorAccent -> Spinner.Size40.ModeColorAccent
        SpinnerStyles.SpinnerSize40ModeColorDanger -> Spinner.Size40.ModeColorDanger
        SpinnerStyles.SpinnerSize32ModeColorPrimary -> Spinner.Size32.ModeColorPrimary
        SpinnerStyles.SpinnerSize32ModeColorSecondary -> Spinner.Size32.ModeColorSecondary
        SpinnerStyles.SpinnerSize32ModeColorGlobalWhite -> Spinner.Size32.ModeColorGlobalWhite
        SpinnerStyles.SpinnerSize32ModeColorAccent -> Spinner.Size32.ModeColorAccent
        SpinnerStyles.SpinnerSize32ModeColorDanger -> Spinner.Size32.ModeColorDanger
        SpinnerStyles.SpinnerSize24ModeColorPrimary -> Spinner.Size24.ModeColorPrimary
        SpinnerStyles.SpinnerSize24ModeColorSecondary -> Spinner.Size24.ModeColorSecondary
        SpinnerStyles.SpinnerSize24ModeColorGlobalWhite -> Spinner.Size24.ModeColorGlobalWhite
        SpinnerStyles.SpinnerSize24ModeColorAccent -> Spinner.Size24.ModeColorAccent
        SpinnerStyles.SpinnerSize24ModeColorDanger -> Spinner.Size24.ModeColorDanger
        SpinnerStyles.SpinnerSize16ModeColorPrimary -> Spinner.Size16.ModeColorPrimary
        SpinnerStyles.SpinnerSize16ModeColorSecondary -> Spinner.Size16.ModeColorSecondary
        SpinnerStyles.SpinnerSize16ModeColorGlobalWhite -> Spinner.Size16.ModeColorGlobalWhite
        SpinnerStyles.SpinnerSize16ModeColorAccent -> Spinner.Size16.ModeColorAccent
        SpinnerStyles.SpinnerSize16ModeColorDanger -> Spinner.Size16.ModeColorDanger
    }
    return builder.modify(modifyAction).style()
}
