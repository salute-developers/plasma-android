// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.codeinput

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.CodeInputStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CodeInput
 */
public enum class CodeInputStyles(
    public val key: String,
) {
    CodeInputS("CodeInput.S"),
    CodeInputM("CodeInput.M"),
    CodeInputL("CodeInput.L"),
    ;

    /**
     * Typed API для подбора стиля code-input
     */
    public companion object
}

/**
 * Возможные значения свойства size для code-input
 */
public enum class CodeInputSize {
    S,
    M,
    L,
}

/**
 * Возвращает [CodeInputStyle] для [CodeInputStyles]
 */
@Composable
public fun CodeInputStyles.style(modify: @Composable CodeInputStyleBuilder.() -> Unit = {}): CodeInputStyle {
    val builder = when (this) {
        CodeInputStyles.CodeInputS -> CodeInput.S
        CodeInputStyles.CodeInputM -> CodeInput.M
        CodeInputStyles.CodeInputL -> CodeInput.L
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CodeInputStyles] для code-input
 */
public fun CodeInputStyles.Companion.resolve(size: CodeInputSize = CodeInputSize.S): CodeInputStyles = when {
    size == CodeInputSize.S -> CodeInputStyles.CodeInputS
    size == CodeInputSize.M -> CodeInputStyles.CodeInputM
    size == CodeInputSize.L -> CodeInputStyles.CodeInputL
    else -> error("Unsupported code-input style combination")
}

/**
 * Возвращает [CodeInputStyle] для code-input
 */
@Composable
public fun CodeInputStyles.Companion.style(
    size: CodeInputSize = CodeInputSize.S,
    modify: @Composable CodeInputStyleBuilder.() -> Unit = {},
): CodeInputStyle =
    resolve(size).style(modify)
