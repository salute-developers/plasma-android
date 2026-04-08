package com.sdds.compose.uikit.graphics.brush

import androidx.compose.ui.graphics.Brush

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