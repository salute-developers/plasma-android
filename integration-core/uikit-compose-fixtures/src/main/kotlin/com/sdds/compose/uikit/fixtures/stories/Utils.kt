package com.sdds.compose.uikit.fixtures.stories

/**
 * Регистрирует все основные (core) истории компонентов.
 *
 * Функция вызывает [registerStories] для инициализации и регистрации всех стандартных историй компонентов
 * в глобальном реестре.
 *
 * Должна вызываться до отрисовки sandbox UI, чтобы все истории были доступны для отображения в сторибуке.
 *
 * Пример использования:
 * ```
 * registerCoreStories()
 * ```
 *
 * @see registerStories
 */
fun registerCoreStories() {
    registerStories()
}
