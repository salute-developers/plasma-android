package com.sdds.playground.sandbox.core.vs

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
     * Отправляет запрос на редактирование свойства [property]
     */
    fun sendEditPropertyRequest(property: Property<*>)

    /**
     * Сбрасывает свойства к значениям по умолчанию
     */
    fun resetToDefault()
}
