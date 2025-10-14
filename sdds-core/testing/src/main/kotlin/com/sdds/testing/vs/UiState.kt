package com.sdds.testing.vs

/**
 * Состояние компонента с [variant] и [colorVariant]
 */
interface UiState {

    /**
     * Внешний вид компонента
     */
    val appearance: String
        get() = ""

    /**
     * Вариация компонента
     */
    val variant: String
        get() = ""

    /**
     * Создает копию текущего состояния с новым [variant]
     */
    fun updateVariant(appearance: String = this.appearance, variant: String = this.variant): UiState

    /**
     * Опциональная цветовая вариация компонента
     */
    val colorVariant: String get() = ""

    /**
     * Создает копию текущего состояния с новым [colorVariant]
     */
    fun updateColorVariant(colorVariant: String): UiState = this
}
