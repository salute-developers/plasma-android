// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.codefield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.CodeFieldStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CodeField
 */
public enum class CodeFieldStyles(
    public val key: String,
) {
    CodeFieldL("CodeField.L"),
    CodeFieldLSegmented("CodeField.L.Segmented"),
    CodeFieldM("CodeField.M"),
    CodeFieldMSegmented("CodeField.M.Segmented"),
    ;

    /**
     * Typed API для подбора стиля code-field
     */
    public companion object
}

/**
 * Возможные значения свойства size для code-field
 */
public enum class CodeFieldSize {
    L,
    M,
}

/**
 * Возможные значения свойства shape для code-field
 */
public enum class CodeFieldShape {
    Segmented,
}

/**
 * Возвращает [CodeFieldStyle] для [CodeFieldStyles]
 */
@Composable
public fun CodeFieldStyles.style(modify: @Composable CodeFieldStyleBuilder.() -> Unit = {}): CodeFieldStyle {
    val builder = when (this) {
        CodeFieldStyles.CodeFieldL -> CodeField.L
        CodeFieldStyles.CodeFieldLSegmented -> CodeField.L.Segmented
        CodeFieldStyles.CodeFieldM -> CodeField.M
        CodeFieldStyles.CodeFieldMSegmented -> CodeField.M.Segmented
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CodeFieldStyles] для code-field
 */
public fun CodeFieldStyles.Companion.resolve(
    size: CodeFieldSize = CodeFieldSize.L,
    shape: CodeFieldShape = CodeFieldShape.Segmented,
): CodeFieldStyles = when {
    size == CodeFieldSize.L && shape == CodeFieldShape.Segmented ->
        CodeFieldStyles.CodeFieldLSegmented
    size == CodeFieldSize.M && shape == CodeFieldShape.Segmented ->
        CodeFieldStyles.CodeFieldMSegmented
    size == CodeFieldSize.L -> CodeFieldStyles.CodeFieldL
    size == CodeFieldSize.M -> CodeFieldStyles.CodeFieldM
    else -> error("Unsupported code-field style combination")
}

/**
 * Возвращает [CodeFieldStyle] для code-field
 */
@Composable
public fun CodeFieldStyles.Companion.style(
    size: CodeFieldSize = CodeFieldSize.L,
    shape: CodeFieldShape = CodeFieldShape.Segmented,
    modify: @Composable CodeFieldStyleBuilder.() -> Unit = {},
): CodeFieldStyle = resolve(size, shape).style(modify)
