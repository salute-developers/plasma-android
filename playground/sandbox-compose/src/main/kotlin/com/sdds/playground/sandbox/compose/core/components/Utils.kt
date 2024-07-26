package com.sdds.playground.sandbox.core.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

/**
 * Dp -> Px
 * Округляет до ближайшего целого
 */
val Dp.px: Int
    @Composable
    get() = with(LocalDensity.current) { this@px.roundToPx() }

/**
 * Dp -> Px
 */
val Dp.floatPx: Float
    @Composable
    get() = with(LocalDensity.current) { this@floatPx.toPx() }

/**
 * Px -> Dp
 */
val Int.dp: Dp
    @Composable
    get() = with(LocalDensity.current) { this@dp.toDp() }

/**
 * Рассчитывает линейную интерполяцию между значениями [a] в [b]
 */
fun lerp(a: Float, b: Float, fraction: Float): Float {
    return a * (1f - fraction) + (b * fraction)
}
