package com.sdds.compose.uikit.shadow

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/**
 * Модификатор, добавляющий тень согласно [ShadowAppearance]
 * @param appearance модель, описывающая тень
 * @param shape форма тени
 */
@Stable
actual fun Modifier.shadow(
    appearance: ShadowAppearance,
    shape: Shape
): Modifier {
    val layer = appearance.fallbackLayer ?: return this
    return this.shadow(layer.fallbackElevation ?: 0.dp, shape, spotColor = layer.color)
}