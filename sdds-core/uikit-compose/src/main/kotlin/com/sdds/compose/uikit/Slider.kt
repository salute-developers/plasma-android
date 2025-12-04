package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFirst
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.BaseProgress
import com.sdds.compose.uikit.internal.common.StyledText
import kotlin.math.roundToInt


@Composable
fun Slider(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    value: Float,
    title: String = "",
    labelContent: (@Composable () -> Unit)? = null,
    onValueChange: ((Float) -> Unit),
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    Row {
        Label(
            modifier = Modifier,
            style = style,
            title = title,
            labelContent = labelContent,
            interactionSource = interactionSource
        )

        Slide(
            modifier = Modifier
                .weight(1f),
            style = style,
            value = value,
            onValueChange = onValueChange,
            valueRange = valueRange,
            interactionSource = interactionSource
        )
    }
}


@Composable
fun LimitLabel(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    value: String = "",
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    StyledText(
        modifier = Modifier,
        text = value,
        textStyle = style.limitLabelStyle,
        textColor = style.colors.limitLabelColor.colorForInteraction(interactionSource),
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
fun Label(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    title: String = "",
    labelContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val margin = style.dimensions.titleMargin
    val orientation = style.orientation
    val titleAlignment = style.titleAlignment

    val isHorizontal = orientation == SliderOrientation.Horizontal
    val isTitleFirst = isTitleFirst(titleAlignment)

    val titlePaddings = getTitlePaddings(isHorizontal, titleAlignment, margin)
    val container: @Composable (
        content: @Composable () -> Unit
    ) -> Unit = if (isHorizontal) { content ->
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
        ) { content() }
    } else { content ->
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
        ) { content() }
    }

    container {
        if (isTitleFirst && titleAlignment != TitleAlignment.None) {
            if (title.isNotBlank()) {
                StyledText(
                    modifier = Modifier
                        .padding(titlePaddings),
                    text = title,
                    textStyle = style.titleStyle,
                    textColor = style.colors.titleColor.colorForInteraction(interactionSource),
                    overflow = TextOverflow.Ellipsis,
                )
            }
            labelContent?.let {
                Box {
                    val iconSize = style.dimensions.iconSize
                    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
                    CompositionLocalProvider(
                        LocalTint provides iconColor,
                        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
                    ) {
                        labelContent.invoke()
                    }
                }
            }
        } else {
            labelContent?.let {
                Box {
                    val iconSize = style.dimensions.iconSize
                    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
                    CompositionLocalProvider(
                        LocalTint provides iconColor,
                        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
                    ) {
                        labelContent.invoke()
                    }
                }
            }
            if (title.isNotBlank()) {
                StyledText(
                    modifier = Modifier,
                    text = title,
                    textStyle = style.titleStyle,
                    textColor = style.colors.titleColor.colorForInteraction(interactionSource),
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }



}

private fun isTitleFirst(titleAlignment: TitleAlignment) = when (titleAlignment) {
    TitleAlignment.Start -> true
    else -> false
}

private fun getTitlePaddings(
    isHorizontal: Boolean,
    titleAlignment: TitleAlignment,
    margin: Dp,
) = when {
    titleAlignment == TitleAlignment.None -> PaddingValues(0.dp)
    isHorizontal && titleAlignment == TitleAlignment.End -> PaddingValues(start = margin)
    isHorizontal && titleAlignment == TitleAlignment.Start -> PaddingValues(end = margin)
    !isHorizontal && titleAlignment == TitleAlignment.End -> PaddingValues(top = margin)
    else -> PaddingValues(bottom = margin)
}


@Composable
fun Slide(
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
    state.reverse = false
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
            .measure(constraints.copy(minWidth = 0, minHeight = 0))
        val trackPlaceable = measurables.fastFirst { it.layoutId == TRACK }
            .measure(constraints.copy(minWidth = 0, minHeight = 0))

        val sliderWidth = trackPlaceable.width
        val sliderHeight = maxOf(trackPlaceable.height, thumbPlaceable.height)
        state.updateDimensions(
            thumbWidth = thumbPlaceable.width.toFloat(),
            totalWidth = sliderWidth
        )
        val frac = state.fraction
        val thumbX = if (state.reverse) {
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
class SliderState(
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
    internal var onValueChange: ((Float) -> Unit)? = null
    internal var reverse by mutableStateOf(false)

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
        if (!offsetInitialized) {
            rawOffset = if (reverse) trackWidthPx * (1f - fraction) else trackWidthPx * fraction
            offsetInitialized = true
        }
    }

    internal fun onPress(pos: Offset) {
        pressOffset = pos.x - rawOffset
    }

    internal fun onDrag(deltaPx: Float) {
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

enum class SliderOrientation {
    Horizontal,
    Vertical,
}

enum class TitleAlignment {
    None,
    Start,
    End,
}

enum class LabelAlignment {
    Top,
    Center,
    Bottom,
}

enum class Alignment {
    Start,
    Center,
    End,
}

enum class LimitLabelAlignment {
    Start,
    Center,
    End,
}

enum class SlideDirection {
    Normal,
    Reversed,
}

enum class ValuePlacement {
    Start,
    Top,
    End,
    Bottom,
}


private const val THUMB = "thumb"
private const val TRACK = "track"