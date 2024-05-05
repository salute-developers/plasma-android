package com.sdds.plugin.attributebuilder

import java.io.Serializable

/**
 * Целевой фреймворк для генерации атрибутов
 */
sealed class AttributeBuilderTarget : Serializable {

    /**
     * Сompose
     */
    class Compose : AttributeBuilderTarget()

    /**
     * View
     *
     * @property attrPrefix префикс для xml-атрибутов
     */
    data class View(val attrPrefix: String) : AttributeBuilderTarget()
}
