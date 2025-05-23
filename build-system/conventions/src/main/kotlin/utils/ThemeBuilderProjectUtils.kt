package utils

import org.gradle.api.GradleException
import org.gradle.api.Project

/**
 * Возвращает версию темы или выбрасывает исключение, если версия не указана
 */
val Project.themeVersion: String
    get() = property("theme-version")?.toString()
        ?: throw GradleException("theme version must be specified")

/**
 * Возвращает версию стилей компонентов или выбрасывает исключение, если версия не указана
 */
val Project.componentsVersion: String
    get() = property("components-version")?.toString()
        ?: throw GradleException("components version must be specified")

/**
 * Возвращает адрес темы или выбрасывает исключение, если адрес не указан
 */
val Project.themeUrl: String
    get() = property("theme-url")?.toString()
        ?: throw GradleException("theme-url must be specified for ThemeBuilder to work")