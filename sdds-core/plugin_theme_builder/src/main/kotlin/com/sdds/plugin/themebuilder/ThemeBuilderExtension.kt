package com.sdds.plugin.themebuilder

import org.gradle.api.provider.Property

/**
 * Расширение для плагина ThemeBuilder
 * @author Малышев Александр on 04.03.2024
 */
interface ThemeBuilderExtension {

    /**
     * Источник для скачивания дефолтной темы
     */
    val defaultThemeSource: Property<ThemeBuilderSource>

    /**
     * Источник для скачивания темы
     */
    val themeSource: Property<ThemeBuilderSource>

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
     * Название родительской темы, от которой будет унаследована генерируемая тема
     */
    val parentThemeName: Property<String>
}
