package com.sdds.plugin.themebuilder.internal.universal.compose

private const val BRUSH_TYPE = "androidx.compose.ui.graphics.Brush"
private const val COLOR_TYPE = "androidx.compose.ui.graphics.Color"
private const val INTERACTIVE_COLOR_TYPE = "com.sdds.compose.uikit.interactions.InteractiveColor"

/*
 * Правила выбора перегрузки метода билдера стиля. Единый источник для Theme Builder
 * (`UniversalComposeVariationGenerator`) и генератора фабрик Compose preview: копий этих правил быть не должно.
 */

/** Приоритет перегрузки не-цветового свойства: StatefulValue, затем InteractiveColor, затем обычный тип. */
internal fun ComposePropertyMeta.overloadPriority(): Int = when {
    "StatefulValue" in paramQualifiedType -> 2
    "InteractiveColor" in paramQualifiedType -> 1
    else -> 0
}

/** Приоритет перегрузки цветового свойства: StatefulValue (3), InteractiveColor (2), Color (1), Brush (0). */
internal fun ComposeColorPropertyMeta.colorOverloadPriority(): Int = when {
    "StatefulValue" in paramQualifiedType -> 3
    acceptsInteractiveColor -> 2
    acceptsColor -> 1
    acceptsBrush -> 0
    else -> -1
}

internal val ComposeColorPropertyMeta.acceptsBrush: Boolean
    get() = valueQualifiedType == BRUSH_TYPE ||
        (valueQualifiedType.isBlank() && "Brush" in paramQualifiedType)

internal val ComposeColorPropertyMeta.acceptsInteractiveColor: Boolean
    get() = valueQualifiedType == INTERACTIVE_COLOR_TYPE ||
        (valueQualifiedType.isBlank() && "InteractiveColor" in paramQualifiedType)

internal val ComposeColorPropertyMeta.acceptsColor: Boolean
    get() = valueQualifiedType == COLOR_TYPE ||
        (valueQualifiedType.isBlank() && paramQualifiedType == COLOR_TYPE)
