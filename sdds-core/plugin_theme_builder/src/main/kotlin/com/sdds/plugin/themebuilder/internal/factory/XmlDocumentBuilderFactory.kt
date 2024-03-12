package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder

/**
 * Фабрика для [XmlDocumentBuilder]
 * @author Малышев Александр on 07.03.2024
 */
internal object XmlDocumentBuilderFactory {

    /**
     * Создает [XmlDocumentBuilder]
     */
    fun create(): XmlDocumentBuilder = XmlDocumentBuilder()
}
