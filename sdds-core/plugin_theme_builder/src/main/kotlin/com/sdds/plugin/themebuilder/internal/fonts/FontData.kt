package com.sdds.plugin.themebuilder.internal.fonts

/**
 * Данные о шрифте (font)
 *
 * @property fontName название файла шрифта без расширения
 * @property fontWeight вес шрифта
 * @property fontStyle стиль шрифта
 */
internal data class FontData(
    val fontName: String,
    val fontWeight: Int,
    val fontStyle: String,
)
