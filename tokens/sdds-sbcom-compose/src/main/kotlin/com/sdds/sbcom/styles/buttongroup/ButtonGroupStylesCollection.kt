// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.buttongroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ButtonGroup
 */
public enum class ButtonGroupStyles(
    public val key: String,
) {
    BasicButtonGroupDefault("BasicButtonGroup.Default"),
    IconButtonGroupDefault("IconButtonGroup.Default"),
    ;

    /**
     * Typed API для подбора стиля basic-button-group
     */
    public object BasicButtonGroup

    /**
     * Typed API для подбора стиля icon-button-group
     */
    public object IconButtonGroup
}

/**
 * Возвращает [ButtonGroupStyle] для [ButtonGroupStyles]
 */
@Composable
public fun ButtonGroupStyles.style(modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {}): ButtonGroupStyle {
    val builder = when (this) {
        ButtonGroupStyles.BasicButtonGroupDefault -> BasicButtonGroup.Default
        ButtonGroupStyles.IconButtonGroupDefault -> IconButtonGroup.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ButtonGroupStyles] для basic-button-group
 */
public fun ButtonGroupStyles.BasicButtonGroup.resolve(): ButtonGroupStyles =
    ButtonGroupStyles.BasicButtonGroupDefault

/**
 * Возвращает [ButtonGroupStyle] для basic-button-group
 */
@Composable
public fun ButtonGroupStyles.BasicButtonGroup.style(
    modify: @Composable
    ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve().style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для icon-button-group
 */
public fun ButtonGroupStyles.IconButtonGroup.resolve(): ButtonGroupStyles =
    ButtonGroupStyles.IconButtonGroupDefault

/**
 * Возвращает [ButtonGroupStyle] для icon-button-group
 */
@Composable
public fun ButtonGroupStyles.IconButtonGroup.style(
    modify: @Composable
    ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve().style(modify)
