package com.sdds.compose.uikit.shadow

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

/**
 * Модель описывающая слой тени
 * @property blurRadius радиус размытия краев тени
 * @property spreadRadius радиус распространения тени
 * @property offset смещение тени по оси X и Y
 * @property color цвет тени
 * @property fallbackElevation значение elevation, которое используется на API < 28
 */
@Immutable
data class ShadowLayer(
    val color: Color,
    val offset: DpOffset,
    val spreadRadius: Dp,
    val blurRadius: Dp,
    val fallbackElevation: Dp? = null,
)

/**
 * Модель, описывающая тень.
 * @property layers слои тени
 * @author Малышев Александр on 29.01.2025
 */
@Immutable
@JvmInline
value class ShadowAppearance(val layers: List<ShadowLayer> = emptyList()) {

    /**
     * Возвращает слой, который будет использоваться на API < 28
     */
    val fallbackLayer: ShadowLayer?
        get() = layers
            .maxByOrNull { it.fallbackElevation ?: 0.dp }
            ?.takeIf { it.fallbackElevation != null && it.fallbackElevation > 0.dp }
}

/**
 * Модификатор, добавляющий тень согласно [ShadowAppearance]
 * @param appearance модель, описывающая тень
 * @param shape форма тени
 */
@Stable
expect fun Modifier.shadow(
    appearance: ShadowAppearance,
    shape: Shape = RectangleShape,
): Modifier


