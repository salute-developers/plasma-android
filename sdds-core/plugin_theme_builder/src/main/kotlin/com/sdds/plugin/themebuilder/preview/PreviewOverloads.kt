package com.sdds.plugin.themebuilder.preview

import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeColorPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeDimensionPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeShapePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeTypographyPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.acceptsBrush
import com.sdds.plugin.themebuilder.internal.universal.compose.colorOverloadPriority
import com.sdds.plugin.themebuilder.internal.universal.compose.overloadPriority

/*
 * Выбор перегрузки для генератора фабрик preview. Приоритеты и признаки берутся из `OverloadRules.kt`, общего с
 * Theme Builder. В отличие от Theme Builder значение приходит только во время работы, поэтому генератор
 * порождает вызовы и для сплошного цвета, и для градиента.
 */

internal val ComposePropertyMeta.isStateful: Boolean get() = "StatefulValue" in paramQualifiedType

/** Тип значения перегрузки; сохраняется меткой только у цвета, размера, типографики и формы. */
internal val ComposePropertyMeta.previewValueType: String
    get() = when (this) {
        is ComposeColorPropertyMeta -> valueQualifiedType
        is ComposeDimensionPropertyMeta -> valueQualifiedType
        is ComposeTypographyPropertyMeta -> valueQualifiedType
        is ComposeShapePropertyMeta -> valueQualifiedType
        else -> ""
    }

/** Перегрузка не-цветового свойства. */
internal fun List<ComposePropertyMeta>.selectPreviewOverload(): ComposePropertyMeta =
    maxByOrNull { it.overloadPriority() } ?: first()

/** Перегрузка для свойства, чьё значение не градиент: [colorOverloadPriority] среди всех перегрузок. */
internal fun List<ComposeColorPropertyMeta>.selectSolidColorOverload(): ComposeColorPropertyMeta =
    maxByOrNull { it.colorOverloadPriority() } ?: first()

/** Перегрузка для свойства, чьё значение градиент: только перегрузки с `Brush`, иначе `null`. */
internal fun List<ComposeColorPropertyMeta>.selectBrushOverload(): ComposeColorPropertyMeta? =
    filter { it.acceptsBrush }.maxByOrNull { it.colorOverloadPriority() }
