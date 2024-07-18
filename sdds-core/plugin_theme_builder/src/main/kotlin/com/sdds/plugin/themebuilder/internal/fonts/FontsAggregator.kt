package com.sdds.plugin.themebuilder.internal.fonts

/**
 * Агрегатор шрифтов.
 * Нужен для сбора данных о шрифтах и последующего использования данных в генераторе стилей типографики.
 */
internal class FontsAggregator {
    private val mutableFonts = mutableMapOf<String, Set<FontData>>()

    /**
     * Наборы данных о шрифтах (значение) для каждого семейства (ключ)
     */
    val fonts: Map<String, Set<FontData>>
        get() = mutableFonts

    /**
     * Добавляет набор данных о шрифтах [FontData] для семейства [fontFamily]
     */
    fun addFont(fontFamily: String, fonts: Set<FontData>) {
        mutableFonts[fontFamily] = fonts
    }
}
