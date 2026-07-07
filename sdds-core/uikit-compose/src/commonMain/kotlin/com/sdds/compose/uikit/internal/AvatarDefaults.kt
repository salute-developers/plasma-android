package com.sdds.compose.uikit.internal

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Дефолтные значения для Avatar и AvatarGroup
 * @author Малышев Александр on 24.07.2024
 */
internal object AvatarDefaults {
    const val DefaultThreshold = 3
    const val BackgroundOpacity: Float = 0.2f
    val DefaultItemOffset = 20.dp
    val DefaultItemSpacing = 2.dp

    val defaultBrush: Brush = Brush.linearGradient(
        0f to Color(0xFF000000),
        1f to Color(0xFF04C6C9),
        start = Offset(0f, Float.POSITIVE_INFINITY),
        end = Offset(Float.POSITIVE_INFINITY, 0f),
    )

    val defaultBackground: List<Brush> = listOf(defaultBrush)

    val DefaultScrimColor = Color(0x8F080808)
}
