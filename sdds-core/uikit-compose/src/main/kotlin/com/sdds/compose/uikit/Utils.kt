package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

/**
 * Dp -> Px
 * Округляет до ближайшего целого
 * @author Малышев Александр on 23.04.2024
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
