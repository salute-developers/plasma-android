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
    SearchBarDefault("SearchBar.Default"),
    ;

    /**
     * Typed API для подбора стиля text-field
     */
    public object Default

    /**
     * Typed API для подбора стиля search-bar
     */
    public object SearchBar
}

/**
 * Возвращает [TextFieldStyle] для [TextFieldStyles]
 */
@Composable
public fun TextFieldStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextFieldStyles.TextFieldDefault -> TextField.Default
        TextFieldStyles.SearchBarDefault -> SearchBar.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field
 */
public fun TextFieldStyles.Default.resolve(): TextFieldStyles = TextFieldStyles.TextFieldDefault

/**
 * Возвращает [TextFieldStyle] для text-field
 */
@Composable
public fun TextFieldStyles.Default.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}):
    TextFieldStyle = resolve().style(modify)

/**
 * Возвращает экземпляр [TextFieldStyles] для search-bar
 */
public fun TextFieldStyles.SearchBar.resolve(): TextFieldStyles = TextFieldStyles.SearchBarDefault

/**
 * Возвращает [TextFieldStyle] для search-bar
 */
@Composable
public fun TextFieldStyles.SearchBar.style(
    modify: @Composable TextFieldStyleBuilder.() -> Unit =
        {},
): TextFieldStyle = resolve().style(modify)
