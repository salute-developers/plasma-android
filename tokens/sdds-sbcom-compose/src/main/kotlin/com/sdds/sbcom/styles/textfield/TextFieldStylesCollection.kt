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
    TextFieldSuccess("TextField.Success"),
    TextFieldError("TextField.Error"),
    AlternativeFieldDefault("AlternativeField.Default"),
    SearchBarDefault("SearchBar.Default"),
    ;

    /**
     * Typed API для подбора стиля text-field
     */
    public object Default

    /**
     * Typed API для подбора стиля alternative-field
     */
    public object AlternativeField

    /**
     * Typed API для подбора стиля search-bar
     */
    public object SearchBar
}

/**
 * Возможные значения свойства view для text-field
 */
public enum class TextFieldDefaultView {
    Default,
    Success,
    Error,
}

/**
 * Возвращает [TextFieldStyle] для [TextFieldStyles]
 */
@Composable
public fun TextFieldStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextFieldStyles.TextFieldDefault -> TextField.Default
        TextFieldStyles.TextFieldSuccess -> TextField.Success
        TextFieldStyles.TextFieldError -> TextField.Error
        TextFieldStyles.AlternativeFieldDefault -> AlternativeField.Default
        TextFieldStyles.SearchBarDefault -> SearchBar.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field
 */
public fun TextFieldStyles.Default.resolve(view: TextFieldDefaultView): TextFieldStyles = when {
    view == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldDefault
    view == TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSuccess
    view == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldError
    else -> error("Unsupported text-field style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field
 */
@Composable
public fun TextFieldStyles.Default.style(
    view: TextFieldDefaultView,
    modify: @Composable
    TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(view).style(modify)

/**
 * Возвращает экземпляр [TextFieldStyles] для alternative-field
 */
public fun TextFieldStyles.AlternativeField.resolve(): TextFieldStyles =
    TextFieldStyles.AlternativeFieldDefault

/**
 * Возвращает [TextFieldStyle] для alternative-field
 */
@Composable
public fun TextFieldStyles.AlternativeField.style(
    modify: @Composable
    TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve().style(modify)

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
