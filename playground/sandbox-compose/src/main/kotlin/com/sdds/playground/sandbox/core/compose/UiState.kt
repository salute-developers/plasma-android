package com.sdds.playground.sandbox.core.compose

/**
 * Состояние компонента с вариацией [variant]
 */
interface UiState {

    /**
     * Вариация компонента
     */
    val variant: String
        get() = ""

    /**
     * Внешний вид компонента
     */
    val appearance: String
        get() = ""

    /**
     * Создает копию состояния с новым [variant]
     */
    fun updateVariant(appearance: String, variant: String): UiState
}
