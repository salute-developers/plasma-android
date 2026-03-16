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
}

/**
 * Возвращает [ButtonGroupStyle] для [ButtonGroupStyles]
 */
@Composable
public fun ButtonGroupStyles.style(
    modifyAction: @Composable ButtonGroupStyleBuilder.() -> Unit =
        {},
): ButtonGroupStyle {
    val builder = when (this) {
        ButtonGroupStyles.BasicButtonGroupDefault -> BasicButtonGroup.Default
        ButtonGroupStyles.IconButtonGroupDefault -> IconButtonGroup.Default
    }
    return builder.modify(modifyAction).style()
}
