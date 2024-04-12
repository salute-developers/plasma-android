package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.XmlFontFamilyDocumentBuilder

/**
 * Фабрика для [XmlFontFamilyDocumentBuilder]
 */
internal class XmlFontFamilyDocumentBuilderFactory {

    /**
     * Создает [XmlFontFamilyDocumentBuilder]
     */
    fun create(): XmlFontFamilyDocumentBuilder = XmlFontFamilyDocumentBuilder()
}
