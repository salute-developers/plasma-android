package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.core.builder.XmlBaseDocumentBuilder
import com.sdds.plugin.core.utils.unsafeLazy
import org.w3c.dom.Element

/**
 * Билдер xml документа для font-family
 */
internal open class XmlFontFamilyDocumentBuilder : XmlBaseDocumentBuilder() {

    override val rootContent: Element by unsafeLazy {
        document.createElement("font-family")
            .apply { setAttribute("xmlns:app", "http://schemas.android.com/apk/res-auto") }
            .also { document.appendChild(it) }
    }

    /**
     * Добавляет элемент font в font-family
     */
    fun appendFontElement(
        fontStyle: String,
        fontWeight: String,
        font: String,
    ) {
        appendBaseElement(
            elementName = "font",
            attrs = mapOf(
                "app:fontStyle" to fontStyle,
                "app:fontWeight" to fontWeight,
                "app:font" to "@font/$font",
            ),
        )
    }
}
