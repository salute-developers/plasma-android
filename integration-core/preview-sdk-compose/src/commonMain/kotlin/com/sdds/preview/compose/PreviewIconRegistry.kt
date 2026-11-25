package com.sdds.preview.compose

import com.sdds.compose.uikit.ImageSource

/**
 * Иконки, которые плагин умеет рисовать по имени из конфигурации компонента (`disclosure.down.fill.16`).
 * Набор не вшит в плагин: иконки приходят SVG-ресурсами payload (`icon:<имя>`, см. [ICON_ASSET_PREFIX]) и
 * загружаются на каждый render, поэтому размер плагина не зависит от числа иконок.
 */
public class PreviewIconRegistry(private val sources: Map<String, ImageSource> = emptyMap()) {

    /** Тот же реестр с иконками [extra]: ключ — имя иконки в формате конфигурации. */
    public fun withSources(extra: Map<String, ImageSource>): PreviewIconRegistry =
        if (extra.isEmpty()) this else PreviewIconRegistry(sources + extra)

    /** Известна ли иконка с именем [name] (в формате конфигурации). */
    public fun contains(name: String): Boolean = name in sources

    /** Возвращает [ImageSource] иконки либо `null`, если её нет в реестре. */
    public fun find(name: String): ImageSource? = sources[name]
}
