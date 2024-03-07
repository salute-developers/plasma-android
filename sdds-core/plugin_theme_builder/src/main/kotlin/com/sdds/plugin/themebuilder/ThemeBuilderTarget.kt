package com.sdds.plugin.themebuilder

import org.gradle.api.provider.Property

/**
 * Целевой фреймворк для которого будет сгенерирована тема.
 * @property value название фреймворка
 * @author Малышев Александр on 04.03.2024
 */
enum class ThemeBuilderTarget(val value: String) {
    VIEW_SYSTEM("vs"), COMPOSE("compose"), ALL("all");

    companion object {

        /**
         * Возвращает [ThemeBuilderTarget] из [property]
         */
        fun ThemeBuilderTarget.fromProperty(property: Property<String>): ThemeBuilderTarget {
            return when (property.get()) {
                "vs" -> VIEW_SYSTEM
                "compose" -> COMPOSE
                else -> ALL
            }
        }
    }
}