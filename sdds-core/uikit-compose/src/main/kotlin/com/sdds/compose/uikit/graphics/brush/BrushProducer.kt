package com.sdds.compose.uikit.graphics.brush

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isUnspecified

/**
 * Поставщик кисти.
 *
 * Используется для отложенного получения текущего экземпляра [Brush].
 */
fun interface BrushProducer {

    /**
     * Возвращает текущую кисть.
     */
    operator fun invoke(): Brush
}

/**
 * Специальный экземпляр, возвращающий неопределённую (неустановленную) кисть
 */
val Brush.Companion.Unspecified: Brush get() = UnspecifiedBrush

/**
 * Проверяет является ли эта кисть неопределеной
 */
val Brush.isUnspecified: Boolean
    get() = (this == UnspecifiedBrush) || (this as? SolidColor)?.value?.isUnspecified == true

/**
 * Проверяет является ли эта кисть определенной
 */
val Brush.isSpecified: Boolean get() = !isUnspecified

private val UnspecifiedBrush = SolidColor(Color.Unspecified)
