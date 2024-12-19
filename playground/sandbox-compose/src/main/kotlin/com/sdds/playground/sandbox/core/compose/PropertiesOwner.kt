package com.sdds.playground.sandbox.core.compose

import kotlinx.coroutines.flow.StateFlow

/**
 * Интерфейс владельца редактируемыми свойствами
 */
internal interface PropertiesOwner {

    /**
     * Список свойств
     */
    val properties: StateFlow<List<Property<*>>>

    /**
     * Сбрасывает свойства к значениям по умолчанию
     */
    fun resetToDefault()
}
