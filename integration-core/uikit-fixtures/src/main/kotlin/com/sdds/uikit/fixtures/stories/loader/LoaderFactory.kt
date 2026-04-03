package com.sdds.uikit.fixtures.stories.loader

import android.content.Context
import androidx.annotation.StyleRes
import com.sdds.uikit.Loader
import com.sdds.uikit.fixtures.styleWrapper

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
