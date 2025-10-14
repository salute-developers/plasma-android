package com.sdds.plugin.themebuilder.internal.components

/**
 * Базовый интерфейс генераторов стилей компонентов
 */
internal interface ComponentStyleGenerator<in T : ComponentConfig> {
    fun generate(config: T): Result

    sealed class Result {

        abstract val styleName: String
        abstract val variations: Map<String, VariationReference>

        data class Compose(
            override val styleName: String,
            override val variations: Map<String, VariationReference>,
        ) : Result()

        data class Xml(
            val coreName: String,
            override val styleName: String,
            override val variations: Map<String, VariationReference>,
            val overlays: Map<String, VariationReference>,
        ) : Result()
    }
}
