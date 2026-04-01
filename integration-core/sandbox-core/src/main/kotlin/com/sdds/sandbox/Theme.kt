package com.sdds.sandbox

/**
 * Интерфейс, представляющий тему оформления в сторибуке.
 *
 * Тема объединяет все доступные компоненты и их стилевые вариации в единую
 * систему оформления. Позволяет организовать компоненты по тематическому принципу
 * и обеспечивает единый источник истины о доступных стилях для каждого компонента.
 *
 * Каждая тема должна предоставлять [ComponentProvider], который содержит
 * все компоненты, доступные в рамках данной темы, вместе с их стилевыми провайдерами.
 *
 * @see ComponentProvider
 * @see StyleProvider
 */
interface Theme {

    /**
     * Провайдер компонентов, содержащий все компоненты, доступные в данной теме.
     *
     * Обеспечивает доступ к компонентам по их ключам и хранит информацию
     * о всех доступных стилях для каждого компонента.
     */
    val components: ComponentProvider

    companion object {
        /**
         * Тема по умолчанию, используемая когда не задана конкретная тема.
         *
         * Особенности:
         * - Не содержит зарегистрированных компонентов (пустой [ComponentProvider])
         * - Служит как базовая заглушка для случаев, когда тема не требуется
         * - Может использоваться как основа для создания конкретных тем
         *
         * Пример использования:
         * ```
         * class CustomTheme : Theme {
         *     override val components = object : ComponentProvider() {
         *         override val generated: Map<ComponentKey, Component<*>> = mapOf(
         *             ButtonKey to buttonComponent
         *         )
         *     }
         * }
         * ```
         */
        val Default = object : Theme {
            override val components: ComponentProvider = object : ComponentProvider() {
                override val generated: Map<ComponentKey, Component<*>>
                    get() = emptyMap()
            }
        }
    }
}

/**
 * Возвращает набор всех доступных вариантов внешнего вида (appearance) для указанного компонента.
 *
 * Позволяет получить все зарегистрированные стилевые вариации компонента в рамках текущей темы.
 * Используется системой сторибука для построения UI выбора стиля компонента.
 *
 * @param componentKey уникальный ключ компонента
 * @return [Set] строковых идентификаторов всех доступных appearance для компонента
 *
 * @throws IllegalArgumentException если компонент с указанным ключом не найден в теме
 * @throws ClassCastException если компонент существует, но его провайдер стилей
 *         не является [StyleProvider]
 *
 * @see StyleProvider.styleProviders
 * @see Theme.components
 */
fun Theme.getAppearances(
    componentKey: ComponentKey,
): Set<String> {
    return components.get<StyleProvider<*>>(componentKey).styleProviders.keys
}

/**
 * Возвращает идентификатор appearance по умолчанию для указанного компонента.
 *
 * Определяет, какой стиль будет использоваться для компонента, если конкретный
 * appearance не указан явно. Обычно это первый зарегистрированный стиль или
 * стиль, помеченный как default в провайдере.
 *
 * @param componentKey уникальный ключ компонента
 * @return строковый идентификатор appearance по умолчанию
 *
 * @throws IllegalArgumentException если компонент с указанным ключом не найден в теме
 * @throws ClassCastException если компонент существует, но его провайдер стилей
 *         не является [StyleProvider]
 * @throws NoSuchElementException если у компонента нет зарегистрированных стилей
 *
 * @see StyleProvider.defaultAppearance
 * @see Theme.components
 */
fun Theme.getDefaultAppearance(
    componentKey: ComponentKey,
): String {
    return components.get<StyleProvider<*>>(componentKey).defaultAppearance
}
