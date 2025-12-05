package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.slider.BaseSlider

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
    val textColor = style.colors.limitLabelColor.colorForInteraction(interactionSource)

    ContainerComposition(
        modifier = Modifier,
        style = style,
        label = {
            Label(
                modifier = Modifier,
                style = style,
                title = title,
                content = labelContent,
                interactionSource = interactionSource
            )
        },
        minLabel = {
            StyledText(
                modifier = Modifier,
                text = valueRange.start.toString(),
                textStyle = style.limitLabelStyle,
                textColor = textColor,
                overflow = TextOverflow.Ellipsis,
            )
        },
        maxLabel = {
            StyledText(
                modifier = Modifier,
                text = valueRange.endInclusive.toString(),
                textStyle = style.limitLabelStyle,
                textColor = textColor,
                overflow = TextOverflow.Ellipsis,
            )
        },
        centerContent = {
            BaseSlider(
                modifier = Modifier,
                style = style,
                value = value,
                onValueChange = onValueChange,
                valueRange = valueRange,
                interactionSource = interactionSource
            )
        },
    )
}

@Composable
private fun Label(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    title: String = "",
    content: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val iconSize = style.dimensions.iconSize
    val titleColor = style.colors.titleColor.colorForInteraction(interactionSource)
    val margin = style.dimensions.titleMargin
    val orientation = style.orientation
    val titleAlignment = style.titleAlignment

    val isHorizontal = orientation == SliderOrientation.Horizontal
    val isTitleFirst = isTitleFirst(titleAlignment)

    val titlePaddings = getTitlePaddings(isHorizontal, titleAlignment, margin)
    val container: @Composable (
        labelContent: @Composable () -> Unit
    ) -> Unit = if (isHorizontal) { labelContent ->
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) { labelContent() }
    } else { labelContent ->
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) { labelContent() }
    }

    container {
        if (isTitleFirst && titleAlignment != TitleAlignment.None) {
            if (title.isNotBlank()) {
                StyledText(
                    modifier = Modifier.padding(titlePaddings),
                    text = title,
                    textStyle = style.titleStyle,
                    textColor = titleColor,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            content?.let {
                LabelContent(iconColor, iconSize, content)
            }
        } else {
            content?.let {
                LabelContent(iconColor, iconSize, content)
            }
            if (title.isNotBlank()) {
                StyledText(
                    modifier = Modifier.padding(titlePaddings),
                    text = title,
                    textStyle = style.titleStyle,
                    textColor = titleColor,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Composable
private fun LabelContent(
    iconColor: Color,
    iconSize: Dp,
    content: (@Composable () -> Unit)? = null
) {
    Box {
        val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
        CompositionLocalProvider(
            LocalTint provides iconColor,
            LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
        ) {
            content?.invoke()
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
private fun LimitLabelBlock(
    modifier: Modifier,
    style: SliderStyle,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    centerContent: (@Composable () -> Unit)? = null,
) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val limitLA = style.limitLabelAlignment
    val reversed = style.slideDirection == SlideDirection.Reversed

    val columnAlignment = getLimitsColumnAlignment(limitLA)
    if (isHorizontal) {
        if (reversed) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                maxLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) { it.invoke() }
                } ?: Spacer(Modifier.weight(1f))
                minLabel()
            }
        } else {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                minLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) { it.invoke() }
                } ?: Spacer(Modifier.weight(1f))
                maxLabel()
            }
        }
    } else {
        if (reversed) {
            Column(
                modifier = modifier,
                horizontalAlignment = columnAlignment,
            ) {
                maxLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) {it.invoke()}
                } ?: Spacer(Modifier.weight(1f))
                minLabel()
            }
        } else {
            Column(
                modifier = modifier,
                horizontalAlignment = columnAlignment,
            ) {
                minLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) {it.invoke()}
                } ?: Spacer(Modifier.weight(1f))
                maxLabel()
            }
        }
    }
}

private fun getLimitsColumnAlignment(limitLA: LimitLabelAlignment) = when (limitLA) {
    LimitLabelAlignment.Start -> Alignment.End
    LimitLabelAlignment.Center -> Alignment.CenterHorizontally
    else -> Alignment.End
}

@Composable
private fun SliderWithLimits(
    style: SliderStyle,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    centerContent: @Composable () -> Unit,
) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val limitLA = style.limitLabelAlignment
    if (isHorizontal) {
        when (limitLA) {
            LimitLabelAlignment.Start -> {
                Column {
                    LimitLabelBlock(Modifier, style, minLabel, maxLabel)
                    centerContent()
                }
            }

            LimitLabelAlignment.End -> {
                Column {
                    centerContent()
                    LimitLabelBlock(Modifier, style, minLabel, maxLabel)
                }
            }

            else -> LimitLabelBlock(Modifier, style, minLabel, maxLabel, centerContent)
        }
    } else {
        when (limitLA) {
            LimitLabelAlignment.Start -> {
                Row {
                    LimitLabelBlock(Modifier, style, minLabel, maxLabel)
                    centerContent()
                }
            }

            LimitLabelAlignment.End -> {
                Row {
                    centerContent()
                    LimitLabelBlock(Modifier, style, minLabel, maxLabel)
                }
            }

            else -> LimitLabelBlock(Modifier, style, minLabel, maxLabel, centerContent)
        }
    }
}

@Composable
private fun ContainerComposition(
    modifier: Modifier,
    style: SliderStyle,
    label: @Composable () -> Unit,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    centerContent: (@Composable () -> Unit),
) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val labelA = style.labelAlignment
    val alignment = style.alignment
    val columnAlignment = getContentColumnAlignment(alignment)
    if (isHorizontal) {
        when (labelA) {
            LabelAlignment.Center -> {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    label()
                    SliderWithLimits(style, minLabel, maxLabel, centerContent)
                }
            }

            LabelAlignment.Top -> {
                Column(
                    horizontalAlignment = if (alignment != com.sdds.compose.uikit.Alignment.Center) columnAlignment
                    else Alignment.Start
                ) {
                    label()
                    SliderWithLimits(style, minLabel, maxLabel, centerContent)
                }
            }

            else -> {
                Column(
                    horizontalAlignment = if (alignment != com.sdds.compose.uikit.Alignment.Center) columnAlignment
                    else Alignment.Start
                ) {
                    SliderWithLimits(style, minLabel, maxLabel, centerContent)
                    label()
                }
            }
        }
    }
}

private fun getContentColumnAlignment(alignment: com.sdds.compose.uikit.Alignment) = when (alignment) {
    com.sdds.compose.uikit.Alignment.Start -> Alignment.Start
    com.sdds.compose.uikit.Alignment.End -> Alignment.End
    else -> Alignment.CenterHorizontally
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