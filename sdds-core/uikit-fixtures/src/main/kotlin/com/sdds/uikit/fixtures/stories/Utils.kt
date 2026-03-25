package com.sdds.uikit.fixtures.stories

import com.sdds.compose.sandbox.ui.SandboxActivity

/**
 * Регистрирует все основные (core) истории компонентов в текущей SandboxActivity.
 *
 * Функция-расширение для [SandboxActivity], которая вызывает [registerStories]
 * для инициализации и регистрации всех стандартных историй компонентов
 * в глобальном реестре [StoryRegistry].
 *
 * Должна вызываться на этапе инициализации активности, обычно в [onCreate],
 * чтобы все истории были доступны для отображения в сторибуке.
 *
 * Пример использования:
 * ```
 * class MainActivity : SandboxActivity() {
 *     override fun onCreate(savedInstanceState: Bundle?) {
 *         super.onCreate(savedInstanceState)
 *         registerCoreStories() // Регистрируем все стандартные истории
 *     }
 * }
 * ```
 *
 * @see SandboxActivity
 * @see StoryRegistry
 * @see BaseStory.register
 */
fun SandboxActivity.registerCoreStories() {
    registerStories()
}
