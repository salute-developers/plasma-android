package com.sdds.plasma.sd.service.sandbox.core

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
