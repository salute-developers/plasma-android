package com.sdds.plugin.themebuilder.internal.generator.theme.view

/**
 * Модель XML-атрибута
 *
 * @property name название атрибута
 * @property formats список форматов, которые поддерживает атрибут
 */
internal data class XmlAttribute(
    val name: String,
    private val formats: List<Format>,
) {

    /**
     * Конечный формат атрибута в виде строки
     */
    val format = formats.joinToString(separator = "|") { it.format }

    /**
     * Тип формата атрибута
     */
    enum class Format(val format: String) {
        REFERENCE("reference"),
        COLOR("color"),
        DIMENSION("dimension"),
    }
}
