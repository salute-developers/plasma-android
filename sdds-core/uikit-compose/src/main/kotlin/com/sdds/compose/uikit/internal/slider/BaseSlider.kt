package com.sdds.compose.uikit.internal.slider

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.util.fastFirst
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.popoverTrigger
import kotlin.math.roundToInt

@Composable
fun BaseSlider(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    value: Float,
    onValueChange: ((Float) -> Unit),
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val state = remember(valueRange) { SliderState(value, valueRange) }
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    state.value = value
    state.onValueChange = onValueChange

    SliderImpl(
        modifier = modifier,
        state = state,
        style = style,
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
                modifier = Modifier
                    .popoverTrigger(triggerInfo),
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
    val indicatorBrush = style.colors.indicatorBrush?.getValue(interactionSource)

    BaseTrackAndIndicator(
        modifier = modifier,
        progress = fraction,
        indicatorBrush = indicatorBrush,
        indicatorColor = null,
        trackBrush = null,
        trackColor = trackColor,
        indicatorThickness = style.dimensions.indicatorThickness,
        trackThickness = style.dimensions.trackThickness,
        indicatorShape = style.indicatorShape,
        trackShape = style.shape,
        orientation = style.orientation,
        direction = style.slideDirection
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
    style: SliderStyle,
    track: @Composable () -> Unit,
    thumb: @Composable () -> Unit,
) {
    val reversed = style.slideDirection == SlideDirection.Reversed
    state.reverse = reversed
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
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val thumbPlaceable = measurables.fastFirst { it.layoutId == THUMB }
            .measure(looseConstraints)
        val trackPlaceable = measurables.fastFirst { it.layoutId == TRACK }
            .measure(looseConstraints)


        val sliderWidth = trackPlaceable.width
        val sliderHeight = maxOf(trackPlaceable.height, thumbPlaceable.height)
        state.updateDimensions(
            thumbWidth = thumbPlaceable.width.toFloat(),
            totalWidth = sliderWidth
        )
        val frac = state.fraction
        val thumbX = if (reversed) {
            ((sliderWidth - thumbPlaceable.width) * (1f - frac)).roundToInt()
        } else {
            ((sliderWidth - thumbPlaceable.width) * frac).roundToInt()
        }
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
private class SliderState(
    value: Float = 0f,
    val valueRange: ClosedFloatingPointRange<Float> = 0f..1f
) {
    private var valueState by mutableFloatStateOf(value)
    private var offsetInitialized = false

    var value: Float
        get() = valueState
        set(newValue) {
            valueState = newValue.coerceIn(valueRange.start, valueRange.endInclusive)
        }
    var onValueChange: ((Float) -> Unit)? = null
    var reverse by mutableStateOf(false)

    var isRtl = false

    // Необработанное смещение полузнка в пикселях
    private var rawOffset by mutableFloatStateOf(0f)

    // Скорректированное смещение полузнка когда тапнули по треку
    private var pressOffset by mutableFloatStateOf(0f)

    private var thumbWidthPx by mutableFloatStateOf(0f)
    private var trackWidthPx by mutableFloatStateOf(0f)

    val fraction: Float
        get() = calcFraction(valueRange.start, valueRange.endInclusive, value)

    fun updateDimensions(thumbWidth: Float, totalWidth: Int) {
        thumbWidthPx = thumbWidth
        trackWidthPx = totalWidth.toFloat() - thumbWidth
        if (!offsetInitialized) {
            rawOffset = if (reverse) trackWidthPx * (1f - fraction) else trackWidthPx * fraction
            offsetInitialized = true
        }
    }

    fun onPress(pos: Offset) {
        pressOffset = pos.x - rawOffset
    }

    fun onDrag(deltaPx: Float) {
        moveToRawOffset(rawOffset + deltaPx + pressOffset)
        pressOffset = 0f
    }

    private fun scaleToOffset(v: Float): Float {
        val frac = calcFraction(valueRange.start, valueRange.endInclusive, v)
        return lerp(start = 0f, stop = trackWidthPx, fraction = frac)

    }

    private fun scaleToValue(px: Float): Float {
        if (trackWidthPx == 0f) return valueRange.start
        val frac = if (reverse) {
            1f - (px / trackWidthPx)
        } else {
            px / trackWidthPx
        }
        return lerp(
            start = valueRange.start,
            stop = valueRange.endInclusive,
            fraction = frac
        )
    }

    private fun moveToRawOffset(newOffset: Float) {
        val clamped = newOffset.coerceIn(0f, trackWidthPx)
        rawOffset = clamped
        value = scaleToValue(clamped)
    }

    private fun calcFraction(start: Float, end: Float, pos: Float) =
        (if (end - start == 0f) 0f else (pos - start) / (end - start)).coerceIn(0f, 1f)

    private fun lerp(start: Float, stop: Float, fraction: Float) =
        start + (stop - start) * fraction

}

private const val THUMB = "thumb"
private const val TRACK = "track"

