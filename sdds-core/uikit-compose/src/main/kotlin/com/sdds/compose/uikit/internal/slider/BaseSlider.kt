package com.sdds.compose.uikit.internal.slider

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.drag
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFirst
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.SliderOrientation
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.ValueFormatTransformer
import com.sdds.compose.uikit.ValueMode
import com.sdds.compose.uikit.ValuePlacement
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.popoverTrigger
import kotlin.math.roundToInt

@Composable
internal fun BaseSlider(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    value: Float,
    thumbEnabled: Boolean,
    onValueChange: ((Float) -> Unit),
    valueFormatTransformer: ValueFormatTransformer = ValueFormatTransformer { it.toString() },
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    slideDirection: SlideDirection = SlideDirection.Normal,
    valueMode: ValueMode = ValueMode.Interaction,
    valuePlacement: ValuePlacement = style.valuePlacement,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val state = remember(valueRange, style.orientation) {
        SliderState(value, valueRange, style.orientation)
    }
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    state.onValueChange = onValueChange

    val maxSizeModifier = if (style.orientation == SliderOrientation.Horizontal) {
        Modifier.fillMaxWidth()
    } else {
        Modifier.fillMaxHeight()
    }

    SliderImpl(
        modifier = modifier,
        state = state,
        style = style,
        slideDirection = slideDirection,
        track = {
            TrackAndIndicator(
                modifier = Modifier
                    .then(maxSizeModifier),
                style = style,
                fraction = { state.fraction },
                slideDirection = slideDirection,
                interactionSource = interactionSource,
            )
        },
        thumb = {
            Thumb(
                modifier = Modifier
                    .popoverTrigger(triggerInfo)
                    .alpha(if (thumbEnabled) 1f else 0f),
                style = style,
                interactionSource = interactionSource,
            )
        },
        tooltip = {
            Tooltip(
                show = if (valueMode == ValueMode.Interaction) state.showTooltip else false,
                modifier = Modifier.widthIn(0.dp, 160.dp),
                triggerInfo = { triggerInfo.value },
                placement = valuePlacement.toPopoverPlacement(),
                triggerCentered = true,
                alignment = PopoverAlignment.Center,
                style = style.tooltipStyle,
                text = AnnotatedString(valueFormatTransformer.transform(state.value)),
                enterTransition = EnterTransition.None,
                exitTransition = ExitTransition.None,
                onDismissRequest = {},
                popupProperties = PopupProperties(
                    clippingEnabled = false,
                    focusable = false,
                    excludeFromSystemGesture = false,
                    usePlatformDefaultWidth = true,
                ),
            )
        },
        interactionSource = interactionSource,
    )
}

@Composable
private fun Thumb(
    modifier: Modifier,
    style: SliderStyle,
    interactionSource: MutableInteractionSource,
) {
    val thumbColor = style.colors.thumbColor.colorForInteraction(interactionSource)
    val strokeColor = style.colors.thumbStrokeColor?.getValue(interactionSource)
    Box(
        modifier
            .size(style.dimensions.thumbSize)
            .background(thumbColor, style.thumbShape)
            .border(style.dimensions.thumbStrokeWidth, strokeColor!!, style.thumbShape),
    )
}

@Composable
private fun TrackAndIndicator(
    modifier: Modifier,
    style: SliderStyle,
    fraction: () -> Float,
    slideDirection: SlideDirection,
    interactionSource: MutableInteractionSource,
) {
    val trackColor = style.colors.trackColor.colorForInteraction(interactionSource)
    val indicatorColor = style.colors.indicatorColor.colorForInteraction(interactionSource)
    val indicatorBrush = style.colors.indicatorBrush?.getValue(interactionSource)

    BaseTrackAndIndicator(
        modifier = modifier,
        progress = fraction,
        indicatorBrush = indicatorBrush,
        indicatorColor = indicatorColor,
        trackBrush = null,
        trackColor = trackColor,
        indicatorThickness = style.dimensions.indicatorThickness,
        trackThickness = style.dimensions.trackThickness,
        indicatorShape = style.indicatorShape,
        trackShape = style.shape,
        orientation = style.orientation,
        direction = slideDirection,
    )
}

private fun Modifier.sliderGestures(
    state: SliderState,
    reverse: Boolean,
    interactionSource: MutableInteractionSource,
) =
    pointerInput(state, reverse) {
        awaitPointerEventScope {
            while (true) {
                val down = awaitFirstDown(requireUnconsumed = true)
                val press = PressInteraction.Press(down.position)
                interactionSource.tryEmit(press)
                val onThumb = state.isPosInsideThumb(down.position)
                if (!onThumb) {
                    state.jumpTo(down.position, reverse)
                }
                state.onPress(down.position)
                state.showTooltip = true
                drag(down.id) { change ->
                    state.onDrag(change.position, reverse)
                    change.consume()
                }
                interactionSource.tryEmit(PressInteraction.Release(press))
                state.showTooltip = false
            }
        }
    }

@Composable
private fun SliderImpl(
    modifier: Modifier,
    state: SliderState,
    style: SliderStyle,
    slideDirection: SlideDirection,
    track: @Composable () -> Unit,
    thumb: @Composable () -> Unit,
    tooltip: @Composable () -> Unit,
    interactionSource: MutableInteractionSource,
) {
    val reversed by remember(slideDirection) {
        mutableStateOf(slideDirection == SlideDirection.Reversed)
    }
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val pressModifier = Modifier.sliderGestures(state, reversed, interactionSource)

    tooltip()
    Layout(
        content = {
            Box(modifier = Modifier.layoutId(THUMB)) { thumb() }
            Box(modifier = Modifier.layoutId(TRACK)) { track() }
        },
        modifier = modifier
            .then(pressModifier),
    ) { measurables, constraints ->
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val thumbPlaceable = measurables.fastFirst { it.layoutId == THUMB }
            .measure(looseConstraints)
        val trackPlaceable = measurables.fastFirst { it.layoutId == TRACK }
            .measure(looseConstraints)

        val width = maxOf(trackPlaceable.width, thumbPlaceable.width)
        val height = maxOf(trackPlaceable.height, thumbPlaceable.height)

        val thumbMainSize = if (isHorizontal) thumbPlaceable.width else thumbPlaceable.height
        val mainAxisSize = if (isHorizontal) trackPlaceable.width else trackPlaceable.height

        val frac = state.fraction
        state.updateDimensions(
            thumbSize = thumbMainSize.toFloat(),
            mainAxisSize = mainAxisSize,
            reverse = reversed,
        )

        val thumbMainOffset = if (reversed) {
            if (isHorizontal) {
                ((mainAxisSize - thumbMainSize) * (1f - frac)).roundToInt()
            } else {
                ((mainAxisSize - thumbMainSize) * frac).roundToInt()
            }
        } else {
            if (isHorizontal) {
                ((mainAxisSize - thumbMainSize) * frac).roundToInt()
            } else {
                ((mainAxisSize - thumbMainSize) * (1f - frac)).roundToInt()
            }
        }

        layout(width, height) {
            if (isHorizontal) {
                trackPlaceable.placeRelative(0, (height - trackPlaceable.height) / 2)
                thumbPlaceable.placeRelative(thumbMainOffset, (height - thumbPlaceable.height) / 2)
            } else {
                trackPlaceable.placeRelative((width - trackPlaceable.width) / 2, 0)
                thumbPlaceable.placeRelative((width - thumbPlaceable.width) / 2, thumbMainOffset)
            }
        }
    }
}

@Stable
private class SliderState(
    initialValue: Float = 0f,
    val valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    val orientation: SliderOrientation = SliderOrientation.Horizontal,
) {
    private var valueState by mutableFloatStateOf(initialValue)
    private var rawOffset = 0f
    private var pressOffset = 0f
    private var thumbSizePx = 0f
    private var trackSizePx = 0f
    var showTooltip by mutableStateOf(false)

    var value: Float
        get() = valueState
        set(newValue) {
            val coerced = newValue.coerceIn(valueRange.start, valueRange.endInclusive)
            if (coerced != valueState) {
                valueState = coerced
                onValueChange?.invoke(coerced)
            }
        }

    var onValueChange: ((Float) -> Unit)? = null

    val fraction: Float
        get() = calcFraction(valueRange.start, valueRange.endInclusive, value)

    fun updateDimensions(thumbSize: Float, mainAxisSize: Int, reverse: Boolean) {
        thumbSizePx = thumbSize
        trackSizePx = mainAxisSize.toFloat() - thumbSize
        rawOffset = calcRawOffset(trackSizePx, reverse)
    }

    fun onPress(pos: Offset) {
        val base = getMainAxisPos(pos)
        pressOffset = base - rawOffset
    }

    fun jumpTo(pos: Offset, reverse: Boolean) {
        val base = getMainAxisPos(pos)
        val centeredOffset = base - thumbSizePx / 2f
        moveToRawOffset(centeredOffset, reverse)
        pressOffset = 0f
    }

    fun onDrag(pos: Offset, reverse: Boolean) {
        val base = getMainAxisPos(pos)
        val newOffset = base - pressOffset
        moveToRawOffset(newOffset, reverse)
    }

    fun isPosInsideThumb(pos: Offset): Boolean {
        val base = getMainAxisPos(pos)
        return base in rawOffset..(rawOffset + thumbSizePx)
    }

    private fun getMainAxisPos(pos: Offset) =
        if (orientation == SliderOrientation.Horizontal) pos.x else pos.y

    private fun calcRawOffset(trackSizePx: Float, reverse: Boolean): Float {
        return if (reverse) {
            if (orientation == SliderOrientation.Horizontal) trackSizePx * (1f - fraction) else trackSizePx * fraction
        } else {
            if (orientation == SliderOrientation.Horizontal) trackSizePx * fraction else trackSizePx * (1f - fraction)
        }
    }

    private fun moveToRawOffset(newOffset: Float, reverse: Boolean) {
        val clamped = newOffset.coerceIn(0f, trackSizePx)
        rawOffset = clamped
        value = scaleToValue(clamped, reverse)
    }

    private fun scaleToValue(px: Float, reverse: Boolean): Float {
        if (trackSizePx == 0f) return valueRange.start
        val frac = if (reverse) {
            if (orientation == SliderOrientation.Horizontal) 1f - (px / trackSizePx) else px / trackSizePx
        } else {
            if (orientation == SliderOrientation.Horizontal) px / trackSizePx else 1f - (px / trackSizePx)
        }
        return lerp(
            start = valueRange.start,
            stop = valueRange.endInclusive,
            fraction = frac,
        )
    }

    private fun calcFraction(start: Float, end: Float, pos: Float) =
        (if (end - start == 0f) 0f else (pos - start) / (end - start)).coerceIn(0f, 1f)

    private fun lerp(start: Float, stop: Float, fraction: Float) =
        start + (stop - start) * fraction
}

private fun ValuePlacement.toPopoverPlacement() =
    when (this) {
        ValuePlacement.Top -> PopoverPlacement.Top
        ValuePlacement.Start -> PopoverPlacement.Start
        ValuePlacement.End -> PopoverPlacement.End
        else -> PopoverPlacement.Bottom
    }

private const val THUMB = "thumb"
private const val TRACK = "track"
