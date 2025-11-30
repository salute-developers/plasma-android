package com.sdds.compose.uikit

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.SliderColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.lerp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastMap
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.BaseProgress

@Composable
fun Slider(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    value: Float,
    onValueChange: ((Float) -> Unit)? = null,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    BoxWithConstraints(
        modifier = modifier
            .height(40.dp)
            .fillMaxWidth()
    ) {
        val thumbRadius = 12.dp
        val fraction = fractionToValue(value, valueRange)
        val isDragging = remember { mutableStateOf(false) }

        TrackAndIndicator(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .fillMaxWidth()
                .pointerInput(valueRange) {
                    detectTapGestures { offset ->
                        val tapFraction = (offset.x / maxWidth.toPx()).coerceIn(0f, 1f)
                        val newValue = fractionToValue(tapFraction, valueRange)
                        if (onValueChange != null) {
                            onValueChange(newValue)
                        }
                    }
                },
            style = style,
            fraction = fraction,
            interactionSource
        )
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .size(thumbRadius * 2)
                .graphicsLayer { translationX = maxWidth.toPx() * fraction - thumbRadius.toPx()}
                .background(Color.LightGray, CircleShape)
                .pointerInput(valueRange, maxWidth) {
                    detectDragGestures(
                        onDragStart = { isDragging.value = true },
                        onDragEnd = { isDragging.value = false },
                        onDragCancel = { isDragging.value = false },
                        onDrag = { change, dragAmount ->
                            change.consume()
                            val deltaFraction = dragAmount.x / maxWidth.toPx()
                            val newFraction = (fraction + deltaFraction).coerceIn(0f,1f)
                            if (onValueChange != null) {
                                onValueChange(fractionToValue(newFraction, valueRange))
                            }
                        }
                    )
                },
        )
    }
}


@Composable
private fun TrackAndIndicator(
    modifier: Modifier,
    style: SliderStyle,
    fraction: Float,
    interactionSource: MutableInteractionSource,
) {
    val trackColor = style.colors.trackColor.colorForInteraction(interactionSource)
    val indicatorColor = style.colors.indicatorColor.colorForInteraction(interactionSource)
    val indicatorBrush = style.colors.indicatorBrush?.getValue(interactionSource)

    BaseProgress(
        modifier = modifier,
        progress = fraction,
        indicatorBrush = indicatorBrush,
        indicatorColor = indicatorColor,
        backgroundBrush = null,
        backgroundColor = trackColor,
        indicatorHeight = style.dimensions.indicatorThickness,
        backgroundHeight = style.dimensions.trackThickness,
        indicatorShape = style.indicatorShape,
        backgroundShape = style.shape
    )
}

@Composable
fun SliderThumb(
    modifier: Modifier,
    radius: Dp = 12.dp,
    color: Color = Color.LightGray,
) {
    Box(
        modifier = modifier
            .size(radius * 2)
            .background(color, CircleShape)
    )
}


private fun valueToFraction(
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
): Float {
    val min = valueRange.start
    val max = valueRange.endInclusive
    if (min == max) return 0f
    return ((value - min) / (max - min)).coerceIn(0f, 1f)
}

private fun fractionToValue(
    fraction: Float,
    valueRange: ClosedFloatingPointRange<Float>,
): Float {
    val min = valueRange.start
    val max = valueRange.endInclusive
    return min + (max - min) * fraction.coerceIn(0f, 1f)
}

private fun valueToOffset(
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    trackLength: Float,
    thumbSize: Float
): Float {
    val min = valueRange.start
    val max = valueRange.endInclusive
    if (min == max) return 0f
    val available = (trackLength - thumbSize).coerceAtLeast(0f)
    if (available <= 0f) return 0f
    val frac = ((value - min) / (max - min)).coerceIn(0f, 1f)
    return frac * available
}

private fun offsetToValue(
    offset: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    trackLength: Float,
    thumbSize: Float
): Float {
    val min = valueRange.start
    val max = valueRange.endInclusive
    val available = (trackLength - thumbSize).coerceAtLeast(0f)
    if (available <= 0f) return 0f
    val frac = (offset / available).coerceIn(0f, 1f)
    return min + frac * (max - min)
}