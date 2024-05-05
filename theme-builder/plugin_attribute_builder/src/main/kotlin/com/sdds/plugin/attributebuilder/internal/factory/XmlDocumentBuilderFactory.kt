package com.sdds.plugin.attributebuilder.internal.factory

import com.sdds.plugin.attributebuilder.internal.builder.XmlDocumentBuilder

/**
 * Фабрика для [XmlDocumentBuilder]
 */
internal class XmlDocumentBuilderFactory {

    /**
     * Создает [XmlDocumentBuilder]
     */
    fun create(): XmlDocumentBuilder = XmlDocumentBuilder()
}
