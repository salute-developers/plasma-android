package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder

/**
 * Фабрика для [XmlResourcesDocumentBuilder]
 * @property tokenPrefix префикс для названий токенов
 * @author Малышев Александр on 07.03.2024
 */
internal class XmlResourcesDocumentBuilderFactory(private val tokenPrefix: String) {

    /**
     * Создает [XmlResourcesDocumentBuilder]
     */
    fun create(): XmlResourcesDocumentBuilder = XmlResourcesDocumentBuilder(tokenPrefix)
}