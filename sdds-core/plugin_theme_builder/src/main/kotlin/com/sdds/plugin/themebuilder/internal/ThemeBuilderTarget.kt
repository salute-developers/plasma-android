package com.sdds.plugin.themebuilder.internal

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

        /**
         * Возвращает true если текущий таргет - Compose или все фреймворки
         */
        val ThemeBuilderTarget.isComposeOrAll: Boolean
            get() = this == COMPOSE || this == ALL

        /**
         * Возвращает true если текущий таргет - ViewSystem или все фреймворки
         */
        val ThemeBuilderTarget.isViewSystemOrAll: Boolean
            get() = this == VIEW_SYSTEM || this == ALL
    }
}
