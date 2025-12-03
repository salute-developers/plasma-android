package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastFirst
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.BaseProgress
import kotlin.math.roundToInt

@Composable
fun Slider(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    value: Float,
    onValueChange: ((Float) -> Unit),
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val state = remember(valueRange) {SliderState(value, valueRange)}
    state.value = value
    state.onValueChange = onValueChange

    SliderImpl(
        modifier = modifier,
        state = state,
        track = {
            TrackAndIndicator(
                modifier = Modifier
                    .fillMaxWidth(),
                style = style,
                fraction = state.fraction,
                interactionSource = interactionSource
            )
        },
        thumb = {
            Thumb(
                modifier = Modifier,
                style = style,
                interactionSource = interactionSource
            )
        }
    )
}


@Composable
fun Thumb(
    modifier: Modifier,
    style: SliderStyle,
    interactionSource: MutableInteractionSource,
) {
    val thumbColor = style.colors.thumbColor.colorForInteraction(interactionSource)
    Spacer(
        modifier
            .size(style.dimensions.thumbSize)
            .background(thumbColor, style.thumbShape)
    )
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

private fun Modifier.sliderGestures(state: SliderState) =
    pointerInput(state) {
        detectDragGestures(
            onDragStart = { offset ->
                state.onPress(offset)
            },
            onDrag = { change, dragAmount ->
                change.consume()
                state.onDrag(dragAmount.x)
            }
        )
    }

@Composable
private fun SliderImpl(
    modifier: Modifier,
    state: SliderState,
    track: @Composable () -> Unit,
    thumb: @Composable () -> Unit,
) {
    state.isRtl = false
    val gestures = Modifier.sliderGestures(
        state
    )
    Layout(
        content = {
            Box(modifier = Modifier.layoutId(THUMB)) {
                thumb()
            }
            Box(modifier = Modifier.layoutId(TRACK)) {
                track()
            }
        },
        modifier = modifier
            .then(gestures)
    ) { measurables, constraints ->

        val thumbPlaceable = measurables.fastFirst { it.layoutId == THUMB }
            .measure(constraints)
        val trackPlaceable = measurables.fastFirst { it.layoutId == TRACK }
            .measure(constraints.offset(
                horizontal = - thumbPlaceable.width
            ).copy(minWidth = 0, minHeight = 0)
            )

        val sliderWidth = trackPlaceable.width
        val sliderHeight = maxOf(trackPlaceable.width, thumbPlaceable.width)

        state.updateDimensions(
            thumbWidth = thumbPlaceable.width.toFloat(),
            totalWidth = sliderWidth
        )


        val thumbX = ((sliderWidth - thumbPlaceable.width) * state.fraction).roundToInt()
        val trackX = 0
        val thumbY = (sliderHeight - thumbPlaceable.height) / 2
        val trackY = (sliderHeight - trackPlaceable.height) / 2

        layout(sliderWidth, sliderHeight) {
            trackPlaceable.placeRelative(trackX, trackY)
            thumbPlaceable.placeRelative(thumbX, thumbY)
        }
    }
}

@Stable
class SliderState(
    value: Float = 0f,
    val valueRange: ClosedFloatingPointRange<Float> = 0f..1f
) {
    private var valueState by mutableFloatStateOf(value)

    var value: Float
        get() = valueState
        set(newValue) {
            valueState = newValue.coerceIn(valueRange.start, valueRange.endInclusive)
        }
    internal var onValueChange: ((Float) -> Unit)? = null

    internal var isRtl = false

    // Необработанное смещение полузнка в пикселях
    private var rawOffset by mutableFloatStateOf(0f)

    // Скорректированное смещение полузнка когда тапнули по треку
    private var pressOffset by mutableFloatStateOf(0f)

    private var thumbWidthPx by mutableFloatStateOf(0f)
    private var trackWidthPx by mutableFloatStateOf(0f)

    internal val fraction: Float
        get() = calcFraction(valueRange.start, valueRange.endInclusive, value)

    internal fun updateDimensions(thumbWidth: Float, totalWidth: Int) {
        thumbWidthPx = thumbWidth
        trackWidthPx = totalWidth.toFloat() - thumbWidth
        rawOffset = scaleToOffset(value)
    }

    internal fun onPress(pos: Offset) {
        val x = if (isRtl) {
            (thumbWidthPx + trackWidthPx) - pos.x
        } else {
            pos.x
        }
        pressOffset = x - rawOffset
        moveToRawOffset(rawOffset + pressOffset)
        pressOffset = 0f
    }

    internal fun onDrag(deltaPx: Float) {
        moveToRawOffset(rawOffset + deltaPx)
    }

    private fun scaleToOffset(v: Float) =
        lerp(
            start = 0f,
            stop = trackWidthPx,
            fraction = calcFraction(valueRange.start, valueRange.endInclusive, v)
        )

    private fun scaleToValue(px: Float) =
        lerp(
            start = valueRange.start,
            stop = valueRange.endInclusive,
            fraction = if (trackWidthPx == 0f) 0f else px / trackWidthPx
        )

    private fun moveToRawOffset(newOffset: Float) {
        val clamped = newOffset.coerceIn(0f, trackWidthPx)
        rawOffset = clamped
        value = scaleToValue(clamped)
    }

}

private fun calcFraction(start: Float, end: Float, pos: Float) =
    (if (end - start == 0f) 0f else (pos - start) / (end - start)).coerceIn(0f, 1f)

private fun lerp(start: Float, stop: Float, fraction: Float) =
    start + (stop - start) * fraction

private const val THUMB = "thumb"
private const val TRACK = "track"