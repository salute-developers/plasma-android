package com.sdds.uikit.utils

import com.google.android.material.resources.TextAppearanceConfig

/**
 * Утилита, позволяющая включить синхронную загрузку шрифтов.
 * Полезно в инструментальных тестах.
 */
object TextAppearanceConfig {

    /**
     * Включает/выключает синхронную загрузку шрифтов.
     */
    var shouldLoadFontSynchronously: Boolean
        get() = TextAppearanceConfig.shouldLoadFontSynchronously()
        set(value) {
            TextAppearanceConfig.setShouldLoadFontSynchronously(value)
        }
}
