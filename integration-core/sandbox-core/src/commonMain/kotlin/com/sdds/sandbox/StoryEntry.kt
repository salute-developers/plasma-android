package com.sdds.sandbox

/**
 * Запись реестра историй для Compose preview.
 *
 * @property componentId идентификатор компонента preview (имя компонента в api-мете)
 * @property story история компонента, type-erased
 * @property styleQualifiedName полное имя класса стиля, который история передаёт в `ComposeBaseStory`
 * (пустая строка, если стиль определить не удалось)
 *
 * @see StoryRegistry.previewEntries
 */
data class StoryEntry(
    val componentId: String,
    val story: BaseStory<*>,
    val styleQualifiedName: String,
)
