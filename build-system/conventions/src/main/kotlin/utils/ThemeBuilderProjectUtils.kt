package utils

import org.gradle.api.GradleException
import org.gradle.api.Project

/**
 * Возвращает версию темы или выбрасывает исключение, если версия не указана
 */
val Project.themeVersion: String
    get() = properties["theme-version"]?.toString()
        ?: throw GradleException("theme version must be specified")

/**
 * Возвращает версию стилей компонентов или выбрасывает исключение, если версия не указана
 */
val Project.componentsVersion: String
    get() = properties["components-version"]?.toString()
        ?: throw GradleException("components version must be specified")

/**
 * Возвращает название стилей компонентов или выбрасывает исключение, если название не указано
 */
val Project.componentsName: String
    get() = properties["components-name"]?.toString()
        ?: throw GradleException("components-name must be specified for ThemeBuilder to work")

/**
 * Возвращает адрес темы или выбрасывает исключение, если адрес не указан
 */
val Project.themeUrl: String
    get() = properties["theme-url"]?.toString()
        ?: throw GradleException("theme-url must be specified for ThemeBuilder to work")

/**
 * Возвращает алиас темы или выбрасывает исключение, если алиас не указан
 */
val Project.themeAlias: String
    get() = properties["theme-alias"]?.toString()
        ?: throw GradleException("theme-alias must be specified for ThemeBuilder to work")

/**
 * Возвращает префикс ресурсов темы или выбрасывает исключение, если префикс не указан
 */
val Project.themeResPrefix: String
    get() = properties["theme-resPrefix"]?.toString()
        ?: throw GradleException("theme-resPrefix must be specified for ThemeBuilder to work")

/**
 * Возвращает название темы или выбрасывает исключение, если название не указано
 */
val Project.themeName: String
    get() = properties["theme-name"]?.toString()
        ?: throw GradleException("theme-name must be specified for ThemeBuilder to work")