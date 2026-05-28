package com.sdds.compose.uikit.internal.checkable.switch

import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.SwitchColorValues
import com.sdds.compose.uikit.SwitchDimensionValues
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.lerp
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.switcher.SwitchMotionStyle
import com.sdds.compose.uikit.motion.components.switcher.rememberSwitchMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getFloatAsState
import com.sdds.compose.uikit.motion.transition

/**
 * Базовый компонент Switch
 *
 * @param active активен ли переключатель
 * @param colors цвета
 * @param dimensions размеры и отступы
 * @param animationDuration длительность анимации
 * @param modifier модификатор
 * @param motion объект анимаций
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
    motion: Motion<SwitchMotionStyle> = rememberSwitchMotion(),
) {
    val transitionMotion = remember(animationDuration) {
        if (animationDuration == Int.MIN_VALUE) {
            motion.style.thumbPositionTransition
        } else {
            thumpPositionTransitionMotion(animationDuration)
        }
    }
    val trackColor = colors.toggleTrackBrush.getBrushAsState(
        motion.context,
        motion.style.toggleTrackColor,
    )
    val trackBorderColor = colors.toggleTrackBorderBrush.getBrushAsState(
        motion.context,
        motion.style.toggleBorderColor,
    )
    val thumbColor = colors.toggleThumbBrush.getBrushAsState(
        motion.context,
        motion.style.toggleThumbColor,
    )

    val thumbPosition = progress.getFloatAsState(motion.context, transitionMotion)
    val toggleWidth = dimensions.toggleThumbWidths.getValueAsState(motion.context)
    val toggleHeight = dimensions.toggleThumbHeights.getValueAsState(motion.context)
    val toggleThumbPadding = dimensions.toggleThumbPaddings.getValueAsState(motion.context)
    val toggleTrackBorderWidth = dimensions.toggleTrackBorderWidth.getValueAsState(motion.context)

    val trackWidth by dimensions.toggleTrackWidthValues.getValueAsState(motion.context)
    val trackHeight by dimensions.toggleTrackHeightValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .requiredWidth(trackWidth)
            .requiredHeight(trackHeight)
            .drawWithCache {
                val strokeWidth = toggleTrackBorderWidth.value.toPx()
                val trackOutline = createOutline(
                    shape = trackShape,
                    widthPx = trackWidth.toPx() - strokeWidth * 2,
                    heightPx = trackHeight.toPx() - strokeWidth * 2,
                )
                val thumbOutline = createOutline(
                    shape = thumbShape,
                    widthPx = toggleWidth.value.toPx(),
                    heightPx = toggleHeight.value.toPx(),
                )
                val trackBorderStroke = Stroke(width = strokeWidth)

                onDrawBehind {
                    translate(strokeWidth, strokeWidth) {
                        drawTrack(trackOutline, trackColor.value, trackBorderColor.value, trackBorderStroke)
                    }
                    drawThumb(
                        thumbOutline = thumbOutline,
                        thumbColor = thumbColor.value,
                        thumbPosition = thumbPosition.value,
                        toggleThumbPadding = toggleThumbPadding.value.toPx(),
                        toggleThumbWidth = toggleWidth.value.toPx(),
                        toggleThumbHeight = toggleHeight.value.toPx(),
                    )
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
    trackColor: Brush,
    trackBorderColor: Brush,
    trackBorderStroke: Stroke,
) {
    drawOutline(
        outline = trackOutline,
        brush = trackColor,
        style = Fill,
    )
    val shouldDraw = when (trackBorderColor) {
        is SolidColor -> trackBorderColor.value.alpha != 0f
        else -> true
    }
    if (shouldDraw) {
        drawOutline(
            outline = trackOutline,
            brush = trackBorderColor,
            style = trackBorderStroke,
        )
    }
}

private fun DrawScope.drawThumb(
    thumbOutline: Outline,
    thumbColor: Brush,
    thumbPosition: Float,
    toggleThumbPadding: Float,
    toggleThumbWidth: Float,
    toggleThumbHeight: Float,
) {
    val startOffset = lerp(
        toggleThumbPadding,
        size.width - toggleThumbWidth - toggleThumbPadding,
        thumbPosition,
    )
    val topOffset =
        (size.height - toggleThumbHeight) / 2f
    translate(
        left = startOffset,
        top = topOffset,
    ) {
        drawOutline(
            outline = thumbOutline,
            brush = thumbColor,
            style = Fill,
        )
    }
}

private val progress: StatefulValue<Float> = 0f.asStatefulValue(setOf(SwitchStates.Checked) to 1f)

private fun thumpPositionTransitionMotion(durationMillis: Int) = transition<Float>(
    label = "SwitchFloatTransition",
) {
    segment {
        condition { state -> state changes SwitchStates.Checked }
    } changesWith { finite(tween(durationMillis)) }

    segment {} changesWith { finite(snap()) }
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
