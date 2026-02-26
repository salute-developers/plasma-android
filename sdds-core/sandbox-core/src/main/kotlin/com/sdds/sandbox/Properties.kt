package com.sdds.sandbox

import kotlinx.coroutines.flow.StateFlow

/**
 * Интерфейс владельца редактируемыми свойствами
 */
interface PropertiesOwner {

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

/**
 * Создает экземпляр [Property.SingleChoiceProperty] для свойства с заданным типом [E]
 * @param name название свойства
 * @param value значение свойства
 * @param onApply колбэк применения нового значения
 */
inline fun <reified E : Enum<E>> enumProperty(
    name: String,
    value: E,
): Property.SingleChoiceProperty {
    val values = enumValues<E>()
    return Property.SingleChoiceProperty(
        name,
        value.name,
        values.map { it.name }.toList(),
    )
}

/**
 * Базовый класс свойства
 */
sealed class Property<Value> {

    /**
     * Название свойства
     */
    abstract val name: String

    /**
     * Значение свойства
     */
    abstract val value: Value

    /**
     * Свойство с вариантом выбора
     * @property variants множество вариантов
     */
    data class SingleChoiceProperty(
        override val name: String,
        override val value: String,
        val variants: List<String>,
    ) : Property<String>()

    /**
     * Свойство типа [Boolean]
     */
    data class BooleanProperty(
        override val name: String,
        override val value: Boolean,
    ) : Property<Boolean>()

    /**
     * Свойство типа [String]
     */
    data class StringProperty(
        override val name: String,
        override val value: String,
    ) : Property<String>()

    /**
     * Свойство типа [Int]
     */
    data class IntProperty(
        override val name: String,
        override val value: Int,
    ) : Property<Int>()
}

interface PropertiesProducer<State: UiState> {

    fun getProperties(state: State): List<Property<*>>
}

interface PropertyProducer<State: UiState> {
    fun produce(state: State): Property<*>
}

interface PropertiesProducesProvider {

    fun <State: UiState> get(): PropertiesProducer<State>
}
