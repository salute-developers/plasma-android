package com.sdds.uikit.fixtures.stories

import androidx.annotation.StyleRes
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ThemeManager
import com.sdds.sandbox.ViewTheme

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

/**
 * Регистрирует тему [themeRes] и компоненты [ComponentProvider]
 */
fun SandboxActivity.registerCoreTheme(
    @StyleRes themeRes: Int,
    components: ComponentProvider,
    displayName: String = "Theme",
    subThemeRes: Map<SubTheme, Int> = emptyMap(),
) {
    setTheme(themeRes)
    theme.applyStyle(com.sdds.uikit.fixtures.R.style.SddsSandboxTheme, true)
    val theme = ViewTheme(
        displayName = displayName,
        themeRes = themeRes,
        components = components,
        subThemeResources = subThemeRes,
    )
    ThemeManager.updateTheme(theme)
}
