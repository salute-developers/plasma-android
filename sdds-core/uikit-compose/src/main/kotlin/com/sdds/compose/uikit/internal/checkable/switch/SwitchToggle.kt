package com.sdds.compose.uikit.internal.checkable.switch

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.SwitchColorValues
import com.sdds.compose.uikit.SwitchDimensionValues
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.internal.lerp

/**
 * Базовый компонент Switch
 *
 * @param active активен ли переключатель
 * @param colors цвета
 * @param dimensions размеры и отступы
 * @param animationDuration длительность анимации
 * @param modifier модификатор
 * @param interactionSource [InteractionSource]
 */
@Composable
internal fun SwitchToggle(
    active: Boolean,
    modifier: Modifier = Modifier,
    trackShape: CornerBasedShape = CircleShape,
    thumbShape: CornerBasedShape = CircleShape,
    colors: SwitchColorValues,
    dimensions: SwitchDimensionValues,
    animationDuration: Int,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val stateSet = remember(active) { if (active) setOf(SwitchStates.Checked) else emptySet() }
    val trackColor = colors.toggleTrackColor.colorForInteractionAsState(interactionSource, stateSet)
    val trackBorderColor = colors.toggleTrackBorderColor.colorForInteractionAsState(interactionSource, stateSet)
    val thumbColor = colors.toggleThumbColor.colorForInteractionAsState(interactionSource, stateSet)
    val thumbPosition by animateFloatAsState(
        targetValue = if (active) 1f else 0f,
        animationSpec = tween(durationMillis = animationDuration),
        label = "thumbPosition",
    )

    Box(
        modifier = modifier
            .requiredWidth(dimensions.toggleTrackWidth)
            .requiredHeight(dimensions.toggleTrackHeight)
            .drawWithCache {
                val trackOutline = createOutline(
                    shape = trackShape,
                    widthPx = dimensions.toggleTrackWidth.toPx(),
                    heightPx = dimensions.toggleTrackHeight.toPx(),
                )
                val thumbOutline = createOutline(
                    shape = thumbShape,
                    widthPx = dimensions.toggleThumbWidth.toPx(),
                    heightPx = dimensions.toggleThumbHeight.toPx(),
                )
                val trackBorderStroke = Stroke(width = 0f)

                onDrawBehind {
                    drawTrack(trackOutline, trackColor.value, trackBorderColor.value, trackBorderStroke)
                    drawThumb(thumbOutline, thumbColor.value, thumbPosition, dimensions)
                }
            },
    )
}

private fun CacheDrawScope.createOutline(
    shape: CornerBasedShape,
    widthPx: Float,
    heightPx: Float,
): Outline {
    return shape.createOutline(
        size = Size(
            width = widthPx,
            height = heightPx,
        ),
        layoutDirection = layoutDirection,
        density = this,
    )
}

private fun DrawScope.drawTrack(
    trackOutline: Outline,
    trackColor: Color,
    trackBorderColor: Color,
    trackBorderStroke: Stroke,
) {
    drawOutline(
        outline = trackOutline,
        color = trackColor,
        style = Fill,
    )
    if (trackBorderColor.alpha != 0f) {
        drawOutline(
            outline = trackOutline,
            color = trackBorderColor,
            style = trackBorderStroke,
        )
    }
}

private fun DrawScope.drawThumb(
    thumbOutline: Outline,
    thumbColor: Color,
    thumbPosition: Float,
    dimensions: SwitchDimensionValues,
) {
    val startOffset = lerp(
        dimensions.toggleThumbPadding.toPx(),
        size.width - dimensions.toggleThumbWidth.toPx() - dimensions.toggleThumbPadding.toPx(),
        thumbPosition,
    )
    val topOffset =
        (dimensions.toggleTrackHeight.toPx() - dimensions.toggleThumbHeight.toPx()) / 2f
    translate(
        left = startOffset,
        top = topOffset,
    ) {
        drawOutline(
            outline = thumbOutline,
            color = thumbColor,
            style = Fill,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun SwitchTogglePreview() {
    SwitchToggle(
        active = false,
        colors = SwitchColorValues.builder().build(),
        dimensions = SwitchDimensionValues
            .builder()
            .build(),
        animationDuration = 100,
    )
}
