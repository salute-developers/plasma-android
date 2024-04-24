package com.sdds.plugin.themebuilder

import org.gradle.api.provider.Property

/**
 * Расширение для плагина ThemeBuilder
 * @author Малышев Александр on 04.03.2024
 */
interface ThemeBuilderExtension {

    /**
     * Путь к файлу с темой
     */
    val themeUrl: Property<String>

    /**
     * Название пакета для генерируемых файлов kotlin
     */
    val packageName: Property<String>

    /**
     * Целевой фреймворк для которого будет сгенерирована тема.
     * @see ThemeBuilderTarget
     */
    val target: Property<ThemeBuilderTarget>

    /**
     * Префикс для названий ресурсов токенов
     */
    val resourcesPrefix: Property<String>

    /**
     * Префикс атрибутов родительской темы
     */
    val parentThemePrefix: Property<String>

    /**
     * Название родительской темы, от которой будет унаследована генерируемая тема
     */
    val parentThemeName: Property<String>
}
