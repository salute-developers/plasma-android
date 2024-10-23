package com.sdds.compose.uikit.style

/**
 * Интерфейс-маркер стиля компонента
 * @author Малышев Александр on 22.10.2024
 */
interface Style

/**
 * Builder стиля компонента
 */
interface StyleBuilder<T : Style> {

    /**
     * Возвращает экземпляр [Style]
     */
    fun style(): T
}
