package com.sdds.testing.vs.codeinput

import android.content.Context
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.CodeInput

/**
 * Фабрика для создания [CodeInput]
 */
fun codeInput(
    context: Context,
    style: Int? = null,
    state: CodeInputUiState = CodeInputUiState(),
): CodeInput {
    return CodeInput(context.styleWrapper(style)).applyState(state)
}

/**
 * Применяет [CodeInputUiState] к [CodeInput]
 */
fun CodeInput.applyState(state: CodeInputUiState) = apply {
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
    focusGain = state.focusGain
    charValidateBehavior = state.charValidateBehavior
    codeValidateBehavior = state.codeValidateBehavior
    isEnabled = state.enabled
}
