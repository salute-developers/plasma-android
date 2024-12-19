@file:Suppress("ConstPropertyName")

package com.sdds.playground.sandbox.core.vs

/**
 * Создает экземпляр [Property.SingleChoiceProperty] для свойства с заданным типом [E]
 * @param name название свойства
 * @param value значение свойства
 */
internal inline fun <reified E : Enum<E>> enumProperty(
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
internal sealed class Property<Value> {

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
