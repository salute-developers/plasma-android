package com.sdds.playground.sandbox.core.view

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
     * Обновляет значение [value] свойства с названием [name]
     */
    fun updateProperty(name: String, value: Any?)

    /**
     * Сбрасывает свойства к значениям по умолчанию
     */
    fun resetToDefault()
}
