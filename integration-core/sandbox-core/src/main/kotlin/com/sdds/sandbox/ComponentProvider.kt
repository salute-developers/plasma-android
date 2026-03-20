package com.sdds.sandbox

/**
 * Абстрактный провайдер компонентов, управляющий коллекцией всех доступных компонентов в теме.
 *
 * Обеспечивает централизованное хранение и доступ к компонентам по их ключам.
 * Позволяет расширять базовый набор компонентов, добавляя сгенерированные или
 * кастомные реализации. Также поддерживает автоматическое создание связанных
 * компонентов (например, Mask на основе TextField).
 *
 * @see Component
 * @see ComponentKey
 * @see StyleProvider
 */
abstract class ComponentProvider {

    /**
     * Карта сгенерированных компонентов, которые должны быть предоставлены наследниками.
     *
     * Содержит основные компоненты, явно определенные в конкретной теме.
     * Эта карта расширяется дополнительными компонентами в [components].
     *
     * @return [Map] где ключ - [ComponentKey], значение - соответствующий [Component]
     */
    abstract val generated: Map<ComponentKey, Component<*>>

    /**
     * Все доступные компоненты, включая как явно сгенерированные, так и автоматически созданные.
     *
     * Лениво инициализируемое свойство, которое:
     * 1. Включает все компоненты из [generated]
     * 2. Автоматически создает дополнительные компоненты на основе существующих
     *    (например, компонент Mask на основе стилей TextField)
     *
     * Такая структура позволяет переиспользовать стили между связанными компонентами
     * и обеспечивает единую точку доступа ко всем компонентам темы.
     *
     * @return [Map] всех компонентов с их ключами
     */
    @Suppress("UNCHECKED_CAST")
    val components: Map<ComponentKey, Component<*>> by lazy {
        mutableMapOf<ComponentKey, Component<*>>().apply {
            putAll(generated)

            // Автоматически создаем компонент Mask на основе стилей TextField,
            // если таковые существуют. Это позволяет использовать одни и те же
            // стилевые настройки для поля ввода и маски ввода.
            val textFieldStyles = generated[ComponentKey.TextField]
                ?.styleProviders
                ?: emptyMap()
            if (textFieldStyles.isNotEmpty()) {
                val maskKey = ComponentKey.Mask
                put(maskKey, Component(maskKey, textFieldStyles))
            }
        }
    }

    /**
     * Получает компонент по его ключу с приведением к указанному типу провайдера стилей.
     *
     * Операторный метод, позволяющий использовать синтаксис квадратных скобок
     * для доступа к компонентам: `provider[ComponentKey.Button]`
     *
     * @param P тип провайдера стиля ожидаемого компонента
     * @param key Ключ запрашиваемого компонента
     * @return Компонент с приведением к типу [Component]<[P]>
     *
     * @throws IllegalArgumentException если компонент с указанным ключом не найден
     * @throws ClassCastException если найденный компонент имеет несовместимый тип провайдера стилей
     *
     * Пример использования:
     * ```
     * val buttonComponent = componentProvider[ComponentKey.BasicButton]
     * val buttonStyle = buttonComponent.styleProviders["primary"]
     * ```
     */
    @Suppress("UNCHECKED_CAST")
    operator fun <P : StyleProvider<*>> get(key: ComponentKey): Component<P> {
        return components[key] as? Component<P>
            ?: throw IllegalArgumentException("No $key exists")
    }

    companion object {
        /**
         * Пустой провайдер компонентов
         */
        val Empty = object : ComponentProvider() {
            override val generated: Map<ComponentKey, Component<*>>
                get() = emptyMap()
        }
    }
}

/**
 * Утилитарные функции для работы с [ComponentProvider].
 *
 * Предоставляет удобные способы комбинирования и создания провайдеров компонентов.
 */
object ComponentProviderUtils {

    /**
     * Объединяет два провайдера компонентов в один составной провайдер.
     *
     * Результирующий провайдер будет содержать все компоненты из обоих исходных провайдеров.
     * В случае конфликта ключей компоненты из [other] имеют приоритет и перезаписывают
     * компоненты из [origin] с теми же ключами.
     *
     * @param other провайдер компонентов, который будет объединен с текущим
     * @return составной провайдер, содержащий компоненты из обоих исходных провайдеров
     *
     * Пример использования:
     * ```
     * val provider1 = components { listOf(textComponent) }
     * val provider2 = components { listOf(buttonComponent) }
     * val combinedProvider = provider1 + provider2
     * ```
     */
    operator fun ComponentProvider.plus(other: ComponentProvider): ComponentProvider =
        CompoundComponentProvider(this, other)

    /**
     * Создает [ComponentProvider] из списка компонентов, предоставленных лямбдой.
     *
     * @param body лямбда-выражение, которое возвращает список компонентов [Component]
     * @return провайдер компонентов, где каждый компонент доступен по своему ключу
     *
     * Пример использования:
     * ```
     * val provider = components {
     *   listOf(
     *     TextComponent("Привет, мир!"),
     *     ButtonComponent("Нажми меня")
     *   )
     * }
     * ```
     */
    fun components(body: () -> List<Component<*>>): ComponentProvider {
        return object : ComponentProvider() {
            override val generated: Map<ComponentKey, Component<*>> = body().associateBy { it.key }
        }
    }

    /**
     * Внутренний класс, представляющий составной провайдер компонентов.
     *
     * Объединяет два провайдера компонентов в один, обеспечивая доступ
     * ко всем компонентам из обоих источников.
     *
     * @property origin первый (оригинальный) провайдер компонентов
     * @property other второй провайдер компонентов, чьи компоненты могут перезаписывать компоненты из первого
     */
    private class CompoundComponentProvider(
        private val origin: ComponentProvider,
        private val other: ComponentProvider,
    ) : ComponentProvider() {

        /**
         * Карта сгенерированных компонентов, объединяющая компоненты из [origin] и [other].
         * Компоненты из [other] имеют приоритет при совпадении ключей.
         */
        override val generated: Map<ComponentKey, Component<*>>
            get() = origin.generated + other.generated
    }
}
