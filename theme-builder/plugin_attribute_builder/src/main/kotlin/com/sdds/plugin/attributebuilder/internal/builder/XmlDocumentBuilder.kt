package com.sdds.plugin.attributebuilder.internal.builder

import com.sdds.plugin.core.builder.XmlBaseDocumentBuilder
import com.sdds.plugin.core.utils.unsafeLazy
import org.gradle.kotlin.dsl.provideDelegate
import org.w3c.dom.Element

/**
 * Билдер xml документа для списка атрибутов
 *
 * @see [XmlBaseDocumentBuilder]
 */
internal class XmlDocumentBuilder : XmlBaseDocumentBuilder() {

    override val rootContent: Element by unsafeLazy {
        document.createElement("resources")
            .apply {
                setAttribute("xmlns:tools", "http://schemas.android.com/tools")
            }
            .also { document.appendChild(it) }
    }
}
