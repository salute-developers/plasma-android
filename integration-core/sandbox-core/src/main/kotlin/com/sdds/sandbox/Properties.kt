package com.sdds.sandbox

import kotlinx.coroutines.flow.StateFlow

/**
 * Интерфейс владельца редактируемыми свойствами в панели управления сторибука.
 *
 * Предоставляет доступ к списку настраиваемых свойств и методы для их изменения.
 * Реализуется компонентами, которые хотят предоставить возможность динамической
 * настройки своего состояния через интерфейс пользователя.
 *
 * @see PropertiesOwner.properties
 * @see PropertiesOwner.updateProperty
 * @see PropertiesOwner.resetToDefault
 */
interface PropertiesOwner {

    /**
     * Поток списка свойств, доступных для редактирования.
     *
     * Наблюдение за этим потоком позволяет UI панели управления автоматически
     * обновляться при изменении состава или значений свойств.
     *
     * @return [StateFlow] эмитирующий актуальный список свойств [Property]
     */
    val properties: StateFlow<List<Property<*>>>

    /**
     * Обновляет значение свойства с указанным именем.
     *
     * Вызывается панелью управления при взаимодействии пользователя с элементами
     * управления. Должен применяться к соответствующему свойству и приводить к
     * обновлению состояния компонента.
     *
     * @param name название свойства (соответствует полю в классе состояния)
     * @param value новое значение свойства
     */
    fun updateProperty(name: String, value: Any?)

    /**
     * Сбрасывает все свойства к значениям по умолчанию.
     *
     * Полезно для возврата компонента в исходное состояние после экспериментов
     * с настройками в панели управления.
     */
    fun resetToDefault()
}

/**
 * Создает экземпляр [Property.SingleChoiceProperty] для перечисляемого типа (enum).
 *
 * Упрощает создание свойства с выбором из предопределенных значений на основе
 * перечисления Kotlin. Автоматически извлекает все возможные значения enum
 * и предоставляет их как варианты выбора.
 *
 * @param E тип перечисления, для которого создается свойство
 * @param name название свойства, отображаемое в панели управления
 * @param value текущее значение свойства (элемент перечисления)
 * @return [Property.SingleChoiceProperty] с именем, строковым значением и списком вариантов
 *
 * Пример использования:
 * ```
 * enum class ButtonVariant { PRIMARY, SECONDARY, OUTLINE }
 *
 * val variantProperty = enumProperty("Вариант", ButtonVariant.PRIMARY)
 * ```
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
 * Базовый запечатанный класс для всех типов свойств, отображаемых в панели управления.
 *
 * Определяет структуру свойства с именем и значением, а также предоставляет
 * конкретные реализации для различных типов данных, поддерживаемых сторибуком.
 *
 * @param Value тип значения свойства
 *
 * @see Property.SingleChoiceProperty
 * @see Property.BooleanProperty
 * @see Property.StringProperty
 * @see Property.IntProperty
 */
sealed class Property<Value> {

    /**
     * Название свойства, отображаемое в панели управления.
     * Должно соответствовать имени поля в классе состояния.
     */
    abstract val name: String

    /**
     * Текущее значение свойства.
     */
    abstract val value: Value

    /**
     * Свойство с выбором одного значения из предопределенного списка.
     *
     * Используется для свойств, которые могут принимать ограниченный набор
     * значений, например, варианты кнопки или типы выравнивания.
     *
     * @property name название свойства
     * @property value текущее выбранное значение (строковое представление)
     * @property variants список всех доступных вариантов выбора
     */
    data class SingleChoiceProperty(
        override val name: String,
        override val value: String,
        val variants: List<String>,
    ) : Property<String>()

    /**
     * Свойство булевого типа (флаг).
     *
     * Отображается в панели управления как переключатель (checkbox/toggle).
     *
     * @property name название свойства
     * @property value текущее значение true/false
     */
    data class BooleanProperty(
        override val name: String,
        override val value: Boolean,
    ) : Property<Boolean>()

    /**
     * Свойство строкового типа.
     *
     * Отображается в панели управления как текстовое поле ввода.
     *
     * @property name название свойства
     * @property value текущее строковое значение
     */
    data class StringProperty(
        override val name: String,
        override val value: String,
    ) : Property<String>()

    /**
     * Свойство целочисленного типа.
     *
     * Отображается в панели управления как поле для ввода числа
     * или слайдер (в зависимости от реализации UI).
     *
     * @property name название свойства
     * @property value текущее целочисленное значение
     */
    data class IntProperty(
        override val name: String,
        override val value: Int,
    ) : Property<Int>()
}

/**
 * Провайдер, генерирующий список свойств на основе состояния компонента.
 *
 * Отвечает за динамическое создание свойств для панели управления на основе
 * текущего состояния компонента. Обычно использует рефлексию или явное описание
 * для сбора полей, помеченных аннотацией [StoryProperty].
 *
 * @param State тип состояния, должен реализовывать [UiState]
 */
interface PropertiesProducer<State : UiState> {

    /**
     * Возвращает список свойств для указанного состояния.
     *
     * @param state текущее состояние компонента
     * @return список свойств [Property] для отображения в панели управления
     */
    fun getProperties(state: State): List<Property<*>>
}

/**
 * Провайдер одного конкретного свойства.
 *
 * Используется для декомпозиции создания свойств, позволяя определять
 * логику генерации для каждого свойства отдельно.
 *
 * @param State тип состояния, должен реализовывать [UiState]
 */
interface PropertyProducer<State : UiState> {

    /**
     * Создает свойство на основе текущего состояния.
     *
     * @param state текущее состояние компонента
     * @return сгенерированное свойство [Property]
     */
    fun produce(state: State): Property<*>
}

/**
 * Провайдер, предоставляющий доступ к [PropertiesProducer].
 *
 * Интерфейс-маркер для компонентов, которые могут предоставить
 * провайдер свойств. Используется системой сторибука для получения
 * механизма генерации свойств от компонента.
 */
interface PropertiesProducesProvider {

    /**
     * Возвращает провайдер свойств для указанного типа состояния.
     *
     * @param State тип состояния, для которого запрашивается провайдер
     * @return [PropertiesProducer] для работы со свойствами компонента
     */
    fun <State : UiState> get(): PropertiesProducer<State>
}
