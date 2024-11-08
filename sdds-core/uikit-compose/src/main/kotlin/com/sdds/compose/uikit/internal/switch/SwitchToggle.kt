package com.sdds.compose.uikit.internal.switch

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import com.sdds.compose.uikit.SwitchColors
import com.sdds.compose.uikit.SwitchDimensions
import com.sdds.compose.uikit.internal.lerp

/**
 * Базовый компонент Switch
 *
 * @param active активен ли переключатель
 * @param colors цвета
 * @param dimensions размеры и отступы
 * @param animationDuration длительность анимации
 * @param modifier модификатор
 * @param enabled доступен ли переключатель
 * @param interactionSource [InteractionSource]
 */
@Composable
internal fun SwitchToggle(
    active: Boolean,
    colors: SwitchColors,
    dimensions: SwitchDimensions,
    animationDuration: Int,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val trackColor by colors.trackColor(enabled = enabled, active = active, interactionSource)
    val thumbPosition by animateFloatAsState(
        targetValue = if (active) 1f else 0f,
        animationSpec = tween(durationMillis = animationDuration),
        label = "thumbPosition",
    )

    Canvas(
        modifier = modifier
            .requiredSize(dimensions.toggleWidth, dimensions.toggleHeight),
    ) {
        val thumbRadius = dimensions.thumbDiameter.toPx() / 2

        // Рисуем track
        drawRoundRect(
            color = trackColor,
            cornerRadius = CornerRadius(dimensions.trackCornerRadius.toPx()),
        )

        // Рисуем thumb
        drawCircle(
            color = colors.thumbColor,
            radius = thumbRadius,
            center = Offset(
                x = lerp(
                    dimensions.togglePadding.toPx() + thumbRadius,
                    size.width - thumbRadius - dimensions.togglePadding.toPx(),
                    thumbPosition,
                ),
                y = size.center.y,
            ),
        )
    }
}
