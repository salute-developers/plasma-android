package com.sdds.sandbox

/**
 * Глобальный реестр для хранения и управления всеми историями компонентов в сторибуке.
 *
 * Выступает в роли централизованного хранилища, обеспечивающего доступ к историям
 * по их уникальным ключам. Используется системой сторибука для динамического
 * обнаружения и отображения доступных компонентов.
 *
 * Особенности:
 * - Реализован как синглтон для обеспечения единой точки доступа ко всем историям
 * - Позволяет регистрировать, получать и очищать истории
 * - Не потокобезопасен, предполагается использование в однопоточной среде
 *   (например, на этапе инициализации приложения)
 *
 * @see BaseStory
 * @see ComponentKey
 */
object StoryRegistry {

    /**
     * Записи историй, пригодных для Compose preview, по идентификатору компонента.
     * Заполняется сгенерированным кодом для историй с непустым [Story.componentId].
     */
    private val previewEntries: MutableMap<String, StoryEntry> = mutableMapOf()

    /**
     * Внутреннее хранилище зарегистрированных историй.
     *
     * Ключом является [ComponentKey] компонента, значением - соответствующая история [BaseStory].
     * Используется [mutableMapOf] для обеспечения эффективного доступа по ключу.
     */
    private val stories: MutableMap<ComponentKey, BaseStory<*>> = mutableMapOf()

    /**
     * Возвращает историю компонента по её ключу.
     *
     * @param key уникальный ключ компонента
     * @return история компонента, если она зарегистрирована, иначе null
     *
     * @see ComponentKey
     * @see BaseStory
     */
    fun get(key: ComponentKey): BaseStory<*>? {
        return stories[key]
    }

    /**
     * Регистрирует новую историю компонента в реестре.
     *
     * Если история с таким ключом уже существует, она будет перезаписана.
     * Рекомендуется использовать функцию-расширение [BaseStory.register] для более
     * идиоматичной регистрации.
     *
     * @param key уникальный ключ компонента
     * @param story история компонента для регистрации
     *
     * @see ComponentKey
     * @see BaseStory
     */
    fun register(key: ComponentKey, story: BaseStory<*>) {
        stories[key] = story
    }

    /**
     * Возвращает все зарегистрированные истории, упорядоченные по [ComponentKey.value].
     *
     * Нужно инструментам, которые сверяют набор историй с внешними данными (например, с api-метой).
     */
    fun registeredStories(): List<BaseStory<*>> = stories.values.sortedBy { it.component.value }

    /**
     * Регистрирует историю для Compose preview под идентификатором [componentId].
     *
     * Повторная регистрация с тем же идентификатором перезаписывает запись, как и [register].
     * Уникальность идентификаторов проверяется при сборке процессором `sandbox-ksp`.
     *
     * @param componentId идентификатор компонента preview (имя компонента в api-мете)
     * @param story история компонента
     * @param styleQualifiedName полное имя класса стиля, который история передаёт в `ComposeBaseStory`
     */
    fun registerPreviewEntry(componentId: String, story: BaseStory<*>, styleQualifiedName: String) {
        previewEntries[componentId] = StoryEntry(componentId, story, styleQualifiedName)
    }

    /**
     * Возвращает записи историй для Compose preview, упорядоченные по [StoryEntry.componentId].
     *
     * Порядок детерминирован и не зависит от порядка регистрации.
     */
    fun previewEntries(): List<StoryEntry> = previewEntries.values.sortedBy { it.componentId }

    /**
     * Очищает реестр, удаляя все зарегистрированные истории.
     *
     * Полезно для тестирования или при необходимости перезагрузки
     * всех историй (например, при hot-reload в разработке).
     */
    fun clear() {
        stories.clear()
        previewEntries.clear()
    }
}

/**
 * Регистрирует текущую историю в глобальном реестре.
 *
 * Функция-расширение для [BaseStory], обеспечивающая удобный и идиоматичный
 * способ регистрации истории. Использует ключ компонента [BaseStory.component]
 * в качестве идентификатора в реестре.
 *
 * Пример использования:
 * ```
 * class ButtonStory : ComposeBaseStory<ButtonState, ButtonStyle>(...) {
 *     // ... реализация
 * }
 *
 * // Где-то при инициализации:
 * ButtonStory().register()
 * ```
 *
 * @receiver история компонента, которую необходимо зарегистрировать
 *
 * @see StoryRegistry.register
 * @see BaseStory.component
 */
fun BaseStory<*>.register() {
    StoryRegistry.register(component, this)
}
