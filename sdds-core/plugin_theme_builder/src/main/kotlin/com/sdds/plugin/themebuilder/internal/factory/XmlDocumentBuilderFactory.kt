package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder

/**
 * Фабрика для [XmlDocumentBuilder]
 * @property tokenPrefix префикс для названий токенов
 * @author Малышев Александр on 07.03.2024
 */
internal class XmlDocumentBuilderFactory(private val tokenPrefix: String) {

    /**
     * Создает [XmlDocumentBuilder]
     */
    fun create(): XmlDocumentBuilder = XmlDocumentBuilder(tokenPrefix)
}
