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
     * Целевой фреймворк для которого будет сгенерирована тема.
     * @see ThemeBuilderTarget
     */
    val target: Property<String>
}