package com.sdds.compose.uikit.shadow

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Stable

/**
 * Рассчитывает отступы, необходимые для корректного отображения тени
 */
@Stable
internal fun ShadowAppearance.getShadowSafePaddings(): PaddingValues {
    val shadow = this
    if (shadow.layers.isEmpty()) return PaddingValues()
    val biggestLayer = shadow.layers.maxBy { it.spreadRadius }
    val radius = biggestLayer.spreadRadius + biggestLayer.blurRadius
    val left = radius - biggestLayer.offset.x
    val right = radius + biggestLayer.offset.x
    val top = radius - biggestLayer.offset.y
    val bottom = radius + biggestLayer.offset.y
    return PaddingValues(
        start = left,
        end = right,
        top = top,
        bottom = bottom,
    )
}
