package com.sdds.preview.generator

private const val BRUSH_TYPE = "androidx.compose.ui.graphics.Brush"
private const val COLOR_TYPE = "androidx.compose.ui.graphics.Color"
private const val INTERACTIVE_COLOR_TYPE = "com.sdds.compose.uikit.interactions.InteractiveColor"

internal val ParamMeta.isStateful: Boolean get() = "StatefulValue" in paramQualifiedType

internal val ParamMeta.acceptsBrush: Boolean
    get() = valueQualifiedType == BRUSH_TYPE || (valueQualifiedType.isBlank() && "Brush" in paramQualifiedType)

internal val ParamMeta.acceptsInteractiveColor: Boolean
    get() = valueQualifiedType == INTERACTIVE_COLOR_TYPE ||
        (valueQualifiedType.isBlank() && "InteractiveColor" in paramQualifiedType)

internal val ParamMeta.acceptsColor: Boolean
    get() = valueQualifiedType == COLOR_TYPE || (valueQualifiedType.isBlank() && paramQualifiedType == COLOR_TYPE)

/**
 * Приоритет перегрузки не-цветового свойства: StatefulValue, затем InteractiveColor, затем обычный тип.
 * Правило совпадает с `overloadPriority` Theme Builder (`UniversalComposeVariationGenerator`).
 */
internal fun ParamMeta.overloadPriority(): Int = when {
    isStateful -> 2
    "InteractiveColor" in paramQualifiedType -> 1
    else -> 0
}

/** Приоритет перегрузки цветового свойства: StatefulValue (3), InteractiveColor (2), Color (1), Brush (0). */
internal fun ParamMeta.colorOverloadPriority(): Int = when {
    isStateful -> 3
    acceptsInteractiveColor -> 2
    acceptsColor -> 1
    acceptsBrush -> 0
    else -> -1
}

/** Перегрузка для свойства, чьё значение не градиент: [colorOverloadPriority] среди всех перегрузок. */
internal fun List<ParamMeta>.selectSolidColorOverload(): ParamMeta =
    maxByOrNull { it.colorOverloadPriority() } ?: first()

/**
 * Перегрузка для свойства, чьё значение (или значение одного из состояний) градиент: только перегрузки с `Brush`,
 * иначе `null`. Совпадает с `requiresBrush` в `selectOverload` Theme Builder.
 */
internal fun List<ParamMeta>.selectBrushOverload(): ParamMeta? =
    filter { it.acceptsBrush }.maxByOrNull { it.colorOverloadPriority() }

/** Перегрузка не-цветового свойства. */
internal fun List<ParamMeta>.selectOverload(): ParamMeta = maxByOrNull { it.overloadPriority() } ?: first()
