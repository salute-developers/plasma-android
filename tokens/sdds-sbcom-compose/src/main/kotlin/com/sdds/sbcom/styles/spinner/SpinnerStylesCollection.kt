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
    Size40,
    Size32,
    Size24,
    Size16,
}

/**
 * Возможные значения свойства mode-color для spinner
 */
public enum class SpinnerModeColor {
    Primary,
    Secondary,
    GlobalWhite,
    Accent,
    Danger,
}

/**
 * Возвращает [SpinnerStyle] для [SpinnerStyles]
 */
@Composable
public fun SpinnerStyles.style(modify: @Composable SpinnerStyleBuilder.() -> Unit = {}): SpinnerStyle {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SpinnerStyles] для spinner
 */
public fun SpinnerStyles.Companion.resolve(
    size: SpinnerSize = SpinnerSize.Size40,
    modeColor: SpinnerModeColor = SpinnerModeColor.Primary,
): SpinnerStyles = when {
    size == SpinnerSize.Size40 && modeColor == SpinnerModeColor.Primary ->
        SpinnerStyles.SpinnerSize40ModeColorPrimary
    size == SpinnerSize.Size40 && modeColor == SpinnerModeColor.Secondary ->
        SpinnerStyles.SpinnerSize40ModeColorSecondary
    size == SpinnerSize.Size40 && modeColor == SpinnerModeColor.GlobalWhite ->
        SpinnerStyles.SpinnerSize40ModeColorGlobalWhite
    size == SpinnerSize.Size40 && modeColor == SpinnerModeColor.Accent ->
        SpinnerStyles.SpinnerSize40ModeColorAccent
    size == SpinnerSize.Size40 && modeColor == SpinnerModeColor.Danger ->
        SpinnerStyles.SpinnerSize40ModeColorDanger
    size == SpinnerSize.Size32 && modeColor == SpinnerModeColor.Primary ->
        SpinnerStyles.SpinnerSize32ModeColorPrimary
    size == SpinnerSize.Size32 && modeColor == SpinnerModeColor.Secondary ->
        SpinnerStyles.SpinnerSize32ModeColorSecondary
    size == SpinnerSize.Size32 && modeColor == SpinnerModeColor.GlobalWhite ->
        SpinnerStyles.SpinnerSize32ModeColorGlobalWhite
    size == SpinnerSize.Size32 && modeColor == SpinnerModeColor.Accent ->
        SpinnerStyles.SpinnerSize32ModeColorAccent
    size == SpinnerSize.Size32 && modeColor == SpinnerModeColor.Danger ->
        SpinnerStyles.SpinnerSize32ModeColorDanger
    size == SpinnerSize.Size24 && modeColor == SpinnerModeColor.Primary ->
        SpinnerStyles.SpinnerSize24ModeColorPrimary
    size == SpinnerSize.Size24 && modeColor == SpinnerModeColor.Secondary ->
        SpinnerStyles.SpinnerSize24ModeColorSecondary
    size == SpinnerSize.Size24 && modeColor == SpinnerModeColor.GlobalWhite ->
        SpinnerStyles.SpinnerSize24ModeColorGlobalWhite
    size == SpinnerSize.Size24 && modeColor == SpinnerModeColor.Accent ->
        SpinnerStyles.SpinnerSize24ModeColorAccent
    size == SpinnerSize.Size24 && modeColor == SpinnerModeColor.Danger ->
        SpinnerStyles.SpinnerSize24ModeColorDanger
    size == SpinnerSize.Size16 && modeColor == SpinnerModeColor.Primary ->
        SpinnerStyles.SpinnerSize16ModeColorPrimary
    size == SpinnerSize.Size16 && modeColor == SpinnerModeColor.Secondary ->
        SpinnerStyles.SpinnerSize16ModeColorSecondary
    size == SpinnerSize.Size16 && modeColor == SpinnerModeColor.GlobalWhite ->
        SpinnerStyles.SpinnerSize16ModeColorGlobalWhite
    size == SpinnerSize.Size16 && modeColor == SpinnerModeColor.Accent ->
        SpinnerStyles.SpinnerSize16ModeColorAccent
    size == SpinnerSize.Size16 && modeColor == SpinnerModeColor.Danger ->
        SpinnerStyles.SpinnerSize16ModeColorDanger
    else -> error("Unsupported spinner style combination")
}

/**
 * Возвращает [SpinnerStyle] для spinner
 */
@Composable
public fun SpinnerStyles.Companion.style(
    size: SpinnerSize = SpinnerSize.Size40,
    modeColor: SpinnerModeColor = SpinnerModeColor.Primary,
    modify: @Composable SpinnerStyleBuilder.() -> Unit = {},
): SpinnerStyle = resolve(size, modeColor).style(modify)
