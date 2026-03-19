/**
 * Утилитарные функции для работы с [ComponentProvider].
 *
 * Предоставляет удобные способы комбинирования и создания провайдеров компонентов.
 *
 * @author ...
 * @since ...
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
