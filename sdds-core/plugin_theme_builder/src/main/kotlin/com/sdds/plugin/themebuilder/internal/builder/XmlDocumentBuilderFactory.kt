package com.sdds.plugin.themebuilder.internal.builder

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
object XmlDocumentBuilderFactory {


    fun create(rootElement: String): XmlDocumentBuilder =
        XmlDocumentBuilder(rootElement)
}