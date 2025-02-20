package com.sdds.playground.sandbox.core.compose

/**
 * Состояние компонента с вариацией [variant]
 */
interface UiState {

    /**
     * Вариация компонента
     */
    val variant: String

    /**
     * Создает копию состояния с новым [variant]
     */
    fun updateVariant(variant: String): UiState
}
