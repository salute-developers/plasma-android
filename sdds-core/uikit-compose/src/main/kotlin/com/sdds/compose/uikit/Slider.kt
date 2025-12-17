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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.slider.BaseSlider

/**
 * Компонент Slider.
 * Применяется для указания значения (value) из заданного диапозона.
 * Представляет собой полосу прогресса совместно с Label, блоком, включающим в себя заголовок (title)
 * и иконку (labelContent), с возможностью конфигурирования расположения этих блоков.
 *
 * @param modifier модификатор для контейнера Slider
 * @param style стиль компонента
 * @param value начальное значение прогресса
 * @param title текст заголовка
 * @param labelContent контент расположенный рядом с заголовком, как правило - иконка
 * @param onValueChange колбэк изменения прогрессса
 * @param valueFormatTransformer лямбда форматирующая значение (value) прогресса, а так же
 * отображение граничных значений.
 * @param thumbEnabled отображение ползунка (thumb) на полосе прогресса
 * @param labelEnabled отображение блока Label
 * @param limitLabelEnabled отображение лэйблов с граничными значениями
 * @param slideDirection направление slide
 * @param valueRange диапазон значений полосы прогресса (от минимального до максимального значений)
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Slider(
    modifier: Modifier = Modifier,
    style: SliderStyle = LocalSliderStyle.current,
    value: Float = 0f,
    title: String = "",
    labelContent: (@Composable () -> Unit)? = null,
    onValueChange: ((Float) -> Unit),
    valueFormatTransformer: ValueFormatTransformer = ValueFormatTransformer { it.toString() },
    thumbEnabled: Boolean = true,
    labelEnabled: Boolean = true,
    limitLabelEnabled: Boolean = true,
    slideDirection: SlideDirection = style.slideDirection,
    alignment: SliderAlignment = style.alignment,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val textColor = style.colors.limitLabelColor.colorForInteraction(interactionSource)

    ContainerComposition(
        modifier = modifier,
        style = style,
        alignment = alignment,
        reversed = slideDirection == SlideDirection.Reversed,
        label = {
            if (labelEnabled) {
                Label(
                    modifier = Modifier,
                    style = style,
                    alignment = alignment,
                    title = title,
                    content = labelContent,
                    interactionSource = interactionSource,
                )
            }
        },
        minLabel = {
            if (limitLabelEnabled) {
                StyledText(
                    modifier = Modifier,
                    text = valueFormatTransformer.transform(valueRange.start),
                    textStyle = style.limitLabelStyle,
                    textColor = textColor,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        },
        maxLabel = {
            if (limitLabelEnabled) {
                StyledText(
                    modifier = Modifier,
                    text = valueFormatTransformer.transform(valueRange.endInclusive),
                    textStyle = style.limitLabelStyle,
                    textColor = textColor,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        },
        centerContent = {
            BaseSlider(
                modifier = Modifier,
                style = style,
                value = value,
                onValueChange = onValueChange,
                valueFormatTransformer = valueFormatTransformer,
                valueRange = valueRange,
                slideDirection = slideDirection,
                thumbEnabled = thumbEnabled,
            )
        },
    )
}

/**
 * Преобразователь формата отображаемого прогресса
 */
fun interface ValueFormatTransformer {

    /**
     * Колбэк изменения формата
     * @param value текущее значение прогресса
     */
    fun transform(value: Float): String
}

/**
 * Расположение полосы прогресса
 */
enum class SliderOrientation {

    /**
     * Горизонтальное расположение
     */
    Horizontal,

    /**
     * Вертикальное расположение
     */
    Vertical,
}

/**
 * Заголовка в блоке Label
 */
enum class TitleAlignment {

    /**
     * Заголовок не отображается
     */
    None,

    /**
     * Заголовок вначале
     */
    Start,

    /**
     * Заголовок вконце
     */
    End,
}

/**
 * Расположение блока Label относительно полосы прогресса
 */
enum class LabelAlignment {

    /**
     * Расположение блока Label над полосой прогресса
     */
    Top,

    /**
     * Расположение блока Label на одном уровне с полосой прогресса
     * в горизонтальной оринетации
     */
    Center,

    /**
     * Расположение блока Label под полосой прогресса
     */
    Bottom,
}

/**
 * Выравнивание всего контента (работает как Gravity)
 */
enum class SliderAlignment {

    /**
     * Выравнивает весь контент к началу
     */
    Start,

    /**
     * Выравнивает весь контент по центру
     */
    Center,

    /**
     * Выравнивает весь контент к концу
     */
    End,
}

/**
 * Расположение лэйблов ограничений
 */
enum class LimitLabelAlignment {

    /**
     * Расположение сверху или вначале
     */
    Start,

    /**
     * Расположение в одну линию со Slider
     */
    Center,

    /**
     * Расположение снизу или вконце
     */
    End,
}

/**
 * Направление slide
 */
enum class SlideDirection {

    /**
     * Увеличение значения происходит слева направо, либо снизу вверх
     */
    Normal,

    /**
     * Увеличение значения происходит справо налево, либо сверху вниз
     */
    Reversed,
}

/**
 * Расположение текста установленного значения
 */
enum class ValuePlacement {

    /**
     * Расположение вначале
     */
    Start,

    /**
     * Расположение сверху
     */
    Top,

    /**
     * Расположение вконце
     */
    End,

    /**
     * Расположение снизу
     */
    Bottom,
}

@Composable
private fun Label(
    modifier: Modifier = Modifier,
    style: SliderStyle,
    alignment: SliderAlignment,
    title: String = "",
    content: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource,
) {
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val iconSize = style.dimensions.iconSize
    val titleColor = style.colors.titleColor.colorForInteraction(interactionSource)
    val tMargin = style.dimensions.titleMargin
    val lMargin = style.dimensions.labelMargin
    val titleAlignment = style.titleAlignment

    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val isTitleFirst = isTitleFirst(titleAlignment)
    val labelPaddings = getLabelPaddings(isHorizontal, style.labelAlignment, alignment, lMargin)
    val isLabelHorizontal = isHorizontal || style.alignment != SliderAlignment.Center
    val titlePaddings = getTitlePaddings(isLabelHorizontal, titleAlignment, tMargin)
    val container: @Composable (
        labelContent: @Composable () -> Unit,
    ) -> Unit = if (isLabelHorizontal) {
        { labelContent ->
            Row(
                modifier = modifier
                    .padding(labelPaddings),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) { labelContent() }
        }
    } else {
        { labelContent ->
            Column(
                modifier = modifier
                    .padding(labelPaddings),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) { labelContent() }
        }
    }
    container {
        if (titleAlignment != TitleAlignment.None) {
            if (isTitleFirst) {
                LabelTitle(titlePaddings, title, style.titleStyle, titleColor)
                LabelContent(iconColor, iconSize, content)
            } else {
                LabelContent(iconColor, iconSize, content)
                LabelTitle(titlePaddings, title, style.titleStyle, titleColor)
            }
        } else {
            LabelContent(iconColor, iconSize, content)
        }
    }
}

@Composable
private fun LabelTitle(
    paddingValues: PaddingValues,
    text: String,
    textStyle: TextStyle,
    textColor: Color,
) {
    if (text.isNotBlank()) {
        StyledText(
            modifier = Modifier.padding(paddingValues),
            text = text,
            textStyle = textStyle,
            textColor = textColor,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun LabelContent(
    iconColor: Color,
    iconSize: Dp,
    content: (@Composable () -> Unit)? = null,
) {
    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
    CompositionLocalProvider(
        LocalTint provides iconColor,
        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
    ) {
        content?.invoke()
    }
}

private fun isTitleFirst(titleAlignment: TitleAlignment) = titleAlignment == TitleAlignment.Start

private fun getLabelPaddings(
    isHorizontal: Boolean,
    labelAlignment: LabelAlignment,
    alignment: SliderAlignment,
    margin: Dp,
) = when {
    isHorizontal && labelAlignment == LabelAlignment.Top -> PaddingValues(bottom = margin)
    isHorizontal && labelAlignment == LabelAlignment.Bottom -> PaddingValues(top = margin)
    isHorizontal && labelAlignment == LabelAlignment.Center -> {
        when (alignment) {
            SliderAlignment.End -> PaddingValues(start = margin)
            else -> PaddingValues(end = margin)
        }
    }

    else -> {
        when (labelAlignment) {
            LabelAlignment.Bottom -> PaddingValues(top = margin)
            else -> PaddingValues(bottom = margin)
        }
    }
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
    reversed: Boolean,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    centerContent: (@Composable () -> Unit)? = null,
) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val limitLA = style.limitLabelAlignment

    val columnAlignment = getLimitsColumnAlignment(limitLA)
    if (isHorizontal) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (reversed) {
                maxLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) { it.invoke() }
                } ?: Spacer(Modifier.weight(1f))
                minLabel()
            } else {
                minLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) { it.invoke() }
                } ?: Spacer(Modifier.weight(1f))
                maxLabel()
            }
        }
    } else {
        Column(
            modifier = modifier,
            horizontalAlignment = columnAlignment,
        ) {
            if (reversed) {
                minLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) { it.invoke() }
                } ?: Spacer(Modifier.weight(1f))
                maxLabel()
            } else {
                maxLabel()
                centerContent?.let {
                    Box(Modifier.weight(1f)) { it.invoke() }
                } ?: Spacer(Modifier.weight(1f))
                minLabel()
            }
        }
    }
}

private fun getLimitsColumnAlignment(limitLA: LimitLabelAlignment) = when (limitLA) {
    LimitLabelAlignment.Start -> Alignment.End
    LimitLabelAlignment.Center -> Alignment.CenterHorizontally
    else -> Alignment.Start
}

private fun getSliderPaddings(
    style: SliderStyle,
): PaddingValues {
    val margin = style.dimensions.limitLabelMargin
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val thickness = maxOf(style.dimensions.trackThickness, style.dimensions.indicatorThickness)
    val thumbOffset = (style.dimensions.thumbSize - thickness) / 2
    val marginFromThumb = if (thumbOffset > margin) 0.dp else margin - thumbOffset
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Center -> {
            if (isHorizontal) {
                PaddingValues(horizontal = margin)
            } else {
                PaddingValues(vertical = margin)
            }
        }

        LimitLabelAlignment.Start -> {
            if (isHorizontal) {
                PaddingValues(top = marginFromThumb)
            } else {
                PaddingValues(start = marginFromThumb)
            }
        }

        else -> {
            if (isHorizontal) {
                PaddingValues(bottom = marginFromThumb)
            } else {
                PaddingValues(end = marginFromThumb)
            }
        }
    }
}

@Composable
private fun SliderWithLimits(
    modifier: Modifier,
    style: SliderStyle,
    reversed: Boolean,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    centerContent: @Composable () -> Unit,
) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val limitLA = style.limitLabelAlignment
    val paddings = getSliderPaddings(style)
    val wrappedContent: @Composable () -> Unit = { Box(Modifier.padding(paddings)) { centerContent() } }
    if (isHorizontal) {
        when (limitLA) {
            LimitLabelAlignment.Center -> LimitLabelBlock(
                modifier,
                style,
                reversed,
                minLabel,
                maxLabel,
                wrappedContent,
            )

            else -> {
                Column(modifier = modifier) {
                    if (limitLA == LimitLabelAlignment.Start) {
                        LimitLabelBlock(Modifier, style, reversed, minLabel, maxLabel)
                        wrappedContent()
                    } else {
                        wrappedContent()
                        LimitLabelBlock(Modifier, style, reversed, minLabel, maxLabel)
                    }
                }
            }
        }
    } else {
        when (limitLA) {
            LimitLabelAlignment.Center -> LimitLabelBlock(
                modifier,
                style,
                reversed,
                minLabel,
                maxLabel,
                wrappedContent,
            )

            else -> {
                Row(modifier = modifier) {
                    if (limitLA == LimitLabelAlignment.Start) {
                        LimitLabelBlock(Modifier, style, reversed, minLabel, maxLabel)
                        wrappedContent()
                    } else {
                        wrappedContent()
                        LimitLabelBlock(Modifier, style, reversed, minLabel, maxLabel)
                    }
                }
            }
        }
    }
}

@Composable
private fun ContainerComposition(
    modifier: Modifier,
    style: SliderStyle,
    alignment: SliderAlignment,
    reversed: Boolean,
    label: @Composable () -> Unit,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    centerContent: (@Composable () -> Unit),
) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val labelA = style.labelAlignment
    val columnAlignment = getContentColumnAlignment(alignment)
    if (isHorizontal) {
        when (labelA) {
            LabelAlignment.Center -> {
                Row(
                    modifier = modifier,
                    verticalAlignment = Alignment.Top,
                ) {
                    if (alignment == SliderAlignment.Start || alignment == SliderAlignment.Center) {
                        label()
                        SliderWithLimits(Modifier.weight(1f), style, reversed, minLabel, maxLabel, centerContent)
                    } else {
                        SliderWithLimits(Modifier.weight(1f), style, reversed, minLabel, maxLabel, centerContent)
                        label()
                    }
                }
            }

            else -> {
                Column(
                    modifier = modifier,
                    horizontalAlignment = if (alignment != SliderAlignment.Center) {
                        columnAlignment
                    } else {
                        Alignment.Start
                    },
                ) {
                    if (labelA == LabelAlignment.Top) {
                        label()
                        SliderWithLimits(Modifier, style, reversed, minLabel, maxLabel, centerContent)
                    } else {
                        SliderWithLimits(Modifier, style, reversed, minLabel, maxLabel, centerContent)
                        label()
                    }
                }
            }
        }
    } else {
        Column(
            modifier = modifier,
            horizontalAlignment = columnAlignment,
        ) {
            if (labelA == LabelAlignment.Bottom) {
                SliderWithLimits(Modifier.weight(1f), style, reversed, minLabel, maxLabel, centerContent)
                label()
            } else {
                label()
                SliderWithLimits(Modifier.weight(1f), style, reversed, minLabel, maxLabel, centerContent)
            }
        }
    }
}

private fun getContentColumnAlignment(alignment: SliderAlignment) = when (alignment) {
    SliderAlignment.Start -> Alignment.Start
    SliderAlignment.End -> Alignment.End
    else -> Alignment.CenterHorizontally
}
