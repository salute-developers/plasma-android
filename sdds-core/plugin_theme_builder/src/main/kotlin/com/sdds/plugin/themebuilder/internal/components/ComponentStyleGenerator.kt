package com.sdds.plugin.themebuilder.internal.components

/**
 * Базовый интерфейс генераторов стилей компонентов
 */
internal interface ComponentStyleGenerator<in T : ComponentConfig> {
    fun generate(config: T)
}
