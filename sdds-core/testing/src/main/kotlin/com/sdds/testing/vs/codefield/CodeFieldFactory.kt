package com.sdds.testing.vs.codefield

import android.content.Context
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.CodeField

/**
 * Фабрика для создания [CodeField]
 */
fun codeField(
    context: Context,
    style: Int? = null,
    state: CodeFieldUiState = CodeFieldUiState(),
): CodeField {
    return CodeField(context.styleWrapper(style)).applyState(state)
}

/**
 * Применяет [CodeFieldUiState] к [CodeField]
 */
fun CodeField.applyState(state: CodeFieldUiState) = apply {
    onCharValidate = { it != state.errorItem }
    val oldLength = codeLength
    if (oldLength != state.codeLength) {
        codeLength = state.codeLength
    }
    val validCode = buildString { repeat(state.codeLength) { append(it + 1) } }
    onCodeComplete = { code ->
        code == validCode
    }
    captionText = state.caption
    setCaptionAlignment(state.captionAlignment)
    hidden = state.hidden
}
