// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.textfield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TextField
 */
public enum class TextFieldStyles(
    public val key: String,
) {
    TextFieldDefault("TextField.Default"),
    TextFieldError("TextField.Error"),
}

/**
 * Возвращает [TextFieldStyle] для [TextFieldStyles]
 */
@Composable
public fun TextFieldStyles.style(modifyAction: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextFieldStyles.TextFieldDefault -> TextField.Default
        TextFieldStyles.TextFieldError -> TextField.Error
    }
    return builder.modify(modifyAction).style()
}
