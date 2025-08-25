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
    state: CodeFieldUiState? = null,
): CodeField {
    return CodeField(context.styleWrapper(style))
}