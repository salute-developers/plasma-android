package com.sdds.preview.compose

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.uikit.ImageSource

/**
 * Приводит имя иконки из конфигурации компонента (`disclosure.down.fill.16`) к имени члена `SddsIcons`
 * (`DisclosureDownFill16`): имя делится по `.`, `-` и `_`, каждая часть пишется с заглавной буквы.
 */
public fun iconMemberName(name: String): String =
    name.split('.', '-', '_')
        .filter { it.isNotEmpty() }
        .joinToString("") { part -> part.replaceFirstChar { it.uppercaseChar() } }

/**
 * Иконки, которые плагин умеет рисовать по имени. Ключ — имя члена `SddsIcons`; векторы создаются по требованию.
 */
public class PreviewIconRegistry(private val vectors: Map<String, () -> ImageVector> = emptyMap()) {

    /** Известна ли иконка с именем [name] (в формате конфигурации). */
    public fun contains(name: String): Boolean = iconMemberName(name) in vectors

    /** Возвращает [ImageSource] иконки либо `null`, если её нет в реестре. */
    public fun find(name: String): ImageSource? {
        val vector = vectors[iconMemberName(name)] ?: return null
        return ImageSource { rememberVectorPainter(vector()) }
    }
}
