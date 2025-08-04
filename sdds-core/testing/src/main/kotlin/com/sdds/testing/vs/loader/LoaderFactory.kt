package com.sdds.testing.vs.loader

import android.content.Context
import androidx.annotation.StyleRes
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Loader

/**
 * Создает [Loader]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun loader(
    context: Context,
    @StyleRes style: Int? = null,
    state: LoaderUiState = LoaderUiState(),
): Loader {
    return Loader(context.styleWrapper(style))
        .applyState(state)
}

/**
 * Применяет [LoaderUiState] к [Loader]
 */
fun Loader.applyState(state: LoaderUiState) = apply {
    loaderType = state.loaderType.toType()
}
