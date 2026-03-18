package com.sdds.testing.vs

/**
 * Состояние компонента с [variant] и [colorVariant]
 */
interface UiState : com.sdds.sandbox.UiState {
    /**
     * Опциональная цветовая вариация компонента
     */
    val colorVariant: String get() = ""

    /**
     * Создает копию текущего состояния с новым [colorVariant]
     */
    fun updateColorVariant(colorVariant: String): UiState = this
}
