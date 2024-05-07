package com.sdds.plugin.themebuilder.internal.attributes.data

/**
 * Модель со списком всех атрибутов по категориям
 */
internal data class AttributeData(
    val colors: List<String> = emptyList(),
    val gradients: List<String> = emptyList(),
    val shapes: List<String> = emptyList(),
    val shadows: List<String> = emptyList(),
    val fonts: List<String> = emptyList(),
    val typography: List<String> = emptyList(),
)
