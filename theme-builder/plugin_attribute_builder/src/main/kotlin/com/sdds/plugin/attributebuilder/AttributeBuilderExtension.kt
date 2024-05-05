package com.sdds.plugin.attributebuilder

import org.gradle.api.provider.Property

/**
 * Расширение для плагина AttributeBuilder
 */
interface AttributeBuilderExtension {

    /**
     * Ссылка для скачивания архива с дефолтной темой
     */
    val themeUrl: Property<String>

    /**
     * Целевой фреймворк
     */
    val target: Property<AttributeBuilderTarget>
}
